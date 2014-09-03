r
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
 		ArrayList<String> ret = new ArrayList<String>();
		HashMap<String,Integer> mp = new HashMap<String,Integer>();
		for(int i=0;i<strs.length;i++){
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			String ss = new String(c);
			if(!mp.containsKey(ss)){
				mp.put(ss,i);
			}else{
				ret.add(strs[i]);
				if(mp.get(ss)!=-1){
					ret.add(strs[mp.get(ss)]);
					mp.put(ss,-1);
				}
			}
		}
		return ret;       
    }
}


public ArrayList<ArrayList<String>> anagrams(String[] strs) {
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();	for(int i=0;i<strs.length;i++){
		char[] char_arr = strs[i].toCharArray();
		String temp = new String(char_arr);
		if(!map.containsKey(temp)){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(strs[i]);
			map.put(temp,list);
		}else{
			map.get(temp).add(strs[i]);
		}
	}
	for(String s: map.keySet()){
		ret.add(map.get(s));
	}
	return ret;
}
