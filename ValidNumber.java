public class Solution {
    public boolean isNumber(String s) {
     	s = s.trim();
		if(s.length()<1) return false;
		if(s.charAt(0)=='e' || s.charAt(s.length()-1)=='e') return false;
		String[] t = s.split("e");
		if(t.length==0 || t.length>2) return false;
		boolean res = isValid(t[0],true);
		if(t.length>1){
			res = res && isValid(t[1],false);
		}  
		return res; 
    }
	public boolean isValid(String s, boolean isPartOne){
		if(s.charAt(0)=='+' || s.charAt(0)=='-'){
			s = s.substring(1);
		}
		if(s.length()==0 || s.equals(".")) return false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='.'){
				if(!isPartOne) return false;
				isPartOne = false;
			} 
			else if(s.charAt(i)<'0' || s.charAt(i)>'9') return false;
		}
		return true;
	}
}