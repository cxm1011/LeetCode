package LeetCode;

import java.util.*;

import LeetCode.isSymmetric.TreeNode;

public class levelOrder {
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

		root1.right.left = new TreeNode(2);

		System.out.print(levelOrder(root1));
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)
        	return ans;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        while(que.size()!=0)
        {
        	int length = que.size();
        	List<Integer> temp = new ArrayList<Integer>();
        	for(int i=0;i<length;i++)
        	{
        		TreeNode temptree = que.poll();
        		temp.add(temptree.val);
        		if(temptree.left!=null) que.add(temptree.left);
        		if(temptree.right!=null) que.add(temptree.right);
        	}
        	ans.add(temp);
        }
        return ans;
    }
}
