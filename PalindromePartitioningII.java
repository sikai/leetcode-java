public class Solution {
    public int minCut(String s) {
		int[] D = new int[s.length()];
		boolean [][] cache = new boolean[s.length()][s.length()];
		for(int i=s.length()-1;i>=0;i--){
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j) && (j-i<2 || cache[i+1][j-1])){
					cache[i][j]=true;
				}else{
				    cache[i][j]=false;
				}
			}
		}
		for(int i=0;i<s.length();i++){
			int ms = s.length();
			if(cache[0][i]) D[i]=0;
			else{
				for(int j=0;j<i;j++){
					if(cache[j+1][i] && D[j]+1<ms) ms = D[j]+1;
				}
			    D[i] = ms;
			}

		}
		return D[s.length()-1];        
    }
}


public class Solution {
    public int minCut(String s) {
		if(s.length()<1) return 0;
		int[] cut = new int[s.length()];
		boolean[][] p = new boolean[s.length()][s.length()];		for(int i=s.length()-1;i>=0;i++){
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j) && (j-i<2 || p[i+1][j-1])){
					p[i][j]=true;
				}else{
					p[i][j]=false;
				}
			}
		}
		for(int i=0;i<s.length();i++){
			int ms = s.length();
			if(p[0][i]) cut[i]=0;
			else{
				for(int j=0;j<i;j++){
					if(p[j+1][i] && D[j]+1<ms) ms=D[j]+1;
				}
				D[i]=ms;
			}
		}
		return D[s.length()-1]
	}
}



