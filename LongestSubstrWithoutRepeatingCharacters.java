public class Solution {
    public int lengthOfLongestSubstring(String s) {
		boolean [] cache = new boolean[256];
		int max=0;
		int prev=0;
		int i=0;
		while(i<s.length()){
			if(cache[s.charAt(i)]){
				max = Math.max(max,i-prev);
				while(s.charAt(prev)!=s.charAt(i)){
					cache[s.charAt(prev)]=false;
					prev++;
				}
				prev++;
				i++;
			}else{
				cache[s.charAt(i)]=true;
				i++;
			}
		}
		return Math.max(max,s.length()-prev);      
    }
}



public int lengthOfLongestSubstring(String s) {
	int[] dict = new int[256];
	int start = 0;
	int i=0;
	int len=0;
	while(i<s.length()){
		if(dict[s.charAt(i)-'0']==0){
			dict[s.charAt(i)-'0']++;
			i++;
		}else{
			len=Math.max(len,i-start);
			while(s.charAt(start)!=s.charAt(i)){
				dict[s.charAt(start)]--;
				start++;
			}
			start++;
			i++;
		}
	}	
	return len;
	
	
	
}

public int lengthOfLongestSubstring(String s) {
	int[] dict = new int[256];
	int i=0;
	int last = 0;
	while(i<s.length()){
		if(dict[s.charAt(i)-'0']==0){
			dict[s.charAt(i)-'0']++;
			i++;
		}else{
			max = Math.max(max,i-last);
			while(s.charAt(last)!=s.charAt(i)){
				dict[s.charAt(last)-'0']--;
				last++;
			}
			last++;
			i++;
		}
	}	
}