/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
		if(head==null || head.next==null) return;
		//Find mid point of List using fast-slow runner
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode second = slow.next;
		slow.next = null;
		ListNode second_head = reorderBackwards(second);
		ListNode p1 = head;
		ListNode p2 = second_head;
		//Because 1st part always equals or 1 node more than 2nd part
		while(p2!=null){
			ListNode t1 = p1.next;
			ListNode t2 = p2.next;
			p1.next = p2;
			p2.next = t1;
			p1 = t1;
			p2 = t2;
		}
    }
	public ListNode reorderBackwards(ListNode head){
		if(head==null || head.next==null) return head;
		ListNode prev = head;
		ListNode curr = head.next;
		while(curr!=null){
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head.next=null;
		return prev;
	}
}


	
	
	


