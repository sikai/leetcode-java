public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
		int start=gas.length-1;
		int end=0;
		int rest=gas[0]-cost[0];
		while(start!=end){
			if(rest>=0){
				end++;
				rest+=gas[end]-cost[end];
			}else{
				rest+=gas[start]-cost[start];
				start--;
			}
		}
		if(rest>=0) return (start+1)%gas.length;
		else return -1;       
    }
}

public int canCompleteCircuit(int[] gas, int[] cost) {
	int start = gas.length-1;
	int end = 0;
	int rest = gas[0]-cost[0];
	while (start>end) {
		if(rest>=0){
			end++;
			rest+=gas[end]-cost[end];
		}else{
			ret+=gas[start]-cost[start];
			start--;
		}
	}	
	if(rest<0) return -1;
	return start+1;
}
