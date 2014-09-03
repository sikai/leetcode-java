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
	    public ArrayList<Integer> inorderTraversal(TreeNode root) {
			ArrayList<Integer> ret = new ArrayList<Integer>();
			if(root==null) return ret;
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode prev = null;
			stack.push(root);
			while(!stack.isEmpty()){
				TreeNode curr = stack.peek();
				if(prev==null || curr==prev.left || curr==prev.right){
					if(curr.left!=null){
						stack.push(curr.left);
					}else if(curr.right!=null){
						ret.add(curr.val);
						stack.push(curr.right);
					}else{
						ret.add(curr.val);
						stack.pop();
					}
				}else if(prev ==curr.left){
					if(curr.right!=null){
						ret.add(curr.val);
						stack.push(curr.right);
					}else{
						ret.add(curr.val);
						stack.pop();
					}
				}else if(prev==curr.right){
					stack.pop();
				}
				prev=curr;
			}
			return ret;
	    }	
	}
	
	
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		if(root==null) return null;
		TreeNode prev = null;
		ArrayList<Integer> ret = new ArrayList<Integer>();
		while(root!=null){
			if(prev==root.parent){
				if(root.left!=null){
					prev=root;
					root=root.left;
					continue;
				}else{
					prev=null;
				}
			}
			if(prev==root.left){
				ret.add(root.val);
				if(root.right!=null){
					prev=root;
					root=root.right;
				}else{
					prev==null;
				}
			}
			if(prev==root.right){
				prev=root;
				root=root.parent;
			}
		}	
		return ret;
	}
	
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		if(root==null) return null;
		ArrayList<Integer> ret = new ArrayList<Integer>();
		while(root!=null){
			if(root.left==null){
				ret.add(root.val);
				root=root.right;
			}else{
				TreeNode temp = root.left;
				TreeNode rightmost = root.left;
				while(rightmost.right!=null){
					rightmost = rightmost.right;
				}
				rightmost.right=root;
				root.left=null;
				root=temp;
			}
		}	
		return ret;
	}
	