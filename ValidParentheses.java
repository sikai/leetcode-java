chretpublic class Solution {
    public boolean isValid(String s) {
     	Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
				stack.push(s.charAt(i));
			}
			else{
			    if(stack.isEmpty()) return false;
				char c = stack.peek();
				if(c=='(' && s.charAt(i)!=')') return false;
				if(c=='[' && s.charAt(i)!=']') return false;
				if(c=='{' && s.charAt(i)!='}') return false;
				stack.pop();
			}
		}
        return stack.isEmpty();  
    }
}