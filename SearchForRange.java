public class Solution {
    public int[] searchRange(int[] A, int target) {
		int[] ret = new int[2];
		int idx = helper(A,target,0,A.length-1);
		if(idx==-1) return new int[]{-1,-1};
		int left = idx;
		while(left>=0 && A[left]==target){
			left--;
		}
		ret[0] = left==idx? idx:left+1;
		int right = idx;
		while(right<=A.length-1 && A[right]==target){
			right++;
		}
		ret[1] = right==idx? idx:right-1;
		return ret;
 		   
    }
	public int helper(int[] A, int target, int start, int end){
		int mid = (start+end)/2;
		if(start>end) return -1;
		if(A[mid]==target) return mid;
		if(A[mid]<target) return helper(A,target,mid+1,end);
		if(A[mid]>target) return helper(A,target,start,mid-1);
		return -1;
	}
}


