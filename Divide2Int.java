public class Solution {
    public int divide(int dividend, int divisor) {
		if(dividend < 0) return divide(-1*dividend,divisor) * (-1);
		if(divisor < 0 ) return divide(dividend, -1 * divisor) * (-1);
 		int a = dividend;
		int res = 0;
		while(a-c>=0){
			int c = divisor;
			int i = 0;
			while(a-c>=0){
				a = a-c;
				res += 1<<i;
				i++;
				c<<=1;
			}
		}
		return res;       
    }
}

public int divide(int dividend, int divisor) {
	if(divisor==0) throw ArithmeticException;
	if(dividend<0) return -1*divide(-1*dividend,divisor);
	if(divisor<0) return -1*divide(dividend,-1*divisor);
	int ret=0;
	int a =dividend;
	while(a-dividend>=0){
		int c = divisor;
		int i=0;
		while(a-c>=0){
			a=a-c;
			c<=1;
			ret+=1<<i;
			i++;
		}
	}
