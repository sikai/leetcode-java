/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
     	HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++){
			cache.put(inorder[i],i);
		}   
		return build(cache,0,inorder.length-1,postorder,0,postorder.length-1);
    }
	public TreeNode build(HashMap<Integer,Integer> cache, int in_start, int in_end, int[] postorder, int po_start, int po_end){
		if(in_start>in_end || po_start>po_end) return null;
		int r = postorder[po_end];
		int idx = cache.get(r);
		TreeNode root = new TreeNode(r);
		TreeNode left = build(cache,in_start,idx-1,postorder,po_start,po_end-1-in_end+idx);
		TreeNode right = build(cache,idx+1,in_end,postorder,po_end-in_end+idx,po_end-1);
		root.left=left;
		root.right=right;
		return root;
	}
}
			






	
