public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> ret = new ArrayList<String[]>();
		int[] board = new int[n];
		dfs(ret,board,0,n);
		return ret;
    }
	public void dfs(ArrayList<String[]> ret, int[] board, int step, int n){
		if(step==n){
			String[] result = new String[n];
			for(int i=0;i<n;i++){
				String s = "";
				for(int j=0;j<board[i];j++){
					s+=".";
				}
				s+="Q";
				for(int j=board[i]+1;j<n;j++){
					s+=".";
				}
				result[i]=s;
			}
			ret.add(result);
			return;
		}
		for(int i=0;i<n;i++){
			board[step]=i;
			if(isValid(board,step)){
				dfs(ret,board,step+1,n);
			}
		}
	}
	public boolean isValid(int[] board, int row){
		for(int i=0;i<row;i++){
			if(board[i]==board[row] || Math.abs(board[i]-board[row])==Math.abs(row-i)) return false;
		}
		return true;
	}
}
