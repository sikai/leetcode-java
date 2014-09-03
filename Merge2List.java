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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode safe = new ListNode(-1);
		ListNode index = safe;
		if(l1==null && l2==null) return null;
		while(l1!=null || l2!=null){
			if(l1==null) {
				index.next=l2;
				break;
			}
			if(l2==null) {
				index.next=l1;
				break;
			}	
			if(l1.val<=l2.val){
				index.next=l1;
				l1=l1.next;
				index=index.next;
			}else{
				index.next=l2;
				l2=l2.next;
				index=index.next;
			}
		}
		return safe.next;
    }
}
