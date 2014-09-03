public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		if(numRows==0) return ret;
		ArrayList<Integer> inter = new ArrayList<Integer>();
		inter.add(1);
		ret.add(inter);
		helper(ret,inter,1,numRows);
		return ret;
	}
	public void helper(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int n, int numRows){
		if(n==numRows) return;
		ArrayList<Integer> a  = new ArrayList<Integer>();
		a.add(1);
		for(int i=1;i<inter.size();i++){
			a.add(inter.get(i)+inter.get(i-1));
		}
		a.add(1);
		ret.add(a);
		helper(ret,a,n+1,numRows);
	}
}

public ArrayList<ArrayList<Integer>> generate(int numRows) {
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	if(numRows==0) return ret;
	ArrayList<Integer> inter = new ArrayList<Integer>();
	inter.add(1);
	ret.add(inter);
	helper(ret,inter,1,numRows);
	return ret;
}
public void helper(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> inter, int lvl, int numRows){
	if(lvl==numRows) return;
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	for(int i=0;i<inter.size()-1;i++){
		a.add(inter.get(i)+inter.get(i+1));
	}
	a.add(1);
	ret.add(a);
	helper(ret,a,lvl+1,numRows);
}






