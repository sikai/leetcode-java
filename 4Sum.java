public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(num.length<4) return res;
		Arrays.sort(num);
		for(int i=0;i<num.length-3;i++){
		    if(i>0 && num[i]==num[i-1]) continue;
			for(int j=i+1;j<num.length-2;j++){
			    if(j>i+1 && num[j]==num[j-1]) continue;
				int index1 = j+1;
				int index2 = num.length-1;
				while(index1<index2){
					if(num[i]+num[j]+num[index1]+num[index2]==target){
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[index1]);
						temp.add(num[index2]);
						res.add(temp);
						while(index1<index2 && num[index1+1]==num[index1]){
							index1++;
						}
						index1++;
						while(index1<index2 && num[index2-1]==num[index2]){
							index2--;
						}
						index2--;
					}else if(num[i]+num[j]+num[index1]+num[index2]<target){
						index1++;
					}else{
						index2--;
					}
				}
			}
		}
		return res;        
    }
}

public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(num.length<4) return ret;
		for(int start=0;start<=num.length-4;start++){
			if(start>0 && num[start]==num[start-1]) continue;
			for(int mid1=start+1;mid1<=num.length-3;mid1++){
				if(mid1>start+1 && num[mid1]==num[mid1-1]) continue;
				int mid2 = mid1+1;
				int end = num.length-1;
				while(mid2<end){
					if(num[start]+num[mid1]+num[mid2]+num[end]==target){
						ArrayList<Integer> a = new ArrayList<Integer>();
						a.add(num[start]);
						a.add(num[mid1]);
						a.add(num[mid2]);
						a.add(num[end]);
						ret.add(a);
						mid2++;
						end--;
						while(mid2<end && num[mid2]==num[mid2-1]){
							mid2++;
						}
						while(mid2<end && num[end]==num[end+1]){
							end--;
						}
					}else if(num[start]+num[mid1]+num[mid2]+num[end]<target){
						mid2++;
					}else{
						end--;
					}
				}
			}
		}
		return ret;
    }
}

















