public class NaiveSolution {
	int count=0;
    public int numDistinct(String S, String T) {
 		if(S.length()<T.length()) return 0;
		dfs(S,T);
		return count;
    }
	public void dfs(String inter, String T){
		if(inter.length()<T.length()) return;
		if(inter.equals(T)){
			count++;
			return;
		}
		for(int i=0;i<inter.length();i++){
			inter=inter.substring(0,i)+inter.substring(i+1,inter.length());
			dfs(inter,T);
			inter=inter.substring(0,i)+inter.charAt(i)+inter.substring(i,inter.length());
		}
	}
}

public class Solution {
	public int numDistinct(String S, String T) {
	int[][] table = new int[S.length() + 1][T.length() + 1];
 
	for (int i = 0; i <= S.length(); i++)
		table[i][0] = 1;
 
	for (int i = 1; i <= S.length(); i++) {
		for (int j = 1; j <= T.length(); j++) {
			if (S.charAt(i - 1) == T.charAt(j - 1)) {
				table[i][j] = table[i - 1][j] + table[i - 1][j - 1];
			} else {
				table[i][j] = table[i - 1][j];
			}
		}
	}
 
	return table[S.length()][T.length()];
    }
}

public int numDistinct(String S, String T) {
	int[][] cache = new int[S.length()+1][T.length()+1];
	for(int i=0;i<S.length()+1;i++){
		cache[i][0]=1;
	}
	for(int i=1;i<=S.length();i++){
		for(int j=1;j<=T.length();j++){
			if(S.charAt(i-1)!=T.charAt(j-1)){
				cache[i][j]=cache[i-1][j];
			}else{
				cache[i][j]=cache[i-1][j]+cache[i-1][j-1];
			}
		}
	}
	return cache[S.length()][T.length()];
	
	


