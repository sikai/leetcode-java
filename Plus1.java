    public class Solution {
    public int[] plusOne(int[] digits) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = digits[digits.length-1]+1;
		arr.add(temp%10);
		int carry = temp/10;
        for(int i=digits.length-2;i>=0;i--){
			int digit = digits[i]+carry;
			arr.add(0,digit%10);
			carry = digit/10;
		}
		if(carry==1) arr.add(0,carry);
		int[] ret = new int[arr.size()]; 
        for(int i=0;i<arr.size();i++){
            ret[i]=arr.get(i);
        }
		return ret;
    }
}

