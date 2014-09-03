public class Solution {
    public int longestConsecutive(int[] num) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int max = 1;
		for(int i=0;i<num.length;i++){
			if(map.containsKey(num[i])) continue;
			map.put(num[i],1);
			if(map.containsKey(num[i]-1)){
				max = Math.max(max, merge(map,num[i]-1,num[i]));
			}
			if(map.containsKey(num[i]+1)){
				max = Math.max(max,merge(map,num[i],num[i]+1));
			}
		}
		return max;
    }
	public int merge(HashMap<Integer,Integer> map, int left, int right){
		int len = 0;
		int left_idx = left-map.get(left)+1;
		int right_idx = right+map.get(right)-1;
		len = right_idx-left_idx+1;
		map.put(left_idx,len);
		map.put(right_idx,len);
		return len;
	}
}

public int longestConsecutive(int[] num) {
	int max=0;
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<num.length;i++){
		if(map.containsKey(num[i])) continue;
		 map.put(num[i],1);
		if(map.containsKey(num[i]-1)) max = Math.max(max, merge(map,num[i]-1,num[i]));
		if(map.containsKey(num[i]+1)) max = Math.max(max, merge(map,num[i],num[i]+1));
	}
	return max;
	
}
public int merge(HashMap<Integer,Integer> map, int left, int right){
	int len=0;
	int left_idx = left-map.get(left)+1;
	int right_idx = right+map.get(right)-1;
	len = right_idx-left_idx+1;
	map.put(left_idx,len);
	map.put(right_idx,len);
	return len;
}

