public class Solution {
    public int searchInsert(int[] A, int target) {
		for(int i=0;i<A.length;i++){
			if(A[i]>=target) return i;
		}
		return A.length;
    }
}

