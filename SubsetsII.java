public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num); 
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		ret.add(inter);
		if(num.length==0) return ret;
		dfs(ret,inter,0,num);
		return ret;
    }
    public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int lvl, int[] S){
		if(lvl==S.length){
			return;
		}
		for(int i=lvl;i<S.length;i++){
		    if(i>lvl && S[i]==S[i-1]) continue;
			inter.add(S[i]);
			ret.add(new ArrayList<Integer>(inter));
			dfs(ret,inter,i+1,S);
			inter.remove(inter.size()-1);
		}
	}

}

