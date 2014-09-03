public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> ret = new ArrayList<Integer>();		int m = matrix.length;
		int n = matrix[0].length;
		int x = 0;
		int y = 0;
		while(m>0 && n>0){
			if(m==1){
				for(int i=0;i<n;i++){
					ret.add(matrix[x][y++]);
				}
				break;
			}
			if(n==1){
				for(int i=0;i<m;i++){
					ret.add(matrix[x++][y]);
				}
				break;
			}
			for(int i=0;i<n-1;i++){
				ret.add(matrix[x][y++]);
			}
			for(int i=0;i<m-1;i++){
				ret.add(matrix[x++][y]);
			}
			for(int i=0;i<n-1;i++){
				ret.add(matrix[x][y--]);
			}
			for(int i=0;i<m-1;i++){
				ret.add(matrix[x--][y]);
			}
			x++;
			y++;
			m-=2;
			n-=2;
		}
		return ret;
	}
}
