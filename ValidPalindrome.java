public class Solution {
    public boolean isPalindrome(String s) {
		if (s==null || s.length()==0) return true;
		s=s.trim();
		s=s.toLowerCase();
		int index1 = 0;
		int index2 = s.length()-1;
		while(index1<=index2){
			if(!isValid(s.charAt(index1))){
				index1++;
				continue;
			}
			if(!isValid(s.charAt(index2))){
				index2--;
				continue;
			}
			if(s.charAt(index1)!=s.charAt(index2)) return false;
			index1++;
			index2--;
		}        
		return true;
    }
	public boolean isValid(char c){
		if(c>='0' && c<='9') return true;
		if(c>='a' && c<='z') return true;
		return false;
	}
}