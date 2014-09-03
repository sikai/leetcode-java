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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
		if(l2==null) return l1;
		ListNode safe = new ListNode(-1);
		ListNode head=safe;
		int carry = 0;
		while(l1!=null || l2!=null || carry==1){
			int i1 = l1==null? 0:l1.val;
			int i2 = l2==null? 0:l2.val;
			int val = (i1+i2+carry)%10;
			carry = (i1+i2+carry)/10;
			ListNode root = new ListNode(val);
			head.next=root;
			head=head.next;
			l1=l1==null?null:l1.next;
			l2=l2==null?null:l2.next;
		}
		return safe.next;
    }
}

