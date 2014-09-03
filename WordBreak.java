public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
		if(s.length()==0) return false;
		boolean[] cache = new boolean[s.length()+1];
		cache[0] = true;
		for(int i=0;i<s.length();i++){
			if(!cache[i]) continue;
			for(String a: dict){
				int len = a.length();
				int end = i+len;
				if(end>s.length()) continue;
				if(cache[end]) continue;
				if(s.substring(i,end).equals(a)){
					cache[end]=true;
				}
			}
		}
		return cache[s.length()];
	}

}

public boolean wordBreak(String s, Set<String> dict) {
	boolean cache[] = new boolean[s.length()+1];
	cache[0]=true;
	for(int i=0;i<s.length();i++){
		if(!cache[i]) continue;
		for(String a:dict){
			int len=a.length();
			int end = i+len;
			if(end>s.length()) continue;
			if(cache[end]) continue;
			String o = s.substring(i,end);
			if(o.equals(a)){
				cache[end]=true;
			}
		}
	}
	return cache[s.length()];