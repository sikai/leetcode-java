public class Solution {
	public int largestRectangleArea(int[] height) {
		if(height.length==0) return 0;
		int[] h = new int[height.length+1];
		h = Arrays.copyOf(height,height.length+1);		
		int i=0;
		int max=0;
		Stack<Integer> s = new Stack<Integer>();
		while(i<h.length){
			if(s.isEmpty() || h[s.peek()]<=h[i]){
				s.push(i);
				i++;
			}else{
				int last = h[s.pop()];
				int width = s.isEmpty()? i:i-s.peek()-1;
				max = Math.max(max,last*width);
			}
		}
		return max;
	}
}

public int largestRectangleArea(int[] height) {
	int[] h = new int[height.length+1];
	h=Arrays.copyOf(height,height.length+1);
	Stack<Integer> stack = new Stack<Integer>();
	int i=0;
	while(i<h.length){
		if(stack.isEmpty() || h[stack.peek()]<=h[i]){
			stack.push(i);
			i++;
		}else{
			int height = h[stack.pop()];
			int weight = stack.isEmpty()? i:i-stack.peek()-1;			max = Math.max(max,height*weight);
		}
	}
	
}

