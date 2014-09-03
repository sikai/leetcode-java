public class Solution {
    public boolean canJump(int[] A) {
        int maxRange = A[0];
		for(int i=1;i<A.length;i++){
		    if(i>maxRange) return false;
			maxRange = Math.max(maxRange,A[i]+i);
			if(maxRange>=A.length-1) return true;
		}
		return true;
    }
}

