public class Solution {
    public boolean isMatch(String s, String p) {
		int pl = 0;  
           for (int i = 0; i < p.length(); i++) {  
                if (p.charAt(i) != '*') {  
                     pl++;  
                }  
           }  
           if (pl > s.length()) {  
                return false;  
           }  
           if (s.length() == 0 && pl == 0) {  
                return true;  
           }  
		boolean cache[][] = new boolean[s.length()+1][p.length()+1];
		cache[0][0]=true;
		for(int i=1;i<=p.length();i++){
			if(p.charAt(i-1)=='*') cache[0][i]=cache[0][i-1];
			else cache[0][i] = false;
		}      
		for(int i=1;i<=s.length();i++){
			for(int j=1;j<=p.length();j++){
				if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?') cache[i][j]=cache[i-1][j-1];
				else if(p.charAt(j-1)!='*') cache[i][j]=false;
				else{
					cache[i][j] = cache[i][j-1] || cache[i-1][j-1] || cache[i-1][j];
				}
			}
		}
		return cache[s.length()][p.length()];
    }
}

