public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		if(num.length==0) return ret;
		int[] visited = new int[num.length];
 		dfs(ret,inter,0,num,visited);
		return ret;
    }
	public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int lvl, int[] num, int[] visited){
		if(lvl == num.length) {
		    ArrayList<Integer> sb = new ArrayList<Integer>(inter);
		    ret.add(sb);
		    return;
		}
		for(int i=0;i<num.length;i++){
			if(visited[i]==0){
				visited[i]=1;
				inter.add(num[i]);
				dfs(ret,inter,lvl+1,num,visited);
				inter.remove(inter.size()-1);
				visited[i]=0;
			}
		}
	}
}

