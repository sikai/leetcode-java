public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		if(candidates.length==0) return ret;
		Arrays.sort(candidates);
		dfs(ret,inter,candidates,target,0);
		return ret;
    }
	public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int[] candidates,  int target, int step){
		if(target<0) return;
		if(target==0){
			ArrayList<Integer> temp = new ArrayList<Integer>(inter);
			ret.add(temp);
			return;
		}
		for(int i=step;i<candidates.length;i++){
			inter.add(candidates[i]);
			dfs(ret,inter,candidates,target-candidates[i],i);
			inter.remove(inter.size()-1);
		}
	}
}


