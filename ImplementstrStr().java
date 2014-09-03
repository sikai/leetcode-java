public class Solution {
    public String strStr(String haystack, String needle) {
		if(haystack.equals("")) return "";
		if(needle.equals("")) return haystack;
		if(haystack.equals(needle)) return needle;
		if(needle.length()>haystack.length()) return "";
		for(int i=0;i<=haystack.length()-needle.length();i++){
			int j=i;
			for(;j<needle.length()+i;j++){
				if(haystack.charAt(j)!=needle.charAt(j-i)){
					break;
				}
			}
			if(j==needle.length()+i) return haystack.substring(i);
		}
		return "";
	}
}

public String strStr(String haystack, String needle) {
	if(haystack==null) return null;
	if(needle==null || needle.equals("")) return haystack;
	if(haystack.length()<needle.length()) return null;
	for(int i=0;i<=haystack.length()-needle.length();i++){
		int j=i;
		for(;j<needle.length()+i;j++){
			if(haystack.charAt(j)!=needle.charAt(j-i)) break;
		}
		if(j==needle.length()+i) return haystack.substring(i);
	}
	return ""; 	
}
