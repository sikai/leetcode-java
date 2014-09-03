public class Solution {
    public int minDistance(String word1, String word2) {
		int[][] cache = new int[word1.length()+1][word2.length()+1];
		for(int i=0;i<=word1.length();i++){
			cache[i][0]=i;
		}
		for(int i=0;i<=word2.length();i++){
			cache[0][i]=i;
		}
		for(int i=0;i<word1.length();i++){
			for(int j=0;j<word2.length();j++){
				if(word1.charAt(i)==word2.charAt(j)){
					cache[i+1][j+1]=cache[i][j];
				}else{
					cache[i+1][j+1]=Math.min(Math.min(cache[i][j+1],cache[i+1][j]), cache[i][j])+1;
				}
			}
		}
		return cache[word1.length()][word2.length()];
    }
}
