public class Solution {
    public boolean isValidSudoku(char[][] board) {
 		int n = board.length;
		for(int i=0;i<n;i++){
			HashMap<Character,Integer> table = new HashMap<Character,Integer>();
			for(int j=0;j<n;j++){
				if(board[i][j]!='.'){
					if(!table.containsKey(board[i][j])) table.put(board[i][j],1);
					else return false;
				}
			}
		}   
		for(int i=0;i<n;i++){
			HashMap<Character,Integer> table = new HashMap<Character,Integer>();
			for(int j=0;j<n;j++){
				if(board[j][i]!='.'){
					if(!table.containsKey(board[j][i])) table.put(board[j][i],1);
					else return false;
				}
			}
		}
		for(int block = 0; block<n;block++){
			HashMap<Character,Integer> table = new HashMap<Character,Integer>();
			int row_offset = block/3;
			int col_offset = block%3;
			for(int i=block*n;i<block*n + n;i++){
				int row = (i-block*n)/3 +3*row_offset;
				int col = (i-block*n)%3 +3*col_offset;
				if(board[row][col]!='.'){
					if(!table.containsKey(board[row][col])) table.put(board[row][col],1);
					else return false;
				}
			}
		} 
		return true;    
    }
}