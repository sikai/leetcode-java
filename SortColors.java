public class Solution {
    public void sortColors(int[] A) {
		int indexA = 0;
		int indexB = A.length-1;
		int i=0;
		while(i<indexB+1){
			if(A[i]==0){
				int temp = A[indexA];
				A[indexA] = A[i];
				A[i] = temp;
				indexA++;
			}
			if(A[i]==2){
				int temp = A[indexB];
				A[indexB] = A[i];
                A[i] = temp;
				indexB--;
				continue;
			}
			i++;
		}
    }
}
