public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int b = -1;
        for(int i=0;i<m;i++){
            if(matrix[i][n-1]>target){
                b=i;
                break;
            }else if(matrix[i][n-1]==target){
                return true;
            }
        }
        if(b==-1) return false;
    
            int i=0;
            for(;i<n;i++){
                if(matrix[b][i]==target) return true;
            }
            if(i==n) return false;
            return false;
        
    }
}

