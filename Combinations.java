public class Solution {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		dfs(ret,inter,n,k,1);
		return ret;
	}
	public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int n, int k, int lvl){
		if(inter.size()==k){
			ArrayList<Integer> temp = new ArrayList<Integer>(inter);
			ret.add(temp);
			return;
		}
		for(int i=lvl;i<=n;i++){
			inter.add(i);
			dfs(ret,inter,n,k,i+1);
			inter.remove(inter.size()-1);
		}
	}
}

//n choose k


