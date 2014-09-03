public class Solution {
    public ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ret.add(0);
		if(n==0) return ret;
		for(int i=1;i<=n;i++){
			ret = helper(ret,i);
		}			
		return ret;
    }
	public ArrayList<Integer> helper (ArrayList<Integer> in, int n){
		int mask = 1 << (n-1);
		ArrayList<Integer> list = new ArrayList<Integer>(in);
		for(int i=in.size()-1;i>=0;i--){
			int temp = in.get(i);
			temp = temp | mask;
			list.add(temp);
		}
		return list;
	}
	
}
public ArrayList<Integer> grayCode(int n) {
	ArrayList<Integer> ret= new ArrayList<Integer>();
	ret.add(0);
	if(n==0) return ret;
	for(int i=1;i<=n;i++){
		ret=helper(ret,i);
	}
	return ret;
}
public ArrayList<Integer> helper(ArrayList<Integer> in, int n){
	ArrayList<Integer> ret = new ArrayList<Integer>();
	int mask = 1<<(n-1);
	for(int i=in.size()-1;i>=0;i--){
		int temp = in.get(i);
		ret.add(temp|mask);
	}
	return ret;
}


