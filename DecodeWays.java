public class Solution {
    public int numDecodings(String s) {
		if(s.length()==0) return 0;
		int[] cache = new int[s.length()];
		if(s.charAt(0)=='0') return 0;
		cache[0] = 1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)=='0') cache[i] = 0;
			else cache[i] = cache[i-1];
			if(isValid(s,i-1,i)){
				cache[i]+=(i>=2)? cache[i-2]:1;
			}
		}
		return cache[s.length()-1];
    }
	public boolean isValid(String s, int a, int b){
		String c = s.substring(a,b+1);
		int d = Integer.parseInt(c);
		return d>=10 && d<=26;
	}

}
public class Solution {
	public int numDecodings(String s){
		if(s.length()==0) return 0;
		if(s.charAt(0)=='0') return 0;
		int f_0 = 1;
		int f_1 = 1;
		if(s.length()==1) return f_1;
		int f_2 = 0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)=='0') f_2 = 0;
			else f_2 = f_1;
			if(isValid(s,i-1,i)){
				f_2+=f_0;
			}
			f_0 = f_1;
			f_1 = f_2;
		}
		return f_2;
	}
	public boolean isValid(String s, int a, int b){
		String c = s.substring(a,b+1);
		int d = Integer.parseInt(c);
		return d>=10 && d<=26;
	}
}

public class Solution {
	public int numDecodings(String s){
		if(s.length()==0) return 0;
		int cache = new int[s.length()];
		if(s.charAt(0)=='0') return 0;
		cache[0]=1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)=='0'){
				cache[i]=0;
			}else{
				cache[i]=cache[i-1];
			}
			if(isValid(s,i-1,i)){
				cache[i]+=(i>=2)? cache[i-2]:1;
			}
		}
		return cache[s.length()-1];	
	}
	public isVald(int i, int j, String s){
		int val = 10*(int)(s.charAt(i)-'0') + (int)(s.charAt(j)-'0');
		if(val>=10 && val<=26) return true;
		return false;
	}
}

	
	
	public int numDecodings(String s){
		if(s.charAt(0)=='0') return 0;
		int f_0=1;
		int f_1=1;
		if(s.length()==1) return f_1;
		int f_2=0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)=='0') f_2=0;
			else f_2=f_1;
			if(isVAlid(s,i-1,i)){
				f_2+=f_0;
			}
			f_1=f_2;
			f_0=f_1;
		}	
	}
	public boolean isValid(String s, int i, int j){
		String temp = s.substring(i,j+1);
		int t = Integer.ParseInt(temp);
		return(t>=10 && t<=26);
	}
	
