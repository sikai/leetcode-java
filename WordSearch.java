rerpublic class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(dfs(board,i,j,word,0,visited)){
					return true;
				}
			}
		}
		return false;
    }
	public boolean dfs(char[][] board, int row, int col, String word, int lvl, boolean[][] visited){
	    if(board[row][col]!=word.charAt(lvl)) return false;
		if(lvl == word.length()-1) return true;
		visited[row][col] = true;
		if (row>0 && !visited[row-1][col]){
			if(dfs(board, row-1,col,word,lvl+1,visited)) return true;
		}
		if(row<board.length-1 && !visited[row+1][col]){
			if( dfs(board, row+1,col,word,lvl+1,visited)) return true;
		}
		if(col>0 && !visited[row][col-1]){
			if( dfs(board, row,col-1,word,lvl+1,visited)) return true;
		}
		if(col<board[0].length-1 && !visited[row][col+1]){
			if(dfs(board, row,col+1,word,lvl+1,visited)) return true;
		}
		visited[row][col] = false;
		return false;
	}
}

	public boolean exist(char[][] board, String word) {
		if(word.length()<1 || word==null) return false;
		boolean[][] visited = new boolean[board.length][board[0].length];
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(dfs(board,word,0,i,j,visited)){
					return true;
					break;
				}
			}
		}
		return false;
	}
	public boolean dfs(char[][] board, String word, int lvl, int x, int y, boolean[][] visited){
		if(word.charAt(lvl)!=board[x][y]) return false;
		if(lvl==word.length()-1) return true;
		if(x>1 && !visited[x-1][y]){
			if(dfs(board,word,lvl+1,x-1,y,visited))
				return true;
		}
		if(x<board.length-1 && !visited[x+1][y]){
			if(dfs(board,word,lvl+1,x+1,y,visited)) return true;
		}
		if(y>1 && !)
		
		
		visited[x][y]=false;
		return false;
	}