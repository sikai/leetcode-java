public class Solution {
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
		ArrayList<String> res = new ArrayList<String>();
		if(s.length()==0) return res;   
		boolean possible[] = new boolean[s.length()+1];
		for(int i=0;i<possible.length;i++){
			possible[i]=true;
		}
		dfs(res,"",s,dict,0,possible);
		return res;
    }
	public void dfs(ArrayList<String> res, String inter, String s, Set<String> dict, int lvl, boolean[] possible){
		if(lvl == s.length()){
			String temp=inter.substring(0,inter.length()-1);
			res.add(temp);
		}
		for(int i=lvl;i<s.length();i++){
			if(!possible[i+1]) continue;
			String ele = s.substring(lvl,i+1);
			for(String a:dict){
				if(ele.equals(a)){
					inter+=ele;
					inter+=" ";
					int original_size = res.size();
					dfs(res,inter,s,dict,i+1,possible);
					if(res.size()==original_size) possible[i+1]=false;
					inter=inter.substring(0,inter.length()-ele.length()-1);
					break;
				}
			}
		}
	}
}

