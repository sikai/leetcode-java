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
    public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null) return head;
		if(n==0) return head;
		ListNode safe =new ListNode(0);
		safe.next = head;
		ListNode first = head;
		ListNode last = head;
		for(int i=0;i<n;i++){
			first = first.next;
		} 
		if(first==null){
			safe.next= head.next;
			return safe.next;
		} 
		while(first.next!=null){
			first=first.next;
			last=last.next;
		}
		last.next = last.next.next;
		return safe.next;
    }
}

