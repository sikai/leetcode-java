public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
 		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		int[] visited = new int[num.length];
		dfs(ret,inter,num,0,visited);
		return ret;    
    }
	public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int[] num, int step, int[] visited){
		if(step==num.length){
			ArrayList<Integer> temp = new ArrayList<Integer>(inter);
			ret.add(temp);
			return;
		}
		for(int i=0;i<num.length;i++){
			if(visited[i]==0){
				if(i>0 && num[i]==num[i-1] && visited[i-1]==0) continue;
				inter.add(num[i]);
				visited[i]=1;
				dfs(ret,inter,num,step+1,visited);
				visited[i]=0;
				inter.remove(inter.size()-1);
			}
		}
	}
}

void dfs(ret,inter,lvl,visited,num){
	if(inter.size()==num.length){
		ret.add(new ArrayList<Integer>(inter));
		return;
	}
	for(int i=0;i<num.length;i++){
		if(!visited[i]){
			if(num[i]==num[i-1]&&!visited[i-1]) continue;
			visited[i]=true;
			inter.add(num[i]);
			dfs(ret,inter,lvl+1,visited,num);
			inter.remove(inter.size()-1);
			visiterpi[]
		}
	}
}