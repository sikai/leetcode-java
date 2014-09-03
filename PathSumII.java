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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		dfs(ret,inter,root,sum);
		return ret;
    }
	public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, TreeNode root, int sum){
		if(root==null) return;
		if(root.left==null && root.right==null){
		    inter.add(root.val);
			if(root.val==sum){
				ArrayList<Integer> temp = new ArrayList<Integer>(inter);
				ret.add(temp);
			}
			return;
		}
		inter.add(root.val);
		if(root.left!=null){
		    dfs(ret,inter,root.left,sum-root.val);
		    inter.remove(inter.size()-1);
		}
		if(root.right!=null){
		    dfs(ret,inter,root.right,sum-root.val);
		    inter.remove(inter.size()-1);
		}
	}
}
