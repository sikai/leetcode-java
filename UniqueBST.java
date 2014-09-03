public class Solution {
    public int numTrees(int n) {
		return helper(1,n);
    }
	public int helper(int start, int end){
		int count = 0;
		if(start>=end) return 1;
		for(int i=start;i<=end;i++){
			int left = helper(start,i-1);
			int right = helper(i+1,end);
			count+=left*right;
		}
		return count;
	}
}

public int numTrees(int n) {
	if(n==0 || n==1) return 1;
	return helper(1,n);
}
public int helper(int start, int end){
	int count = 0;
	for(int i=start;i<=end;i++){
		if(start>=end) return 1;
		int left = helper(start,i);
		int right = helper(i,end);
		count+=left*right;
	}
}