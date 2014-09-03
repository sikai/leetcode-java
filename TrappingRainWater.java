public class Solution {
    public int trap(int[] A) {
        if(A.length==0) return 0;
		int sum = 0;
		int[] lmax = new int[A.length];
		lmax[0]=0;
		int maxL = A[0];
		for(int i=1;i<A.length;i++){
			lmax[i]=maxL;
			if(maxL<A[i]) maxL = A[i];
		}
		int maxR = A[A.length-1];
		for(int i=A.length-2;i>=0;i--){
			if(Math.min(lmax[i],maxR) > A[i]){
				sum+=Math.min(lmax[i],maxR)-A[i];
			}
			if(maxR<A[i]) maxR = A[i];
		}
		return sum;
    }
}
