public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        int a = s.length();
        int index = s.length()-1;
        while(index >=0 && s.charAt(index)==' '){
            index--;
        }
        if(index<0) return 0;
        for(int i=index;i>=0;i--){
            if(s.charAt(i)==' '){
                a = i;
                break;
            }
        }
        if(a==s.length()) return index+1;
        return index-a;
    }
}

public int lengthOfLastWord(String s) {
	if(s==null || s.equals("")) return 0;
	s=s.trim();
	int last = s.length()-1;
	while(last>=0 && s.charAt(last)!=' '){
		last--;
	}
	if(last<0) return 0;
	