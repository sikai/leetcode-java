public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if(num.length<3) return ret;
		Arrays.sort(num);
		for(int i=0;i<=num.length-3;i++){
			if(i>0 && num[i]==num[i-1]) continue;
			int start=i+1;
			int end=num.length-1;
			while(start<end){
				if(num[i]+num[start]+num[end]==0){
					ArrayList<Integer> a = new ArrayList<Integer>();
					a.add(num[i]);
					a.add(num[start]);
					a.add(num[end]);
					ret.add(a);
					start++;
					end--;
					while(start<end && num[start]==num[start-1]){
						start++;
					}
					while(start<end && num[end]==num[end+1]){
						end--;
					}
				}else if (num[i]+num[start]+num[end]<0) {
					start++;
				}else{
					end--;
				}
			}
		}
		return ret;     
    }
}

