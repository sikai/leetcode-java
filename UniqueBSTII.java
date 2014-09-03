/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int n) {
   		ArrayList<TreeNode> ret = new ArrayList<TreeNode>();
		ret = helper(1,n);
		return ret;
    }
	public ArrayList<TreeNode> helper(int start, int end){
		ArrayList<TreeNode> ret = new ArrayList<TreeNode>();
		if(start>end){
		    ret.add(null);
		    return ret;
		}
		for(int i=start;i<=end;i++){
			ArrayList<TreeNode> leftSub = helper(start,i-1);
			ArrayList<TreeNode> rightSub = helper(i+1,end);
			for(TreeNode left: leftSub){
				for(TreeNode right: rightSub){
					TreeNode root = new TreeNode(i);
					root.left=left;
					root.right=right;
					ret.add(root);
				}
			}
		}
		return ret;
	}
}

public ArrayList<TreeNode> generateTrees(int n) {
	ArrayList<TreeNode> ret = new ArrayList<TreeNode>();
	helper(ret,1,n);
}
public ArrayList<TreeNode> helper(int start, int end){
	ret;
	if(start>end){
		ret.add(null);
		return ret;
	}
	for(int i=start;i<=end;i++){
		ArrayList<TreeNode> leftSub = helper(start,i-1);
		ArrayList<TreeNode> rightSub = helper(i+1,end);
		
		for(TreeNode left:leftSub){
			for(TreeNode right:rightSub){
				TreeNode root = new TreeNode(i);
				root.left=left;
				root.right=right;
				ret.add(root);
			}
		}
	}
}




