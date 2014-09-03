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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if(root==null) return ret;
		helper(ret,root,1);
		return ret;
    }
	public void helper(ArrayList<ArrayList<Integer>> ret, TreeNode root, int lvl){
		if(root==null) return;
		if(lvl>ret.size()){
			ArrayList<Integer> t = new ArrayList<Integer>();
			ret.add(t);
		}
		ArrayList<Integer> a = ret.get(lvl-1);
		a.add(root.val);
		helper(ret,root.left,lvl+1);
		helper(ret,root.right,lvl+1);
	}
}

