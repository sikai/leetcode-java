/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
    	if(root==null) return;
		if(root.left==null && root.right==null) return;
		if(root.left!=null && root.right!=null) root.left.next=root.right;
		TreeLinkNode t = root;
		while(t.next!=null && t.next.left==null && t.next.right==null){
			t=t.next;
		}    
		if(t.next!=null && (t.next.left!=null || t.next.right!=null)){
			if(root.right!=null){
				root.right.next = t.next.left==null? t.next.right: t.next.left;
			}else if(root.left!=null){
				root.left.next = t.next.left==null? t.next.right: t.next.left;
			}
		}
		connect(root.right);
		connect(root.left);
    }	
}


	
		
	