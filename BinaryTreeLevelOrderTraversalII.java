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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if(root == null) return ret;
		helper(ret, root,1);
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> b: ret){
			a.add(0,b);
		}
		return a;
    }

	public void helper(ArrayList<ArrayList<Integer>> ret, TreeNode root, int lvl){
		if(root==null) return;
		if(lvl>ret.size()){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			ret.add(temp);
		}
		ArrayList<Integer> inter = ret.get(lvl-1);
		inter.add(root.val);
		helper(ret,root.left,lvl+1);
		helper(ret,root.right.lvl+1); 
	}
}

