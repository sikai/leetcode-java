public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> ret= new ArrayList<String>();
		String inter = "";
		dfs(ret,inter,digits,0);
		return ret;
    }
	public void dfs(ArrayList<String> ret, String inter, String digits, int step){
		if(step==digits.length()){
			ret.add(inter);
			return;
		}
		String[] pool;
		switch (digits.charAt(step)) {
			case '2':
				pool = new String[]{"a","b","c"};
				break;
			case '3':
				pool = new String[]{"d","e","f"};
				break;
			case '4':
				pool = new String[]{"g","h","i"};
				break;
			case '5':
				pool = new String[]{"j","k","l"};
				break;
			case '6':
				pool = new String[]{"m","n","o"};
				break;
			case '7':
				pool = new String[]{"p","q","r","s"};
				break;
			case '8':
				pool = new String[]{"t","u","v"};
				break;
			case '9':
				pool = new String[]{"w","x","y","z"};
				break;
			default:
			    pool = null;
				break;
		}
		for(int i=0;i<pool.length;i++){
			inter+=pool[i];
			dfs(ret,inter,digits,step+1);
			inter=inter.substring(0,inter.length()-1);
		}
	}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	