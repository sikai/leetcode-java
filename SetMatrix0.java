public class Solution {
    public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		boolean flag1 = false;
		boolean flag2 = false;
        for(int i=0;i<m;i++){
			if(matrix[i][0]==0){
				flag1 = true;
				break;
			}
		}
		for(int i=0;i<n;i++){
			if(matrix[0][i]==0){
				flag2 = true;
				break;
			}
		}	
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for(int i=1;i<m;i++){
			if(matrix[i][0]==0){
				for(int k=1;k<n;k++){
					matrix[i][k]=0;
				}
			}
		}
		for(int i=1;i<n;i++){
			if(matrix[0][i]==0){
				for(int k=1;k<m;k++){
					matrix[k][i]=0;
				}
			}
		}
		if(flag1){
			for(int k=0;k<m;k++){
				matrix[k][0]=0;
			}
		}
		if(flag2){
			for(int k=0;k<n;k++){
				matrix[0][k]=0;
			}
		}
    }
}

	