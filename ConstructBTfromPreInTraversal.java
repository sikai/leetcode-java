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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++){
			cache.put(inorder[i],i);
		}
		return build(preorder,0,inorder.length-1,0,preorder.length-1,cache);
    }
	public TreeNode build(int[] preorder, int in_start, int in_end, int pre_start, int pre_end, HashMap<Integer,Integer> cache){
		if(in_start>in_end || pre_start>pre_end) return null;
		int r = preorder[pre_start];
		int idx = cache.get(r);
		TreeNode root = new TreeNode(r);
		TreeNode left = build(preorder,in_start,idx-1,pre_start+1,pre_start+idx-in_start,cache);
		TreeNode right = build(preorder,idx+1,in_end,pre_start+idx-in_start+1,pre_end,cache);
		root.left=left;
		root.right=right;
		return root;
	}
}

public TreeNode buildTree(int[] preorder, int[] inorder) {
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<inorder.length;i++){
		map.put(inorder[i],i);
	}	
	TreeNode root = build(preorder,inorder,map,in_start,in_end,pre_start,pre_end);
	return root;
}
	public TreeNode build(int[] preorder, int[] inorder, HashMap<Integer,Integer> map, int in_start, int in_end, int pre_start, int pre_end){
		if(in_start>in_end) return null;
		int val = preoder[pre_start];
		TreeNode root = new TreeNode(val);
		int idx = map.get(val);
		idx-in_start=x-pre_start
		TreeNode left = build(preorder,inorder,map,in_start,idx-1,pre_start+1,idx+pre_start-in_start,)
	}