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
    public int maxPathSum(TreeNode root) {
		if(root==null) return 0;
		Wrapper w = new Wrapper(Integer.MIN_VALUE);
		helper(root,w);
		return w.max;
	}
	public int helper(TreeNode root, Wrapper w){
		if(root==null) return 0;
		int left = helper(root.left,w);
		int right = helper(root.right,w);
		int arc = left+right+root.val;
		int single = Math.max(root.val, root.val+Math.max(left,right));
		w.max=Math.max(w.max,Math.max(arc,single));
		return single;
	}
	class Wrapper{
		int max;
		public Wrapper(int i){
			max=i;
		}
	}
}

public ArrayList<ArrayList<Integer>> targetSumStartFromAnyWhere(TreeNode root, int target){
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	if(root==null) return ret;
	int depth = depth(root);
	int[] path = new int[depth];
	helper(ret,root,path,target,0);
}
public void helper(ArrayList<ArrayList<Integer>> ret, TreeNode root, int[] path, int target, int lvl){
	if(root==null) return;
	path[lvl] = root.val;
	int t=0;
	for(int i=lvl;i>=0;i--){
		t+=path[i];
		if(t==target){
			ArrayList<Integer> t = new ArrayList<Integer>();
			for(int j=i;j<=lvl;j++){
				t.add(path[j]);
			}
			ret.add(t);
		}
	}
	helper(ret,root.left,path,target,lvl+1);
	helper(ret,root.right,path.target,lvl+1);
}



public ArrayList<ArrayList<Integer>> targetSumStartFromAnyWhere(TreeNode root, int target){
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	if(root==null) return ret;
	int[] path = new int[h];
	helper(ret,root,target,path,0);
	
}
public void helper(ArrayList<ArrayList<Integer>> ret, TreeNode root, int target, int[] path, int lvl){
	if(root==null) return;
	path[lvl] = root.val;
	int t = 0;
	for(int i=lvl;i>=0;i--){
		t+=path[i];
		if(t==target){
			ArrayList<Integer> inter = new ArrayList<Integer>();
			for(int j=i;j<=lvl;j++){
				inter.add(path[j]);
			}
			ret.add(inter);
		}
	}
	helper(ret,root.left,target,path,lvl+1);
	helper(ret,root.right,target,path,lvl+1);
}


public ArrayList<ArrayList<Integer>> targetSumStartFromAnyWhere(TreeNode root, int target){
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	if(root==null) return ret;
	helper(ret,)	
}	

public void helper(ArrayList<ArrayList<Integer>> ret, TreeNode root, int[] path, int target, int lvl){
	path[lvl]=root.val;
	int t = 0;
	for(int i=lvl;i>=0;i--){
		t+=path[i];
		if(t==target){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=i;j<=lvl;j++){
				list.add(path[j]);
			}
			ret.add(list);
		}
	}
	helper(ret,root.left,path,target,lvl+1)
	
}












