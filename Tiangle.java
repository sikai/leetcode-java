public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
    	int[] cache = new int[triangle.size()];
		for(int i=0;i<triangle.size();i++){
			cache[i]=triangle.get(triangle.size()-1).get(i);
		}
		for(int i=triangle.size()-2;i>=0;i--){
			for(int j=0;j<triangle.get(i).size();j++){
				cache[j]=triangle.get(i).get(j)+Math.min(cache[j],cache[j+1]);
			}
		}
		return cache[0];
    }
}

