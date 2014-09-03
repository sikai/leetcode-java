public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		ArrayList<String> inter = new ArrayList<String>();
		dfs(ret,inter,0,s);
		return ret;
    }
	public void dfs (ArrayList<ArrayList<String>> ret, ArrayList<String> inter, int step, String s){
		if(step==s.length()){
			ArrayList<String> temp = new ArrayList<String>(inter);
			ret.add(temp);
			return;
		}
		for(int i=step;i<s.length();i++){
			if(isValid(s,step,i)){
				inter.add(s.substring(step,i+1));
				dfs(ret,inter,i+1,s);
				inter.remove(inter.size()-1);
			}
		}
	}
	public boolean isValid(String s, int start, int end){
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)) return false;
			start++;
			end--;
		}
		return true;
	}
}

