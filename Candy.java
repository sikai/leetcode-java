public class Solution {
    public int candy(int[] ratings) {
		if(ratings.length==0) return 0;
		int[] candy  = new int[ratings.length];
		candy[0] = 1;
		int i=1;
		for(;i<ratings.length;i++){
			if(ratings[i-1]<ratings[i]){
				candy[i]=candy[i-1]+1;
			}
			else if(ratings[i-1]==ratings[i]){
				candy[i]=1;
			}else{
				candy[i]=candy[i-1]-1;
			}
			if(i<ratings.length-1 && ratings[i-1]>ratings[i] && ratings[i+1]>=ratings[i]){
				reAdjust(ratings,candy,i);
			}
		}   
		if(ratings.length>=2 && ratings[i-2]>ratings[i-1]){
			reAdjust(ratings,candy,i-1);
		} 
		int sum = 0; 
		for(int j=0;j<candy.length;j++){
			sum+=candy[j];
		}
		return sum;
    }
	public void reAdjust(int[] ratings, int[] candy, int startIndex){
		int k = startIndex;
		int diff = 1-candy[k];
		while(k>0 && ratings[k-1]>ratings[k]){
			candy[k]+=diff;
			k--;
		}
		if(diff>0){
			candy[k]+=diff;
		}
	}
}
public int candy(int[] ratings) {
	int[] candy = new int[ratings.length];
	carndy[0]=1;
	for(int i=1;i<ratings.length;i++){
		if(ratings[i]>ratings[i-1]){
			candy[i]=candy[i-1]+1;
		}else if(ratings[i]<ratings[i-1]){
			candy[i]=candy[i-1]-1;
		}
		else{
			candy[i]=1;
		}
		if(i<=ratings.length-2 && ratings[i]<ratings[i-1] && ratings[i]<=ratings[i+1]){
			reorder(ratings,candy,i);
		}	
	}
	if(ratings[ratings.length-2]>ratings[ratings.length-1]){
		reorder(ratings,candy,ratings.length-1);
	}
	for(int i=0;i<candy.length;i++){
		num+=candy[i];
	}
	return num;
}
public void reorder(int[] ratings, int[] candy, int i){
	int diff = 1-candy[i];
	while(i>0 && ratings[i-1]>ratings[i]){
		candy[i]+=diff;
		i--;
	}
	if(diff>0){
		ratings[i]+=diff;
	}
}

	



