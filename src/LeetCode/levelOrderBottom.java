package LeetCode;

import java.util.*;



public class levelOrderBottom {
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
		System.out.print(levelOrderBottom(root1));
		
	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return null;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        int length = que.size();
        while(length!=0)
        {
        	temp = new ArrayList<Integer>();
        	for(int i=0;i<length;i++)
        	{
        		TreeNode temptree = que.poll();
        		temp.add(temptree.val);
        		if(temptree.left!=null) que.add(temptree.left);
        		if(temptree.right!=null) que.add(temptree.right);
        	}
        	length = que.size();
        	ans.add(temp);
        }
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        int lenans = ans.size();
        for(int j = lenans-1;j>=0;j--)
        {
        	ans1.add(ans.get(j));
        }
        
        return ans1;
    }

}
