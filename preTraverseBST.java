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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
		helper(ret,root);
		return ret; 
    }
	public void helper(ArrayList<Integer> ret, TreeNode root){
		if(root==null) return;
		ret.add(root.val);
		helper(ret, root.left);
		helper(ret, root.right);
	}
	
	public ArrayList<Integer> preorderTraversal(TreeNode root){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if(root==null) return ret;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode prev = null;
		while(!stack.isEmpty()){
			TreeNode curr = stack.peek();
			if(prev==null || curr==prev.left || curr==prev.right){
				ret.add(curr.val);
				if(curr.left!=null){
					stack.push(curr.left);
				}else if(curr.right!=null){
					stack.push(curr.right);	
				}else{
					stack.pop();
				}
			}
			else if(prev==curr.left){
				if(curr.right!=null){
					stack.push(curr.right);
				}else{
					stack.pop();
				}
			}else if(prev==curr.right){
				stack.pop();
			}
			prev=curr;
		}
	}
}

