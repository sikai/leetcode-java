public class Solution {
	public boolean isMatch(String s, String p) {
  		return tryMatch(p, s, 0, 0);
	}
	
	private boolean tryMatch(String p, String s, int i, int j) {
  		if (i == p.length())
    		return j == s.length();
  		if (i == p.length() - 1 || p.charAt(i + 1) != '*') { 
    		if (matchChar(p, s, i, j))
      			return tryMatch(p, s, i + 1, j + 1);
    		else
      			return false;
  		} else {
    		boolean skip = tryMatch(p, s, i + 2, j); 
    			if (skip)
      				return true;
    while (matchChar(p, s, i, j)) {
      if (tryMatch(p, s, i + 2, j + 1))
        return true;
      j++;
    }
    return false;
  }
}
private boolean matchChar(String p, String s, int i, int j) {
  if (i >= p.length() || j >= s.length())
    return false;
  return p.charAt(i) == s.charAt(j) || p.charAt(i) == '.';
}
}

public class SolutionDP{
	public class isMatch(String s, String p){
		if(s==null || p==null) return false;
		int sl = s.length();
		int pl = p.length();
		boolean[][] m = new boolean[pl+1][sl+1];
		m[0][0] = true;
		for(int i=1;i<pl;i++){
			m[i][0] = false;
			if(p.charAt(i-1)=='*'){
				m[i][0] = m[i-2][0];
			}
		}
		for(int j=1;j<sl;j++){
			m[0][j] = false;
		}
		for(int i=1;i<pl;i++){
			for(int j=1;j<sl;j++){
				if(p.charAt(i-1)==s.charAt(j-1) || p.charAt(i-1)=='.'){
					m[i][j] = m[i-1][j-1];
				}else if(p.charAt(i-1)=='*' && i>1){
					m[i][j] = m[i-2][j] || m[i-1][j];
					if(p.charAt(i-2)==s.charAt(j-1) || p.charAt(i-2)=='.'){
						m[i][j] = m[i][j] || m[i][j-1];
					}
				}
			}
		}
		return m[pl][sl];
	}
}





	ache[i][j] = cache[i][j-1] || cache[i-1][j-1] || cache[i-1][j];
	
	
	