public class Solution {
    public int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
    	int sum = num[0]+num[1]+num[2];
		for(int i=1;i<num.length-1;i++){
			int start=0;
			int end=num.length-1;
			while(start<i && i<end){
				int temp = num[start]+num[i]+num[end];
				if(temp==target) return temp;
				else if(temp<target){
					sum = Math.abs(temp-target)<Math.abs(sum-target)? temp : sum;
					start++;
				}else{
					sum = Math.abs(temp-target)<Math.abs(sum-target)? temp : sum;
					end--;
				}
			}
		}
		return sum;    
    }
}