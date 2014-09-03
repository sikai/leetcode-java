public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
		if(s1.length()+s2.length() != s3.length()) return false;
		dfs(s1,s2,s3,0,0,0);
    }
	public boolean dfs(String s1, String s2, String s3, int index1, int index2, int index3){
		if(index3==s3.length()) return true;
		
		if(index1<s1.length() && s1.charAt(index1)==s3.charAt(index3)){
			if(dfs(s1,s2,s3,index1+1,index2,index3+1)) return true;
		}
		if(index2<s2.length() && s2.charAt(index2)==s3.charAt(index3)){
			if(dfs(s1,s2,s3,index1,index2+1,index3+1)) return true;
		}
		return false;
	}
}

public class Solution{
	public boolean isInterleave(String s1, String s2, String s3){
	    if(s1.length()+s2.length() != s3.length()) return false;
		boolean[][] cache = new boolean[s1.length()+1][s2.length()+1];
		cache[0][0] = true;
		for(int i=1;i<=s1.length();i++){
			if(s1.charAt(i-1)==s3.charAt(i-1)) cache[i][0] = cache[i-1][0];
			else cache[i][0] = false;
		}
		for(int i=1;i<=s2.length();i++){
			if(s2.charAt(i-1)==s3.charAt(i-1)) cache[0][i] = cache[0][i-1];
			else cache[0][i] = false;
		}
		for(int i=1;i<=s1.length();i++){
			for(int j=1;j<=s2.length();j++){
				if(s1.charAt(i-1)==s3.charAt(i+j-1)){
					cache[i][j] = cache[i-1][j];
				}
				if(s2.charAt(j-1)==s3.charAt(i+j-1)){
					cache[i][j] |= cache[i][j-1];
				}
			}
		}
		return cache[s1.length()][s2.length()];
	}
}



public class Solution{
	public boolean isInterleave(String s1, String s2, String s3){
		boolean[][] m = new boolean[s1.length()+1][s2.length()+1];
		m[0][0]=true;
		for(int i=1;i<=s1.length();i++){
			if(s1.charAt(i-1)==s3.charAt(i-1)){
				m[i][0]=m[i-1][0];
			}
		}
		for(int i=1;i<=s2.length();i++){
			if(s2.charAt(i-1)==s3.charAt(i-1)){
				m[0][i]=m[0][i-1];
			}
		}
		for(int i=1;i<=s1.length();i++){
			for(int j=1;j<=s2.length();j++){
				if(s1.charAt(i-1)==s3.charAt(i+j-1)){
					m[i][j]=m[i-1][j];
				}
				if(s2.charAt(j-1)==s3.charAt(i+j-1)){
					m[i][j]|=m[i][j-1];
				}
			}
		}
		return m[s1.length()][s2.length*()];
	}
	
		
	
	