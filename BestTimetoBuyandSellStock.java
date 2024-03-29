public class Solution {
    public int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=0;i<prices.length;i++){
			if(min > prices[i]){
				min = prices[i];
			}
			if(prices[i]-min > sum){
				sum = prices[i] - min;
			}
		}
		return sum;
    }
}

