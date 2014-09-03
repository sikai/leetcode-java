public class Solution {
	class WordLadderWithLvl{
		public String word;
		public int lvl;
		public WordLadderWithLvl(String s, int i){
			this.word = s;
			this.lvl = i;
		}
	}
	public ArrayList<ArrayList<String>> result;
	public String end;
	public Map<String, List<String>> nextmap;
	
    public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
 		result = new ArrayList<ArrayList<String>>();
		this.end = end;
		nextmap = new HashMap<String,List<String>>();
		HashSet<String> unvisited = new HashSet<String>();
		unvisited.addAll(dict);
		unvisited.remove(end);
		unvisited.add(start);
		nextmap = new HashMap<String, List<String>>();
		for(String e: unvisited){
			nextmap.put(e,new ArrayList<String>());
		}
		LinkedList<WordLadderWithLvl> queue = new LinkedList<WordLadderwithLvl>();
		queue.add(new WordLadderWithLvl(end,0));
		int prev_lvl = 0;
		int curr_lvl = 0;
		int FinalLvl = Integer.MAX_VALUE;
		boolean found = false;
		Set<String> visitedWordsInThisLevel = new HashSet<String>();
		while(!queue.isEmpty()){
			WordLadderWithLvl curr = queue.poll();
			String curr_word = curr.word;
			int curr_lvl = curr.lvl;
			if(found && curr_lvl > FinalLvl){
				break;
			}
			if(curr_lvl > prev_lvl){
				unvisited.removeAll(visitedWordsInThisLevel);
			}
			prev_lvl = curr_lvl;
			for(int i=0;i<start.length();i++){
				char[] char_arr = curr_word.toCharArray();
				char original_char = char_arr[i];
				boolean found_in_this_cycle = false;
				for(char c='a';c<='z';c++){
					char_arr[i] = c;
					String newWord = new String(char_arr);
					if(c!=original_char && unvisited.contains(newWord)){
						nextmap.get(newWord).add(curr_word);
						if(newWord.equals(start)){
							found = true;
							FinalLvl = curr_lvl;
							found_in_this_cycle = true;
							break;
						}
						if(visitedWordsInThisLevel.add(newWord)){
							queue.add(new WordLadderWithLvl(newWord, curr_lvl+1));
						}
					}
				}
				if(found_in_this_cycle){
					break;
				}
			}
		}
		if(found){
			ArrayList<String> list = new ArrayList<String>();
			list.add(start);
			dfs(start,list,FinalLvl+1);
		}
		return result;
    }

	public void dfs(String currWord, ArrayList<String> list, int lvl){
		if(currWord.equals(end)){
			result.add(new ArrayList<String>(list));
		}else if(lvl>0){
			List parents = nextmap.get(currWord);
			for(String parent: parents){
				list.add(parent);
				dfs(parent,list,lvl-1);
				list.remove(list.size()-1);
			}
		}
	}
}


public ArrayList<ArrayList<String>> wordLadder2(String start, String end, HashSet<String> dict){
	ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
	if(dict==null || start==null || start.length()!=end.length()) return ret;
	LinkedList<String> squeue = new LinkedList<String>();
	Set<String> visited = new HashSet<String>();
	Map<String,String> backtrace = new HashMap<String,String>();
	squeue.add(start);
	while(!squeue.isEmpty()){
		String curr = squeue.pop();
		if(curr.equals(end)){
			ArrayList<String> inter = new ArrayList<String>();
			inter.add(end);
			while(curr!=null){
				curr=backtrace.get(curr);
				inter.add(0,curr);
			}
		}
		visited.add(curr);
		for(int i=0;i<curr.length();i++){
			char[] charArr = curr.toCharArray();
			for(int c='a';c<='z';c++){
				if(c!=curr.charAt(i)){
					charArr[i] = c;
					String temp = new String(charArr);
					if(visited.containsKey(temp)) continue;
					if(!dict.containsKey(temp)) continue;
					squeue.add(temp);
					batcktrace.put(temp,curr);
				}
			}
		}
	}
}

































