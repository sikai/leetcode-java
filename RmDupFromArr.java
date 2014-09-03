public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length==0) return 0;
		int curr = 1;
 		for(int i=1;i<A.length;i++){
			if(A[i]==A[i-1]) continue;
			A[curr++]=A[i];
    	}
	return curr;
    }
}

public int removeDuplicates(int[] A) {
	int curr = 1;
	for(int i=1;i<A.length;i++){
		if(A[i]==A[i-1]) continue;
		A[curr++]=A[i];
	}