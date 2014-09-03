public class Solution {
    public void solveSudoku(char[][] board) {
        dfs(board,0);
    }
    public boolean dfs(char[][] board, int num){
        int rows=9;
        int cols=9;
        if(num==rows*cols) return true;
        int x = num/rows;
        int y = num%rows;
        if(board[x][y]!='.'){
            return dfs(board,num+1);
        }
        for(char c='1';c<='9';c++){
            if(isValid(board,x,y,c)){
                board[x][y]=c;
                if(dfs(board,num+1)) return true;
                board[x][y]='.';
            }
        }
        return false;
    }
    public boolean isValid(char[][] board, int x, int y, char c){
        for(int i=0;i<9;i++){
            if(board[x][i]==c) return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][y]==c) return false;
        }
        int xblock=x/3;
        int yblock=y/3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[xblock*3+i][yblock*3+j]==c) return false;
            }
        }
        return true;
    }
}

