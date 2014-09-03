public class Solution {
    public int evalRPN(String[] tokens) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<tokens.length;i++){
			if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
				int op2 = s.pop();
				int op1 = s.pop();
				if(tokens[i].equals("+")){
					s.push(op1+op2);
				}
				if(tokens[i].equals("-")){
					s.push(op1-op2);
				}
				if(tokens[i].equals("*")){
					s.push(op1*op2);
				}
				if(tokens[i].equals("/")){
					s.push(op1/op2);
				}
			}else{
				int e = Integer.parseInt(tokens[i]);
				s.push(e);
			}
		}
		return s.pop();       
    }
}

