public class Solution {
	int count = 1;
    public int[][] generateMatrix(int n) {
		int[][] m = new int[n][n];
        for(int i=0;i<n/2;i++){
			for(int j=i;j<n-i-1;j++){
				m[i][j]=count++;
			}
			for(int j=i;j<n-i-1;j++){
				m[j][n-1-i]=count++;
			}
			for(int j=i;j<n-i-1;j++){
				m[n-1-i][n-1-j]=count++;
			}
			for(int j=i;j<n-i-1;j++){
				m[n-1-j][i]=count++;
			}
		}
		if(n%2==1){
			m[n/2][n/2]=count++;
		}	
    }
}

public int[][] generateMatrix(int n) {
	int[][] m = new int[n][n];
	for(int i=0;i<n/2;i++){
		for(int j=i;j<n-1-i;j++){
			m[i][j]=count++;
		}
		for(int j=i;j<n-1-i;j++){
			m[j][n-1-i]=count++;
		}
		for(int j=i;j<n-1-i;j++){
			m[n-1-i][n-1-j]=count++;
		}
		for(int j=i;j<n-1-i;j++){
			m[n-1-j][i]=count++;
		}
	}
	if(n%2!=0){
		m[n/2][n/2][]
	}