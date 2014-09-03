public class Solution {
    public int jump(int[] A) {
		int start=0;
		int end=0;
		int count=0;
		if(A.length==1) return 0;
		while(end<A.length){
			int max_range = 0;
			count++;
			for(int i=start;i<=end;i++){
				if(A[i]+i>=A.length-1) return count;
				if(A[i]+i>max_range) max_range=A[i]+i;
			}
			start=end+1;
			end=max_range;
		}
		return count;
    }
}

