/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if (lists.isEmpty()) return null;
        ArrayList<ListNode> a = new ArrayList<ListNode>();
        for(ListNode l : lists){
            if(l!=null) a.add(l);
        }
		ListNode safe = new ListNode(0);
		ListNode head = safe;
		while(!a.isEmpty()){
			int min = Integer.MAX_VALUE;
			int k=-1;
			for(int i=0;i<a.size();i++){
				if(a.get(i).val<min){
					min=a.get(i).val;
					k=i;
				}
			}
			ListNode r = a.get(k);
			if(r.next==null){
				a.remove(k);
			}else{
				a.set(k,r.next);
			}
			head.next=r;
			head=head.next;
		}
		return safe.next;
    }
}



	
	
	