public class Solution {
    public int maximalRectangle(char[][] matrix) {
		int res=0;
		if(matrix.length==0) return 0;
		int[] H = new int[matrix[0].length];
		int[] L = new int[matrix[0].length];
		int[] R = new int[matrix[0].length];
		for(int k=0;k<R.length;k++){
			R[k]=matrix[0].length;
		}
		for(int i=0;i<matrix.length;i++){
			int left = 0;
			int right = matrix[0].length;//
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]=='1'){
					H[j]++;
					L[j]=Math.max(L[j],left);
				}else{
					left=j+1;
					H[j]=0;
					L[j]=0;
					R[j]=matrix[0].length;
				}
			}
			for(int j=matrix[0].length-1;j>=0;j--){
				if(matrix[i][j]=='1'){
					R[j]=Math.min(R[j],right);
					res = Math.max(res,H[j]*(R[j]-L[j]));
				}else{
					right=j;
				}
			}
		}
		return res;        
    }
}

public int maximalRectangle(char[][] matrix) {
	int res = 0;
	int[] H = new int[matrix[0].length];
	int[] L = new int[matrix[0].length];
	int[] R = new int[matrix[0].length];
	for(int i=0;i<R.length;i++){
		R[i]=matrix[0].length;
	}
	for(int i=0;i<matrix.length;i++){
		int left=0;
		int right=matrix[0].length;
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[i][j]==0){
				H[j]=0;
				L[j]=0;
				R[j]=matrix[0].length;
				left=j+1;
			}else{
				H[j]++;
				L[j]=Math.max(left,L[j]);
			}
		}
		for(int j=matrix[0].length-1;j>=0;j--){
			if(matrix[i][j]==0){
				right=j;
			}else{
				R[j]=Math.min(R[j],right);
				res=Math.max(res,(R[j]-L[j])*H[j]);
			}
		}
	}
	reutrn res;	
	

	
	
	
	
	
	
	
}