/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void recoverTree(TreeNode root) {
		if(root==null) return root;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode prev=null;
		TreeNode first=null;
		TreeNode last=null;
		boolean flag=false;
		while(!s.isEmpty()){
			TreeNode curr = s.peek();
			if(prev==null || prev.left==curr || prev.right==curr){
				if(curr.left!=null){
					s.push(curr.left);
				}else if(curr.right!=null){
					s.push(curr.right);
					if(prev!=null && curr.val<prev.val){
						if(first==null){
							first=prev;
						}else{
							second=curr;
							break;
						}
					}
				}else{
					if(prev!=null && curr.val<prev.val){
						if(first==null){
							first=prev;
						}else{
							second=curr;
							break;
						}
					}
					s.pop();
				}
			}else if(prev==curr.left){
				if(prev!=null && curr.val<prev.val){
					if(first==null){
						first=prev;
					}else{
						second=curr;
						break;
					}
				}
				if(curr.right!=null){
					s.push(curr.right);
				}
			}else if(prev==curr.right){
				if(prev!=null && curr.val<prev.val){
					if(first==null){
						first=prev;
					}else{
						second=curr;
						break;
					}
				}
				s.pop();
			}
		}
		int temp = first.val;
		first.val=second.val;
		second.val=temp;
    }
}


public class Solution {
	TreeNode first=null;
	TreeNode second=null;
	TreeNode prev = null;
    public void recoverTree(TreeNode root) {
		if(root==null) return;
		inorder(root);
		int temp = first.val;
		first.val=second.val;
		second.val = temp;
	}
	public void inorder(TreeNode root){
		if(root==null) return;
		inorder(root.left);
		if(prev!=null && prev.val>root.val){
			if(first==null){
				first=prev;
				second=root;
			}else{
				second=root;
			}
		}
		prev=root;
		inorder(root.right);
		
	}


}