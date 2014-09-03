/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node==null) return null;
		HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		queue.add(node);
		UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);
		map.put(node,newHead);
		while(!queue.isEmpty()){
			UndirectedGraphNode curr = queue.pop();
			for(UndirectedGraphNode nei: curr.neighbors){
				if(!map.containsKey(nei)){
					UndirectedGraphNode newNode = new UndirectedGraphNode(nei.label);
					map.put(nei,newNode);
					queue.add(nei);
					map.get(curr).neighbors.add(newNode);
				}else{
					map.get(curr).neighbors.add(map.get(nei));
				}
			}
		}
		return newHead;
	}
}

