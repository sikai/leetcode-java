/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null) return null;
		RandomListNode curr = head;
		while(curr!=null){
			RandomListNode temp = new RandomListNode(curr.label);
			temp.next = curr.next;
			curr.next = temp;
			curr = curr.next.next;
		}        
		curr = head;
		while(curr!=null){
			if(curr.random!=null){
				curr.next.random = curr.random.next;
			}
			curr=curr.next.next;
		}
		curr = head;
		RandomListNode new_head = head.next;
		while(curr!=null){
			RandomListNode temp = curr.next;
			curr.next=temp.next;
			if(temp.next!=null){
				temp.next=temp.next.next;
			}
			curr=curr.next;
		}
		return new_head;
    }
}

