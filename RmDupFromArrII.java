public class Solution {
    public int removeDuplicates(int[] A) {
        int n = A.length;
        if (n <= 2) return n;

        int cur = 1;
        for (int i = 2; i < n; ++i) {
            if (!(A[i] == A[cur] && A[i] == A[cur - 1]))
                A[++cur] = A[i];
        }

        return cur + 1;	
    }
}

public class Solution {
	public int removeDuplicates(int[] A) {
		if (A.length <= 2)
			return A.length;
 
		int prev = 1; // point to previous
		int curr = 2; // point to current
 
		while (curr < A.length) {
			if (A[curr] == A[prev] && A[curr] == A[prev - 1]) {
				curr++;
			} else {
				prev++;
				A[prev] = A[curr];
				curr++;
			}
		}
 
		return prev + 1;
	}
}

