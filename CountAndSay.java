public class Solution {
    public String countAndSay(int n) {
        String ret="1";
        for(int i=1;i<n;i++){
            ret = helper(ret);
        }
        return ret;
    }
	public String helper(String s){
		String ret = "";
		for(int i=0;i<s.length();i++){
		    char c = s.charAt(i);
			int char_num = 1;
			while(i<s.length()-1 && s.charAt(i+1)==c){
				char_num++;
				i++;
			}
			char temp = (char) (char_num +'0');
			ret+=temp;
			ret+=c;
		}
		return ret;
	}
}

public String countAndSay(int n) {
	String ret="1";
	for(int i=1;i<n;i++){
		ret=helper(ret);
	}
	return ret;
}
public String helper(String s){
	String ret="";
	int i=0;
	while(i<s.length()){
		char c = s.charAt(i);
		i++;
		int c_num = 1;
		while(i<s.length() && s.charAt(i)==c){
			c_num++;
			i++;
		}
		ret+=Integer.toString(c_num);
		ret+=c;
	}
	return ret;
}

