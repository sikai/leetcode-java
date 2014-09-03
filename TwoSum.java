public class Solution {
    public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=0;i<numbers.length;i++){
			if(map.containsKey(numbers[i])){
				res[0]=map.get(numbers[i])+1;
				res[1]=i+1;
				return res;
			}else{
				map.put(target-numbers[i],i);
			}
		}
		return res;       
    }
}

