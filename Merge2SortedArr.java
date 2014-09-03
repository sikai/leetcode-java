public class Solution {
    public void merge(int A[], int m, int B[], int n) {
		int len = m+n;
		int index = len-1;
		int indexA = m-1;
		int indexB = n-1;
		while(indexA>=0 && indexB>=0){
			if(A[indexA]>=B[indexB]){
				A[index] = A[indexA];
				index--;
				indexA--;
			}else{
				A[index] = B[indexB];
				index--;
				indexB--;
			}
		}
		while(indexB>=0){
			A[index] = B[indexB];
			index--;
			indexB--;
		}
	  
    }
}

