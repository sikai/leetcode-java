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
    public ListNode rotateRight(ListNode head, int n) {
		if(head==null || head.next==null) return head;
		if(n==0) return head;
		int len = 1;
		ListNode curr = head;
		while(curr.next!=null){
			curr=curr.next;
			len++;
		}
		curr.next=head;
		for(int i=0;i<len-n%len;i++){
			curr=curr.next;
		}
		ListNode newhead = curr.next;
		curr.next = null;
		return newhead;
    }
}

public ListNode rotateRight(ListNode head, int n) {
	if(head==null) return head;
	ListNode curr =head;
	int len = 1;
	while(curr.next!=null){
		len++;
		curr=curr.next;
	}
	curr.next=head;
	for(int i=0;i<len-n%len;i++){
		curr=curr.next;
	}
	ListNode newHead = curr.next;
	curr.next=nu
	