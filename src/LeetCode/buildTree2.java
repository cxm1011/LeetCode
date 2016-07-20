package LeetCode;

import java.util.*;



public class buildTree2 {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String args[])
	{
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		root1.right.left = new TreeNode(2);
		root1.right.right = new TreeNode(5);
		//System.out.print(buildTree(root1));
	}
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int lenin = inorder.length;
        int lenpos = postorder.length;
        if(lenin == 0 || lenpos == 0) return null;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<lenin;i++)
        	map.put(inorder[i], i);
        return head(inorder,0,lenin-1,postorder,0,lenpos,map);
    }
	public static TreeNode head(int[] in,int i,int j,int[] post,int pi,int pj,
			HashMap<Integer,Integer> map)
	{
		if(pi>pj) return null;
		TreeNode head = new TreeNode(post[pj]);
		int index = map.get(post[pj]);
		head.left = head(in,i,index-1,post,pi,pi+index-i,map);
		head.right = head(in,index+1,j,post,pi+index-i+1,pj,map);
		return head;
		
	}

}
