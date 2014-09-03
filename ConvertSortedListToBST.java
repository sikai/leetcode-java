
  public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; next = null; }
 }

 Definition for binary tree
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
	public static ListNode lhead;
    public TreeNode sortedListToBST(ListNode head) {
        lhead = head;
		return buildBST(0,getLen(head)-1);
    }
	public int getLen(ListNode head){
		int count = 0;
		while(head!=null){
			head=head.next;
			count++;
		}
		return count;
	}
	public TreeNode buildBST(int start, int end){
		if(start>end) return null;
		int mid = (start+end)/2;
		TreeNode left = buildBST(start,mid-1);
		TreeNode root = new TreeNode(lhead.val);
		lhead=lhead.next;
		TreeNode right = buildBST(mid+1,end);
		root.left = left;
		root.right = right;
		return root;
	}
}



