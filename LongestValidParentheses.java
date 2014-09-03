public class Solution {
    public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int last = -1;
		int max = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				stack.push(i);
			}else{
				if(stack.isEmpty()){
					last=i;
				}else{
					stack.pop();
					if(!stack.isEmpty()){
						max = Math.max(max,i-stack.peek());
					}else{
						max = Math.max(max,i-last);
					}

				}
			}
		}
		return max;
	}
}

