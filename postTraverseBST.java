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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if(root==null) return ret;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode prev = null;
		while(!s.isEmpty()){
			TreeNode curr = s.peek();
			if(prev==null || curr==prev.left || curr==prev.right){
				if(curr.left!=null){
					s.push(curr.left);
				}else if(curr.right!=null){
					s.push(curr.right);
				}else{
					ret.add(curr.val);
					s.pop();
				}
			}else if(curr.left==prev){
				if(curr.right!=null){
					s.push(curr.right);
				}else{
					ret.add(curr.val);
					s.pop();
				}
			}else if(curr.right==prev){
				ret.add(curr.val);
				s.pop();
			}
			prev = curr;
		}
		return ret;
    }
}

	
	
	
	
	
	
	