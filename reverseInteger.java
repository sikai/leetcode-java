public class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
		String sb="";
		if(s.charAt(0)=='-'){
			sb = new StringBuilder(s.substring(1)).reverse().toString();
			int start=0;
			while(start<sb.length()){
				if(sb.charAt(start)!='0') break;
				start++;
			}
			if(start==sb.length()) return 0;
			sb="-"+sb.substring(start);
		}else{
			sb = new StringBuilder(s).reverse().toString();
			int start=0;
			while(start<sb.length()){
				if(sb.charAt(start)!='0') break;
				start++;
			}
			if(start==sb.length()) return 0;
			sb=sb.substring(start);
		}

		long ret = (long) (Integer.parseInt(sb));
		if(ret>Integer.MAX_VALUE) return Integer.MAX_VALUE;
		return (int) ret;
    }
}

public int reverse(int x) {
	if(x<0) return -1*reverse(-1*x);
	int ret = 0;
	while(x>0){
		int digit = x%10;
		ret=10*ret+digit;
		x=x/10;
	}
	return ret;
}