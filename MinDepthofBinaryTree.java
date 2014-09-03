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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;  
        int lmin = minDepth(root.left);  
        int rmin = minDepth(root.right);  
        if(lmin ==0 && rmin ==0) return 1;  
        if(lmin ==0)  return rmin+1;
        if(rmin ==0)  return lmin+1;
        return Math.min(lmin, rmin) +1;  
    }
}
    public int minDepth(TreeNode root) {
		if(root==null) return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		if(left==0) return right+1
		return math,min(left,right)+1;