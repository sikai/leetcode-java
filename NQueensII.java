public class Solution {
	int total=0;
    public int totalNQueens(int n) {
        int[] A = new int[n];
		dfs(n,A,0);
		return total;
    }
	public void dfs(int n, int[] A, int curr){
		if(curr==n) {
			total++;
			return;
		}
		for(int i=0;i<n;i++){
			A[curr]=i;
			if(isValid(A,curr)){
				dfs(n,A,curr+1);
			}
		}
		
	}
	public boolean isValid(int[] A, int row){
		for(int i=0;i<row;i++){
			if(A[i]==A[row] || Math.abs(A[i]-A[row])==row-i) return false;
		}
		return true;
	}
}

static int total = 0;
public int totalNQueens(int n) {
	int[] A = new int[n];
	dfs(A,0,n);
}
public void dfs(int[] pos, int lvl, int n){
	if(lvl==n){
		total++;
		return;
	}
	for(int i=0;i<n;i++){
		pos[lvl]=i;
		if(isValdi(pos,lvl,i)){
			dfs(pos,lvl,n);
		}
	}
}