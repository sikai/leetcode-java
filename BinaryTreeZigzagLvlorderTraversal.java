import java.util.*;
public class BinaryTreeZigzagLvlorderTraversal {
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
  		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
  		if(root==null) return ret;
		Stack<TreeNode> curr = new Stack<TreeNode>();
		Stack<TreeNode> next = new Stack<TreeNode>();
		boolean left_to_right = true;
		curr.push(root);
		
		while(!curr.isEmpty()){
			ArrayList<Integer> inter = new ArrayList<Integer>();
			while(!curr.isEmpty()){
				TreeNode temp = curr.pop();
				inter.add(temp.val);
				if(left_to_right){
					if(temp.left!=null) next.push(temp.left);
					if(temp.right!=null)next.push(temp.right);
				}else{
					if(temp.right!=null) next.push(temp.right);
					if(temp.left!=null) next.push(temp.left);
				}
			}
			ret.add(inter);
			left_to_right=!left_to_right;
			curr=next;
			next=null;
		}
		return ret; 
    }
	public static void main(String[] args) {
			TreeNode root = new TreeNode(2);
			zigzagLevelOrder(root);
		}




}
 class TreeNode {
   	   int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

	
	public class Solution {
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        if(root==null) return ret;
	        Stack<TreeNode> curr = new Stack<TreeNode>();
	        Stack<TreeNode> next = new Stack<TreeNode>();
	        curr.push(root);
	        boolean left_to_right = true;
	        while(!curr.isEmpty()){
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            while(!curr.isEmpty()){
	                TreeNode p = curr.pop();
	                list.add(p.val);
	                if(left_to_right){
	                    next.push(p.left);
	                    next.push(p.right);
	                }else{
	                    next.push(p.right);
	                    next.push(p.left);
	                }
	            }
	            left_to_right = !left_to_right;
	            curr=next;
	            next=null;
	            ret.add(list);
	        }
	        return ret;
	    }
	}
	
	
	
	
	

