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
    public ListNode partition(ListNode head, int x) {
		ListNode safe = new ListNode(0);
		safe.next = head;
		ListNode prev = safe;
		ListNode curr = head;
		ListNode bighead = new ListNode(1);
		ListNode rr = bighead;
		while(curr!=null){
			if(curr.val<x){
				curr=curr.next;
				prev=prev.next;
			}else{
				prev.next=curr.next;
				rr.next=curr;
				curr.next=null;
				rr=rr.next;
				curr=prev.next;
			}
		}
		prev.next=bighead.next;
		return safe.next;
    }
}


	
	