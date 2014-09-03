public class Solution {
    public int removeElement(int[] A, int elem) {
		int curr = 0;
		for(int i=0;i<A.length;i++){
			if(A[i]==elem){
				continue;
			}
			A[curr++]=A[i];
		}
		return curr;
    }
}



public int removeElement(int[] A, int elem) {
	int curr = 0;
	int i = 0;
	while(i<A.length){
		if(A[i]==element){
			i++;
		}else{
			A[curr++]=A[i++];
		}
	}