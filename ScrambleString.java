public class Solution {
    public boolean isScramble(String s1, String s2) {
		if(s1==null || s2==null || s1.length() != s2.length()) return false;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String t1 = new String(c1);
		String t2 = new String(c2);
		if(!t1.equals(t2)) return false;
		else if(t1.length()==1) return true;
		boolean res;
		for(int i=0;i<s1.length()-1;i++){
			res = isScramble(s1.substring(0,i+1), s2.substring(0,i+1)) && isScramble(s1.substring(i+1), s2.substring(i+1));
			res |= isScramble(s1.substring(0,i+1),s2.substring(s1.length()-i-1)) && isScramble(s1.substring(i+1),s2.substring(0,s1.length()-i-1));
			if(res) return true;
		}
		return false;
    }
}

public calss Solution{
	public boolean isScramble(String s1, String s2){
		if(s1.equals(s2)) return true;
		if(s1.length()!=s2.length()) return false;
		boolean cache = new boolean[s1.length()][s2.length()][s1.length()+1];
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				cache[i][j][0] = true;
				if(s1.charAt(i)==s2.charAt(j)) cache[i][j][1] = true;
			}
		}
		for(int i=s1.length()-1;i>=0;i--){
			for(int j=s2.length()-1;j>=0;j--){
				for(int len=2;len<=Math.min(s1.length()-i,s2.length()-j);len++){
					for(int m=1;m<len;m++){
						cache[i][j][len]|=(cache[i][j][m] && cache[i+m][j+m][len-m]) || (cache[i][j+len-m][m] && cache[i+m][j][len-m]);
						if(cache[i][j][len]) break;
					}
				}
			}
		}
		return cache[0][0][s1.length()];
	}
}



public boolean isScramble(String s1, String s2){
	if(s1.length()!=s2.length()) return false;
	if s1.equals(s2) return true;
	for(int i=1;i<s1.length();i++){
		return isSc(s1.substring(0,i), s2.substring(0,i)) && isSc(s1.substring(i), s2.substring(i)) || iSce(s1.substring(0,i)) 
	}
	
	
	