package LeetCode;
import java.util.*;
public class buildTree {
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
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int lenpre = preorder.length;
        int lenin = inorder.length;
        if(lenpre == 0 || lenin == 0) return null;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<lenin;i++)
        	map.put(inorder[i], i);
        return head(preorder,0,lenpre-1,inorder,0,lenin,map);
    }
	public static TreeNode head(int[] pre,int pi,int pj,int[] in,int i,int j,
								HashMap<Integer,Integer> map)
	{
		if(pi > pj) return null;
		TreeNode head = new TreeNode(pre[pi]);
		int index = map.get(pre[pi]);
		head.left = head(pre,pi+1,pi+index-i,in,i,index-1,map);
		head.right = head(pre,pi+index-i+1,pj,in,index+1,j,map);
		return head;
	}
}
