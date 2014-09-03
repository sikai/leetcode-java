public class Solution {
    public String longestPalindrome2(String s) {
		if(s.length()<1) return null;
		String ret = s.substring(0,1);
		int max_len = 1;
		for(int i=0;i<s.length();i++){
			String temp1 = helper(s,i,i);
			if(temp1.length()>max_len){
				max_len = temp1.length();
				ret = temp1;
			}
			String temp2 = helper(s,i,i+1)
			if(temp2.length()>max_len){
				max_len = temp2.length();
				ret = temp2;
			}
		}
		return ret;
	}
	public String helper(String s, int start, int end){
		while(start>=0 && end<=s.length()-1 && s.charAt(start)==s.charAt(end)){
			start--;
			end++;
		}
		return s.substring(start+1,end);
	}
}

public class Solution2{
	public String longestPalindome2(String s){
		if(s.length()<1) return null;
		if(s.length()==1) return s;
		String ret = s.substring(0,1);
		int max_len = 1;
		boolean[][] cache = new boolean[s.length()][s.length()];
		for(int i=0;i<s.length();i++){
			cache[i][i]=true;
		}
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				cache[i][i+1] = true;
			}else{
				cache[i][i+1] = false;
			}
		}
		for(int len=3;len<=s.length();len++){
			for(int i=0;i<=s.length()-len;i++){
				if(s.charAt(i)==s.charAt(len+i-1) && cache[i+1][len+i-2]==true){
					cache[i][len+i-1]=true;
					if(len>max_len){
						max_len = len;
						ret = s.substring(i,len+i);
					}
				} else{
					cache[i][len+i-1]=false;
				}
			}
		}
		return ret;
	}
}

public class Solution3 {
    public String longestPalindrome(String s) {
        if(s.length()<1) return null;
		if(s.length()==1) return s;
		String ret = s.substring(0,1);
		int max_len = 1;
		boolean[][] cache = new boolean[s.length()][s.length()];
		for(int i=s.length()-1;i>=0;i--){
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j) && (j-i<2||cache[i+1][j-1]==true)){
					cache[i][j]=true;
					if(max_len<j-i+1){
						max_len = j-i+1;
						ret = s.substring(i,j+1);
					}
				}else{
					cache[i][j]=false;
				}
			}
		}
		return ret;
    }
}

public String longestPalindrome(String s) {
	int max = 1;
	String ret = "";
	boolean m = new boolean[s.length()][s.length()];
	for(int i=s.length()-1;i>=0;i--){
		for(int j=i;j<s.length();j++){
			if(s.charAt(i)==s.charAt(j) && (j-i<2 || m[i+1][j-1])){
				m[i][j]=true;
				if(j-i+1>max){
					max=j-i+1;
					ret=s.substring(i,j-1);
				}
			}
		}
	}
	return ret;
		
}
	

