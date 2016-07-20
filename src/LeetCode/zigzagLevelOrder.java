package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;



public class zigzagLevelOrder {
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
		System.out.print(zigzagLevelOrder(root1));
	}
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(root == null) return ans;
		//Queue<TreeNode> que = new LinkedList<TreeNode>();
		Stack<TreeNode> sta = new Stack<TreeNode>();
		Stack<TreeNode> statemp = new Stack<TreeNode>();
		sta.add(root);
		//int lenQue = que.size();
		int lenSta = sta.size();
		int j = 0;
		while(lenSta != 0)
		{
			List<Integer> temp = new ArrayList<Integer>();
			
			
			statemp = new Stack<TreeNode>();
			if(j%2 == 0)
			{
				for(int i =0;i<lenSta;i++)
				{
					TreeNode temptree = sta.pop();
					temp.add(temptree.val);
					if(temptree.left!=null) statemp.add(temptree.left);
					if(temptree.right!=null) statemp.add(temptree.right);
				}
			}
			else
			{
				for(int i =0;i<lenSta;i++)	
				{
					TreeNode temptree = sta.pop();
					temp.add(temptree.val);
					if(temptree.right!=null) statemp.add(temptree.right);
					if(temptree.left!=null) statemp.add(temptree.left);
					
				}
			}
			j++;
			ans.add(temp);
					
			sta = statemp;
			lenSta = sta.size();	
		}
		return ans;
    }
}
