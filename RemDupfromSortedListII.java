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
		if(head==null || head.next==null) return head;
		ListNode safe = new ListNode(0);
		safe.next=head;
		ListNode prev =safe;
		ListNode curr =head.next;
		while(curr!=null){
			if(curr.val!=prev.next.val){
				curr=curr.next;
				prev=prev.next;
			}else{
				ListNode r = curr;
				while(r!=null && r.val==curr.val){
					r=r.next;
				}
				prev.next=r;
				if(r==null) return safe.next;
				curr=r.next;
			}
		}
		return safe.next;        
    }
}

	