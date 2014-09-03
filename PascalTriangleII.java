public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
			for(int j=i-1;j>0;j--){
				ret.set(j,ret.get(j)+ret.get(j-1));			
			}
			ret.add(1);
		}
		return ret;	
    }
}

