public class Solution {
    public void nextPermutation(int[] num) {
		int k=-1;
		for(int i=num.length-1;i>=0;i--){
			if(i>0 && num[i]>num[i-1]){
				k=i;
				break;
			}
		}
		if(k==-1){
			Arrays.sort(num);
		}else{
		    int m = 0;
		    for(int j=num.length-1;j>=k;j--){
			    if(num[j]>num[k-1]){
				    m=j;
				    break;
			    }
		    }
		    swap(num,k-1,m);
		    Arrays.sort(num,k,num.length);
		}
    }
	public void swap(int[] num, int i, int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}

