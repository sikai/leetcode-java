public class Solution {
    public int maxArea(int[] height) {
		int indexA = 0;
		int indexB = height.length-1;
		int max = 0;
		while(indexA < indexB){
			max = Math.max(max,Math.min(height[indexA],height[indexB])*(indexB-indexA));
			if(height[indexA]<height[indexB]){
				indexA++;
			}else{
				indexB--;
			}
		}
		return max;
    }
}


public int maxArea(int[] height) {
	int max = Integer.MIN_VALUE;
	int i = 0;
	int j = height.length-1c;
	while(i<j){
		int left = height[i];
		int right = height[j];
		max =Math.max(max,Math.min(left,right)*(j-1));
		if(left<=right) i++;
		else j--;
	}
	
