public class Solution {
    public String simplifyPath(String path) {
		String res = "";
 		Stack<String> s = new Stack<String>();
		int i=0;
		while(i<path.length()){
			while(i<path.length() && path.charAt(i)=='/'){
				i++;
			}
			if(i==path.length()) break;
			int start = i;
			while(i<path.length() && path.charAt(i)!='/'){
				i++;
			}
			int end = i-1;
			String element = path.substring(start,end+1);
			if(element.equals("..")){
				if(s.size()>0){
					s.pop();
				}
			}else if(!element.equals(".")){
				s.push(element);
			}
		}
		while(!s.isEmpty()){
			res = s.pop()+"/"+res;
		}      
		res = "/" + res;
		if(res.length()>1) res = res.substring(0,res.length()-1);
		return res;
    }
}

public class Solution {
    public String simplifyPath(String path) {
		Stack<String> s = new Stack<String>();
		String res="";
		int i=0;
		while(i<path.length()){
			while(i<path.length() && path.charAt(i)=='/'){
				i++;
			}
			if(i==path.length()) break;
			int start = i;
			while(i<path.length() && path.charAt(i)!='/'){
				i++;
			}
			int end = i-1;
			String temp = path.substring(start,end+1);
			if(temp.equals("..")){
				if(!s.isEmpty()){
					s.pop();
				}
			}else if(!temp.equals(".")){
				s.push(temp);
			}
		}
		if(s.isEmpty()) return "/";
		while(!s.isEmpty()){
			res = "/"+s.pop()+res;
		}
		return res;
	}
}

	







