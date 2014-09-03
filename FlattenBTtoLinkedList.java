/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution{
	public void flatten(TreeNode root){
		if(root==null) return;
		TreeNode left = root.left;
		TreeNode right = root.right;
		if(left!=null){
		    root.right=left;
		    root.left=null;
			TreeNode rightmost = left;
			while(rightmost.right!=null){
				rightmost = rightmost.right;
			}
			rightmost.right=right;
		}
		root=root.right;
		flatten(root);
	}

    public void flatten2(TreeNode root) {
		if(root==null) return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode p = root;
		while(!s.isEmpty() || p!=null){
			if(p.left!=null){
				if(p.right!=null) s.push(p.right);
				p.right = p.left;
				p.left=null;
			}else if(p.right==null){
				if(s.isEmpty()) break;
				TreeNode t = s.pop();
				p.right=t;
			}
			p = p.right;
		}
    }
}












