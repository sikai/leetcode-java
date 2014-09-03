sfoiimport java.util.*;
public class AddBinary {
    public String addBinary(String a, String b) {
      	String ret = "";
		int carry = 0;
		int indexA = a.length()-1;
		int indexB = b.length()-1;
		while(indexA>=0 || indexB>=0 || carry==1){
			int int_a = indexA>=0? (a.charAt(indexA)-'0') : 0;
			int int_b = indexB>=0? (b.charAt(indexB)-'0') : 0;
			int sum = (int_a+int_b+carry)%2;
			carry = (int_a+int_b+carry)/2;
			ret=Integer.toString(sum)+ret;
			indexA--;
			indexB--;
		}  
		return ret;
    }

public static String addNumWithBase(String a, String b, int base){
	String ret = "";
	int carry = 0;
	int indexA = a.length()-1;
	int indexB = b.length()-1;
	while(indexA>=0 || indexB>=0 || carry>0){
		int a_num = indexA>=0? (a.charAt(indexA)-'0'):0;
		int b_num = indexB>=0? (b.charAt(indexB)-'0'):0;
		int digit = (a_num+b_num+carry)%base;
		carry = (a_num+b_num+carry)/base;
		ret=digit+ret;
		indexA--;
		indexB--;
	}
	return ret;
}

public static String addNumListWithBase(String[] strs, int base){
	String ret = "";
	int[] index = new int[strs.length];
	for(int i=0;i<strs.length;i++){
		index[i]=strs[i].length()-1;
	}
	int carry = 0;
	while(!isFinished(index) || carry>0){i
		int sum=0;
		for(int i=0;i<index.length;i++){
			int temp = index[i]>=0? (strs[i].charAt(index[i])-'0') : 0;
			sum+=temp;
		}
		sum+=carry;
		int digit = sum%base;
		ret=digit+ret;
		carry=sum/base;
		for(int j=0;j<index.length;j++){
			index[j]--;
		}
	}
	return ret;
	
}
public static boolean isFinished(int[] index){
	for(int i=0;i<index.length;i++){
		if(index[i]>=0) return false;
	}
	return true;
}
public static void main(String[] args) {
	String[] a = new String[]{"1","11","111","1111"};
	System.out.println(addNumListWithBase(a,10));
}
}

