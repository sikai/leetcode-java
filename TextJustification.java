public class Solution {
    public ArrayList<String> fullJustify(String[] words, int L) {
     	ArrayList<String> ret = new ArrayList<String>();
		if(words.length()<1) return ret;
		int i=0;
		while(i<words.length){
			int sum = 0;
			int start = i;
			while(i<words.length && sum + words[i].length()<=L){
				sum+=words[i]+1;
				i++;
			}
			int end = i-1;
			int interval_count = end-start;
			int space_avg = 0;								int space_left = 0;
			if(interval_count>0){
				int space_avg = (L-sum+interval_count+1)/interval_count;
				int space_left = (L-sum+interval_count+1)%interval_count;
			}
			StringBuilder sb = new StringBuilder();;
			for(int j=start;j<end;j++){
				sb.append(words[j]);
				if(i==words.length()){
					sb.append(" ");
				}
				else{
					for(int k=0;k<space_avg;k++){
						sb.append(" ");
					}
					if(space_left>0){
						sb.append(" ");
						space_left--;
					}
				}
			}
			String line = sb.toString();
			line+=words[end];
			if(line.length()<L){
				for(int m=0;m<L-line.length();m++){
					line+=" ";
				}
			}
			ret.add(line);
		}   
    }
}