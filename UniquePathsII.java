public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
        int[][] cache = new int[m][n];
		if(obstacleGrid[0][0]==1) return 0;
		else cache[0][0]=1;
		for(int i=1;i<m;i++){
			if(obstacleGrid[i][0]==1) break;
			else cache[i][0]=1;
		}
		for(int i=1;i<n;i++){
			if(obstacleGrid[0][i]==1) break;
			else cache[0][i]=1;
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(obstacleGrid[i][j]==1) continue;
				else{
					cache[i][j]=cache[i][j-1]+cache[i-1][j];
				}
			}
		}
		return cache[m-1][n-1];
    }
}
 public int uniquePaths(int m, int n) {
	int[][] c = new int[m][n];
	c[0][0]=1;
	for(int i=1;i<m;i++){
		c[i][0]=1;
	}
	for(int i=1;i<n;i++){
		c[0][i]=1;
	}
	for(int i=1;i<m;i++){
		for(int j=1;j<n;j++){
			c[i][j]=c[i-1][j]+c[i][j-1];
		}
	}
	return c[m-1][n-1];