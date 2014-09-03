public class Solution {
    public void solve(char[][] board) {
		int row = board.length;
		if(row==0) return;
		int col = board[0].length;
		ArrayList<Integer> index1 = new ArrayList<Integer>();
		ArrayList<Integer> index2 = new ArrayList<Integer>();
		for(int i=0;i<row;i++){
			if(board[i][0]=='O'){
				index1.add(i);
				index2.add(0);
			}
		}        
		for(int i=0;i<row;i++){
			if(board[i][col-1]=='O'){
				index1.add(i);
				index2.add(col-1);
			}
		}
		for(int i=0;i<col;i++){
			if(board[0][i]=='O'){
				index1.add(0);
				index2.add(i);
			}
		}
		for(int i=0;i<col;i++){
			if(board[row-1][i]=='O'){
				index1.add(row-1);
				index2.add(i);
			}
		}
		int k=0;
		while(k<index1.size()){
			int x = index1.get(k);
			int y = index2.get(k);
			board[x][y] = 'Y';
			if(x>0 && board[x-1][y]=='O'){
				index1.add(x-1);
				index2.add(y);
			} 
			if(x<row-1 && board[x+1][y]=='O'){
				index1.add(x+1);
				index2.add(y);
			}
			if(y>0 && board[x][y-1]=='O'){
				index1.add(x);
				index2.add(y-1);
			}
			if(y<col-1 && board[x][y+1]=='O'){
				index1.add(x);
				index2.add(y+1);
			}
			k++;
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(board[i][j]=='O') board[i][j]='X';
				else if(board[i][j]=='Y') board[i][j] = 'O';
			}
		}
    }
}


public void solve(char[][] board) {
	ArrayList<Integer> i1 = new ArrayList<Integer>();
	ArrayList<Integer> i2 = new ArrayList<Integer>();
	int m=board.length;
	int n=board[0].length;
	for(int i=0;i<n;i++){
		if(board[0][i]=='O'){
			i1.add(0);
			i2.add(i);
		}
	}	
	int k=0;
	while(k<i1.size()){
		int x = i1.get(k);
		int y = i2.get(k);
		board[x][y]='Y';
		if(x>0 && board[x-1][y]=='O'){
			i1.add(x-1);
			i2.add(y);
		}
		if(x<m-1 && board[x+1][y]=='O'){
			i1.add(x+1);
			i2.add(y);
		}
		k++;
	}
	for(int i=1;i<m;i++){
		for(int j=1;j<n;j++){
			if(board[i][j]=='Y') board[i][j]='O';
			if(board[i][j]=='O') board[i][j]='X';
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	