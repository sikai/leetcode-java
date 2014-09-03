public class Solution {
    public String getPermutation(int n, int k) {
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			numlist.add(i+1);
		}     	   
		//Get n!
		int fact = 1;
		for(int i=1;i<=n;i++){
			fact *= i;
		}
		// change k from 1-based index to 0-based index;
		k--;
		String res = "";
		for(int i=0;i<n;i++){
			fact = fact/(n-i); // first_index spreading range
			int first_digit_index = k/fact;
			// Now search in the range of first_digit: new index k
			k=k%fact;
			int num_on_first_digit = numlist.get(first_digit_index);
			res += (char) (num_on_first_digit + '0');
			//remove the first_digit from list
			numlist.remove(first_digit_index);
		}
		return res;
    }
}		

