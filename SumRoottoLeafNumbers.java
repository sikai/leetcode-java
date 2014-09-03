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
	int sum=0;
    public int sumNumbers(TreeNode root) {
 		if(root==null) return 0;
		String inter = "";
		helper(root,inter);
		return sum;
    }
	public void helper(TreeNode root, String inter){
		if(root==null) return;
		if(root.left==null && root.right==null){
			inter+=Integer.toString(root.val);
			sum+=Integer.parseInt(inter);
			return;
		}
		inter+=Integer.toString(root.val);
		helper(root.left,inter);
		helper(root.right,inter);
	}
}
