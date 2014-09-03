public class Solution {
    public boolean search(int[] A, int target) {
        return helper(A,target,0,A.length-1);
    }
	public boolean helper(int[] A, int target, int start, int end){
		if(start>end) return false;
		int mid = (start+end)/2;
		if(A[mid]==target) return true;
		if(A[mid]<A[start]){
			if(A[mid]<target && target<=A[end]){
				return helper(A,target,mid+1,end);
			}else{
				return helper(A,target,start,mid-1);
			}
		}else if(A[mid]>A[start]){
			if(A[start]<=target && target<A[mid]){
				return helper(A,target,start,mid-1);
			}else{
				return helper(A,target,mid+1,end);
			}
		}else{
			if(A[start]!=A[end]){
				return helper(A,target,mid+1,end);
			}else{
				return (helper(A,target,mid+1,end) || helper(A,target,start,mid-1));
			}
		}
	}
}

