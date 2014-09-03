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
    public ListNode reverseBetween(ListNode head, int m, int n) {
  		if(m==n) return head;
		if(head==null) return head;
		ListNode safe = new ListNode(0);
		safe.next=head;
		ListNode r= safe;
		for(int i=1;i<m;i++){
			r=r.next;
		}
		ListNode end = r.next;
		ListNode prev = r.next;
		ListNode curr = r.next.next;
		//prev.next = null;
		for(int i=0;i<n-m;i++){
			ListNode cache = curr.next;
			curr.next=prev;
			prev=curr;
			curr=cache;
		}
		r.next=prev;
		end.next=curr;
		return safe.next;
    }
}

