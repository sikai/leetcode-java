
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode safe = new ListNode(0);
        safe.next=head;
        ListNode r = head;
        while(r!=null){
            ListNode temp=r;
            while(temp.next!=null && temp.next.val==temp.val){
                temp=temp.next;
            }
            r.next=temp.next;
            r=temp.next;
        }
        return safe.next;
    }
}

public ListNode deleteDuplicates(ListNode head) {
	if(head==null || head.next==null) return head;
	ListNode safe = new ListNode(-1);
	safe.next=head;
	ListNode prev = safe;
	ListNode curr=head;
	while(curr!=null){
		if(curr.val==prev.val){
			while()
		}
		curr=curr.next;
		prev=prev.next;
	}