public class Solution {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int wordLen = L[0].length();
 		HashMap<String, Integer> ListCount = new HashMap<String, Integer>();
		for(String ss : L){
			if(!ListCount.containsKey(ss)) ListCount.put(ss,1);
			else ListCount.put(ss,ListCount.get(ss)+1);
		}       
		for(int i=0;i<S.length()-wordLen*L.length +1;i++){
			HashMap<String, Integer> expectCount = new HashMap<String,Integer>();
			int j=0;
			for(;j<L.length;j++){
				String sub = S.substring(i+j*wordLen,wordLen);
				if(!expectCount.containsKey(sub)) expectCount.put(sub,1);
				else expectCount.put(sub,expectCount.get(sub)+1);
				if(!ListCount.containsKey(sub) || expectCount.get(sub)>ListCount.get(sub)) break;
			}
			if(j==L.length){
				ret.add(i);
			}		
		}
	return ret;	
    }
}

public ArrayList<Integer> findSubstring(String S, String[] L) {
	ArrayList<Integer> ret = new ArrayList<Integer>();
	int wordL = L[0].length();
	HashMap<String,Integer> expect = new HashMap<String,Integer>();
	for(String s:L){
		if(!containsKey(s)) expect.put(s,1);
		else expect.put(s,expect.get(s)+1);
	}
	for(int i=0;i<=S.length()-wordL*L.length;i++){
		HashMap<String,Integer> actual = new HashMap<String,Integer>();
		int j=0;
		for(;j<L.length;j++){
			String temp=S.substring(i+j*wordL,i+j*wordL+wordL);
			if(!actual.containsKey(temp)) actual.put(temp,1);
			else actual.put(temp,actual.get(temp)+1);
			if(!expect.containsKey(temp)||expect.get(temp)<actual.get(temp)){
				break;
			}
		}
		if(j==L.length) ret.add(i);
	}