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
    public ListNode insertionSortList(ListNode head) {
		if(head==null || head.next==null) return head;
        ListNode safe = new ListNode(Integer.MIN_VALUE);
		safe.next=head;
		ListNode prev = safe;
		ListNode curr = head;
		while(curr!=null){
			if(curr.val>=prev.val){
				curr=curr.next;
				prev=prev.next;
			}else{
				ListNode pnext = curr.next;
				prev.next=pnext;
				ListNode r = safe;
				ListNode p = safe.next;
				while(p.val<curr.val){
					p=p.next;
					r=r.next;
				}
				r.next=curr;
				curr.next=p;
				curr=pnext;
			}
		}
		return safe.next;
    }
}

public class Solution {
    public ListNode insertionSortList(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode safe = new ListNode(Integer.MIN_VALUE);
		ListNode curr = head;
		safe.next=curr;
		ListNode prev = safe;
		while(curr!=null){
			if(prev.val<=curr.val){
				prev=prev.next;
				curr=curr.next;
			}else{
				ListNode nextp = curr.next;
				prev.next=nextp;
				ListNode c1 = safe;
				ListNOde c2 = safe.next;
				while(c2.val<curr.val){
					c1=c1.next;
					c2=c2.next;
				}
				c1.next=curr;
				curr.next=c2;
				curr=nextp;
			}
		}
		return safe.next;
		
		
		
		