public class Solution {
    public int singleNumber(int[] A) {
		int[] cache = new int[32];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<cache.length;j++){
				cache[j] += A[i] & 1;
				A[i] = A[i] >>1;
			}
		}
		int ret = 0;
		for(int i=cache.length-1;i>=0;i--){
			ret = ret | (cache[i]%3);
			if(i>0) ret = ret<<1;
		}
		return ret;
    }
}

public int singleNumber(int[] A) {
	int[] cache = new int[32];
	int ret = 0;
	for(int i=0;i<A.length;i++){
		for(int j=0;i<32;j++){
			cache[j]+=(A[i]>>j)&1;
		}
	}
	for(int i=31;i>=0;i--){
		cache[i]=cache[i]%3;
		ret=ret<<1|cache[i];
	}