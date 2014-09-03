public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> ret = new ArrayList<String>();
		if(n==0) return ret;
		String inter = "";
		dfs(ret,inter,0,0,n);
		return ret;
    }
	public void dfs(ArrayList<String> ret, String inter, int leftNum, int rightNum, int n){
		if(rightNum==n && leftNum==n){
			ret.add(inter);
		}
		if(leftNum<n){
			inter+="(";
			dfs(ret,inter,leftNum+1,rightNum,n);
			inter = inter.substring(0,inter.length()-1);
		}
		if(rightNum<leftNum){
			inter+=")";
			dfs(ret,inter,leftNum,rightNum+1,n);
			inter = inter.substring(0,inter.length()-1);
		}
	}
}


countWays(int n, int denom){
	int next_denom = 0;
	switch (denom) {
		case '25':
			nex_denom = 10;
			break;
		case '10':
			nex_deno = 5;
			break;
		case '5' :
			nex_demo = 1;
			break;
		case '1'
			return 1;
	}
	int ways = 0;
	for(int i=0;i*denom<=n;i++){
		ways += countWays(n-i*denom,next_demo);
	}
	return ways;
}


public void dfs(ArrayList<String> ret, String inter, int left_num, int right_num, int n){
	if(left_num==n && right_num==n){
		ret.add(new String(inter));
		return;
	}
	if(left_num<n){
		inter+="(";
		dfs(ret,inter,left_num+1,right_num,n);
		inter=inter.substring(0,inter.size()-1);
	}
	if(right_num<left_num){
		inter+=")";
		dfs(ret,inter,left_num,right_num+1,n);
		inter=inter.substring(0,inter.size()-1);
	}
}




	
	
	
	
	
	
	
	