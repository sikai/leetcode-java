public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
		int ret = 0;
		int[] left_to_right = new int[prices.length];
		int min = Integer.MAX_VALUE;
		int max1 = 0;
		for(int i=0;i<prices.length;i++){
		    if(prices[i]<min){
				min = prices[i];
			}
			int profit = prices[i] - min;
			if(profit>max1){
				max1 = profit;
			}
			left_to_right[i] = max1;
		}
		
		int highest = Integer.MIN_VALUE;
		int max2 = 0;
		for(int i=prices.length-1;i>=0;i--){
		    if(prices[i]>highest){
				highest = prices[i];
			}
			int profit = highest - prices[i];
			if(profit>max2){
				max2 = profit;
			}
			if(max2+left_to_right[i]>ret){
				ret = max2 + left_to_right[i];
			}	
		}
		return ret;        
    }
}

