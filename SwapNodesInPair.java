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
    public ListNode swapPairs(ListNode head) {
     	if(head==null) return head;
		ListNode safe = new ListNode(-1);
		safe.next=head;
		ListNode curr = head;
		ListNode prev = safe;
		ListNode nex = head.next;
		if(nex==null) return head;
		while(curr!=null && nex!=null){
			ListNode temp = nex.next;
			prev.next = nex;
			nex.next = curr;
			curr.next = temp;
			prev = curr;
			curr = temp;
			if(curr!=null) nex = curr.next;
		}
		return safe.next;   
    }
}