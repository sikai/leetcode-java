
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inter = new ArrayList<Integer>();
		int[] visited = new int[num.length]; 
		Arrays.sort(num);
		dfs(ret,inter,visited,num,0,target);
		return ret;
    }
	public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int[] visited, int[] num, int step, int sum){
		if(sum<0) return;
		if(sum==0){
			ArrayList<Integer> temp = new ArrayList<Integer>(inter);
			ret.add(temp);
			return;
		}
		if(step==num.length) return;
		for(int i=step;i<num.length;i++){
			if(i>0 && num[i]==num[i-1] && visited[i-1]==0) continue;
			if(visited[i]==0){
				inter.add(num[i]);
				visited[i]=1;
				dfs(ret,inter,visited,num,i+1,sum-num[i]);
				inter.remove(inter.size()-1);
				visited[i]=0;
			}
		}
	} 
}

public void dfs (ArrayList<ArrayList<Integer>> retm ArrayList<Integer> inter, int lvl, int target, int[] visited){
	if(target<0) return;
	if(target==0){
		ArrayList<Integer> temp = new ArrayList<Integer>(inter);
		ret.add(temp);
	}
	for(int i=lvl;i<cand.length;i++){
		if(i>0 && cand[i]==cand[i-1] && !visited[i-1]) continue;
		visited[i]=true;
		inter.add(cand[i]);
		dfs(ret,inter,i+1,target-cnad[i],visited);
		inter.remove(inter.size()-1);
		visited[i]=false;
	}
}
public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int[] num, int target, int lvl){
	if(target<0) return;
	if(target==0){
		ret.add(new ArrayList<Integer>(inter));
		return;
	}
	if(lvl==num.length) return;
	for(int i=lvl;i<num.length;i++){
		if(i>lvl && num[i]==num[i-1]) continue;
		inter.add(num[i]);
		dfs(ret,inter,num,target-num[i],i+1);
		inter.remove(inter.size()-1);
	}
}


public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();  
	ArrayList<Integer> inter = new ArrayList<Integer>();
	Arrays.sort(candidates);
	dfs()	
}
public void dfs(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int[] candidates, int target, int lvl, int sum){
	if(sum==target){
		ArrayList<Integer> a = new ArrayList<Integer>(inter);
		ret.add(inter);
		return;
	}
	if(sum>target) return;
	for(int i=lvl;i<candidates.length;i++){
		if(i>lvl+1 && candidates[i]==candidates[i-1]) continue;
		sum+=candidates[i];
		dfs(ret,inter,candidates,target,lvl+1,sum);
		inter.remove(inter.size()-1);
	}
}







