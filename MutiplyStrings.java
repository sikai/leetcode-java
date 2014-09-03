public class Solution {
    public String multiply(String num1, String num2) {
		if(num1.equals("")|| num2.equals("") || num1==null || num2==null) return "";		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int[] cache = new int[num1.length()+num2.length()];
		for(int i=0;i<num1.length();i++){
			int a = num1.charAt(i)-'0';
			for(int j=0;j<num2.length();j++){
				int b = num2.charAt(j)-'0';
				cache[i+j]+=a*b;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<cache.length;i++){
			int digit = cache[i]%10;
			int carry = cache[i]/10;
			sb.insert(0,digit);
			if(i<cache.length-1){
				cache[i+1]+=carry;
			}
		}
		String ret = sb.toString();
		int start = 0;
		while(start<ret.length() && ret.charAt(start)=='0'){
			start++;
		}
		if(start==ret.length()){
			return "0";
		}
		return ret.substring(start);
	}
}

 