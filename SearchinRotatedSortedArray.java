public class Solution {
    public int search(int[] A, int target) {
    	return helper(A,target,0,A.length-1);
    }
	public int helper(int[] A, int target, int start, int end){
		if(start>end) return -1;
		int mid = (start+end)/2;
		if(A[mid]==target) return mid;
		if(A[mid]>=A[start]){
			if(A[start]<=target && target<A[mid]) return helper(A,target,start,mid-1);
			else return helper(A,target,mid+1,end);
		}else if(A[mid]<A[start]){
			if(A[mid]<target && target<=A[end]) return helper(A,target,mid+1,end);
			else return helper(A,target,start,mid-1);
		}
		else return -1;
 	}
}

