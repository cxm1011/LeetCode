package LeetCode;

import java.util.*;

import LeetCode.isSameTree.TreeNode;

public class isSymmetric {
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
		//root1.left.right = new TreeNode(4);
		
		root1.right.left = new TreeNode(2);
		//root1.right.right = new TreeNode(3);
		
		System.out.print(isSymmetric(root1));
	}
	public static boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		boolean ans = judge(root.left,root.right);
        
        return ans;
    }
	public static boolean judge(TreeNode root1,TreeNode root2)
	{
		if(root1 == null && root2==null) return true;
		if(root1 == null && root2!=null) return false;
		if(root1 != null && root2==null) return false;
		if(root1.val == root2.val)
		{
			if(judge(root1.left,root2.right) && judge(root1.right,root2.left))
				return true;
			else
				return false;
		}
		return false;
	}
	public static void inOrder(TreeNode root,List<Integer> ans)
	{
		if(root!=null)
		{
			inOrder(root.left,ans);
			ans.add(root.val);
			inOrder(root.right,ans);
		}
		return;
	}
	public static void rightOrder(TreeNode root1,List<Integer> ans1)
	{
		if(root1!=null)
		{
			rightOrder(root1.right,ans1);
			ans1.add(root1.val);
			rightOrder(root1.left,ans1);
		}
		return;
	}
}
