public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int digits = 1;
		while(x/digits>=10){
			digits*=10;
		}
		while(x>0){
			int head = x/digits;
			int end = x%10;
			if(head!=end) return false;
			x=x%digits/10;
			digits=digits/100;
		}
		return true;
    }
}

public boolean isPalindrome(int x) {
	int digit = 1;
	while(x/digit>=10){
		digit*=10;
	}
	while(x>0){
		int head = x/digit;
		int tail = x%10;
		if(head!=tail) return false;
		x=x%digit/10;
		digit=digit/100;
	}
	return true;
