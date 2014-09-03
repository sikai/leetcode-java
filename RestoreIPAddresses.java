public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> ret = new ArrayList<String>();
		if(s.length()<4 || s.length()>12) return ret;
		dfs(ret,"",0,0,s);
		return ret;	
	}
	public void dfs(ArrayList<String> ret, String inter, int startIndex, int partNum, String s){
		if(s.length()-startIndex>(4-partNum)*3) return;
		if(s.length()-startIndex<(4-partNum)*1) return;
		if(s.length()==startIndex && partNum==4){
			String temp = inter.substring(0,inter.length()-1);
			ret.add(temp);
			return;
		}
		int num = 0;
		for(int i=statIndex;i<startIndex+3;i++){
			if(startIndex>s.length()) break;
			num = num*10 + (s.charAt(i)-'0');
			if(num<=255){
				inter+=s.charAt(i);
				dfs(ret,inter+".",i+1,partNum+1,s);
			}
			if(num==0){
				break;
			}
		}
	}
}
