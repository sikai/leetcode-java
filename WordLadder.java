public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
		if(dict.size()==0) return 0;
		LinkedList<String> wordQueue = new LinkedList<String>();
		LinkedList<Integer> editDistance = new LinkedList<Integer>();
		wordQueue.add(start);
		editDistance.add(1);
		while(!wordQueue.isEmpty()){
			String curr = wordQueue.pop();
			int distance = editDistance.pop();
			if(curr.equals(end)){
				return distance;
			}
			for(int i=0;i<start.length();i++){
				char[] curr_arr = curr.toCharArray();
				for(char c='a';c<='z';c++){
					curr_arr[i] = c;
					String newWord = new String(curr_arr);
					if(dict.contains(newWord)){
						wordQueue.add(newWord);
						editDistance.add(distance+1);
						dict.remove(newWord);
					}
				}
			}
		}
		return 0;        
    }
}


