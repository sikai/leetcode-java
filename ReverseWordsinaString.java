public class Solution {  
    public String reverseWords(String s) {  
        if(s==null)  
            return "";  
        s = s.trim();  
        if(s=="")  
            return "";  
        StringBuffer sb = new StringBuffer();  
        int i = s.length()-1;  
        int last = i;  
        while(i>=0){  
            while(i>=0&&s.charAt(i)!=' '){  
                i--;  
            }  
            String temp = s.substring(i+1,last+1);  
            sb.append(temp);  
            sb.append(" ");  
            while(i>=0&&s.charAt(i)==' '){  
                i--;  
            }  
            last = i;  
        }  
        while(sb.length()>1&&sb.charAt(sb.length()-1)==' ')  
            sb.deleteCharAt(sb.length()-1);  
        return sb.toString();  
    }  
} 

public String reverseWords(String s) { 
	if(s==null || s.equals("")) return "";
	s.trim();
	if(s.equals("")) return "";
	StringBuffer sb = new StringBuffer();
	int i=s.length()-1;
	int last = i;
	while(i>=0){
		while(s.charAt(i)!=" "){
			i--;
		}
		String temp = s.substring(i+1,last+1);
		sb.append(temp);
		sb.append(" ");
		while(s.charAt(i)==" "){
			i--;
		}
		last=i;
	}	
	while(sb.length()>1 && s)
}