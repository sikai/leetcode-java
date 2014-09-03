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
    public ListNode sortList(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode curr = head;
		int NodeCount = 0;
		while(curr!=null){
			NodeCount++;
			curr=curr.next;
		}
		NodeCount = NodeCount/2;
		int count = 0;
		ListNode left = head;
		ListNode right = null;
		curr = head;
		while(curr!=null){
			ListNode next = curr.next;
			count++;
			if(count==NodeCount){
				curr.next = null;
				right = next;
				break;
			}
			curr = next;
		}
		left = sortList(left);
		right = sortList(right);
		ListNode ret = Merge(left,right);
		return ret;
	}
	public ListNode Merge(ListNode r1, ListNode r2){
		if(r1==null || r2==null) return r1==null? r2: r1;
		ListNode safe = new ListNode(-1);
		ListNode ptr = safe;
		while (r1!=null && r2!=null) {
			if(r1.val<r2.val){
				ptr.next=r1;
				r1=r1.next;
				ptr=ptr.next;
			}else if(r1.val>r2.val){
				ptr.next=r2;
				r2=r2.next;
				ptrt=ptr.next;
			}else{
				ptr.next=r1;
				r1=r1.next;
				ptr.next.next=r2;
				r2=r2.next;
				ptr=ptr.next.next;
			}
		}
		if(r1!=null && r2==null){
			ptr.next=r1;
		}else if(r2!=null && r1==null){
			ptr.next=r2;
		}
		return safe.next;
	}
}
public ListNode sortList(ListNode head) {
	if(head==null|| head.next==null) return head;
	int NodeCount = 0;
	ListNode curr = head;
	while(curr!=null){
		NodeCount++;
		curr=curr.next;
	}	
	curr=head;
	for(int i=1;i<NodeCount/2+NodeCoung%2;i++){
		curr=curr.next;
	}
	ListNode right = sortList(curr.next);
	curr.next = null;
	ListNode left = sortList(head);
	ListNode ret = Merge(left,right);
	return 	ret;
}
ListNode merge(ListNode left, ListNode right){
	ListNode safe = new ListNode(-1);
	ListNode head = safe;
	while(left!=null && right!=null){
		if(left.val<=right.val){
			head.next=left;
			head=head.next;
			left=left.next;
		}else{
			head.next=right;
			head=head.next;
			right=right.next;
		}
	}
	if(left!=null) head.next=left;
	if(right!=null) head.next=right;
	return safe.next;
}





