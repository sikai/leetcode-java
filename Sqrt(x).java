public class Solution {
    public int sqrt(int x) {
		int end = x/2<Math.sqrt(Integer.MAX_VALUE)? x/2+1: (int) Math.sqrt(Integer.MAX_VALUE);
		int start = 0;
		while(start<=end){
			int mid = (end+start)/2;
			int res = mid * mid;
			if(res==x) return mid;
			else if(res<x){
				start = mid +1;
			}else{
				end = mid - 1;
			}
		}
		return end;        
    }
}

 public int sqrt(int x) {
	if(x<0) return -1;
	long end = x/2+1;
	long start = 0;
	while(start<=end){
		long mid = start+end/2;
		long sq = mid*mid;
		if(sq==x) return (int) mid;
		if(sq<x){
			start=mid+1;
		} else{
			end=mid-1;
		}
	}
	return end;