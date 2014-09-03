	public class Solution {
	    public String minWindow(String S, String T) {
			if(S.length()==0) return "";
			if(S.length()<T.length()) return "";
			int[] expectCount = new int[256];
			int[] appearCount = new int[256];
			for(int i=0;i<T.length();i++){
				expectCount[T.charAt(i)-'0']++;
			}
			int wid_start = 0;
			int appear = 0;
			int minLen = Integer.MAX_VALUE;
			int minStart = 0;
			for(int wid_end=0;wid_end<S.length();wid_end++){
			    if(expectCount[S.charAt(wid_end)-'0']>0){
				    appearCount[S.charAt(wid_end)-'0']++;
				    if(appearCount[S.charAt(wid_end)-'0']<=expectCount[S.charAt(wid_end)-'0']) appear++;
			    }
				if(appear==T.length()){
					while(appearCount[S.charAt(wid_start)-'0']>expectCount[S.charAt(wid_start)-'0'] || expectCount[S.charAt(wid_start)-'0']==0){
						appearCount[S.charAt(wid_start)-'0']--;
						wid_start++;
					}
					// Now we find one candidate substring
					if(wid_end-wid_start+1 < minLen){
						minLen = wid_end-wid_start+1;
						minStart = wid_start;
					}
				}
			}
			if(minLen == Integer.MAX_VALUE) return "";
			return S.substring(minStart,minStart+minLen);        
	    }
	}
	
		
		
		
		
		
		
		
		
		
	}
	
	