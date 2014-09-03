public class Solution {
    public String intToRoman(int num) {
		String s = Integer.toString(num);
		String ret = "";
		int t=s.length();
		for(int i=0;i<s.length();i++){
			int digit = s.charAt(i)-'0';
			switch(t){
				case 4 :
					for(int j=0;j<digit;j++){
						ret+="M";
					}
					break;
				case 3 :
					if(digit<=3){
						for(int j=0;j<digit;j++){
							ret+="C";
						}
					}else if(digit==4){
						ret+="CD";
					}else if(digit<9){
						ret+="D";
						for(int j=0;j<digit-5;j++){
							ret+="C";
						}
					}else{
						ret+="CM";
					}
					break;
				case 2 :
					if(digit<=3){
						for(int j=0;j<digit;j++){
							ret+="X";
						}
					}else if(digit==4){
						ret+="XL";
					}else if(digit<9){
						ret+="L";
						for(int j=0;j<digit-5;j++){
							ret+="X";
						}
					}else{
						ret+="XC";
					}
					break;
				case 1 :
					if(digit<=3){
							for(int j=0;j<digit;j++){
								ret+="I";
							}
						}else if(digit==4){
							ret+="IV";
						}else if(digit<9){
							ret+="V";
							for(int j=0;j<digit-5;j++){
								ret+="I";
							}
						}else{
							ret+="IX";
						}
						break;
			}
			t--;
		}
		return ret;
    }
}


    public String intToRoman(int num) {
		String ret = "";
		String input = Integer.toString(num);
		int t = input.length();
		for(int i=0;i<input.length();i++){
			int digit = s.charAt(i)-'0';
			switch (t) {
				case '4':
					for(int i=0;i<digit){
						ret+="M";
					}
				case '3':
					if(digit<=3){
						for(int i=0;i<digit;i++)
						ret+="C";
					}else if(digit==4){
						ret+="CD";
					}else if(digit<9){
						ret+="D";
						for(int i=0;i<digit-5;i++){
							ret+="C";
						}
					}else{
						ret+="CM";
					}
				default:
					break;
			}
		}
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		