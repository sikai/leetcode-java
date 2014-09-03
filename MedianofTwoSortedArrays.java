public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
 		int aLen = A.length;
		int bLen = B.length;
		if((aLen+bLen)%2 ==1) return (double) findKth(A,B,(aLen+bLen)/2,0,aLen-1,0,bLen-1);
		else return (findKth(A,B,(aLen+bLen)/2-1, 0,aLen-1,0,bLen-1) + findKth(A,B,(aLen+bLen)/2,0,aLen-1,0,bLen-1)) * 0.5;
    }
	public int findKth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd){
		int aLen = aEnd - aStart + 1;
		int bLen = bEnd - bStart + 1;
		if(aLen==0){
			return B[bStart+k];
		}
		if(bLen==0){
			return A[aStart+k];
		}
		if(k==0){
			return A[aStart]>=B[bStart]? B[bStart] : A[aStart];
		}
		int aCount = aLen/(aLen+bLen) * k;
		int bCount = k-1-aCount;
		int aMid = aStart + aCount;
		int bMid = bStart + bCount;
		if(A[aMid]>B[bMid]){
			k = k - bCount -1;
			aEnd = aMid;
			bStart = bMid +1;
		}else{
			k = k - aCount -1;
			aStart = aMid + 1;
			bEnd = bMid;
		}
		return (A,B,k,aStart,aEnd,bStart,bEnd);
	}
}


	
	public double findMedianSortedArrays(int A[], int B[]) {
		int aLen = A.length;
		int blen = B.length;
		if((aLen+bLen)%2==0) return 0.5*(kindKth(A,B,(alen+blen)/2) + findKth(A,B,(alen+blen)/2-1) );
		else return findKth(A,B,(alen+blen)/2);
	}
	public findKth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd){
		int aLen = aEnd-aStart+1;
		int bLen = bEnd-bStart+1;
		if(aLen==0) return B[bStart+k];
		if(bLen==0) return A[aStart+k];
		if(k==0) return A[aStart]<B[bStart]? A[aStart]:B[bStart];
		int aCount = aLen/(aLen+bLen) * k;
		int bCount = k-1-aCount;
		int aMid = aCount+aStart;
		int bMid = bCount+bStart;
		if(aMid<=bMid){
			return findKth(A,B,k-(aMid-aStart),aMid,aEnd,bStart,bMid);
		}else{
			return findKth(A,B,k-(bMid-bStart),aStart,aMid,bMid,bEnd);
		}
	}
		
		public class Solution {
		    public double findMedianSortedArrays(int A[], int B[]) {
			int alen = A.length;
			int blen = B.length;
			if((alen+blen)%2==1) return findKth(A,B,(alen+blen)/2,0,alen-1,0,blen-1);
			else{
				return 0.5*(findKth(A,B,(alen+blen)/2-1,0,alen-1,0,blen-1)+findKth(A,B,(alen+blen)/2,0,alen-1,0,blen-1));
			}
			
			public int findKth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd){
				int aLen = aEnd-aStart+1;
				int bLen = bEnd-bStart+1;
				if(aLen==0){
					return B[bStart+k];
				}
				if(bLen==0){
					return A[aStart+k];
				}
				if(k==0) return A[aStart]>B[bStart]? B[bStart]: A[aStart];
				int aCount = aLen/(aLen+bLen)*k;
				int bCount = k-1-aCount;
				int aMid = aCount+aStart;
				int bMid = bCount+bStart;
				if(A[aMid]>B[bMid]){
					aEnd=aMid;
					bStart=bMid+1;
					k=k-bCount-1;
				}else{
					aStart=aMid+1;
					bEnd=bMid;
					k=k-aCount-1;
				}
				return findKth(A,B,k,aStart,aEnd,bStart,bEnd)
			}
						}		
		
		
		
		
		
		
		
		