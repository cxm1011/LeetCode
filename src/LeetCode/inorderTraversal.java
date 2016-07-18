package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public static void main(String args[])
	{
		TreeNode rootNode = new TreeNode(1);
		rootNode.right = new TreeNode(2);
		rootNode.right.left = new TreeNode(3);
		List<Integer> ans = inorderTraversalIter(rootNode);
		System.out.print(ans);
		
	}
	
	// using recursion  -- beats 61.07%
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>(); 
		if(root == null) return ans;
		inorder(root,ans);
		return ans;
    }
	public static void inorder(TreeNode temp,List<Integer> ans)
	{
		if(temp!=null)
		{
			inorder(temp.left,ans);
			ans.add(temp.val);
			inorder(temp.right,ans);
		}
		return;
	}
	
	//using iteration  --beats 4.70%
	public static List<Integer> inorderTraversalIter(TreeNode root)
	{
		List<Integer> ans = new ArrayList<Integer>(); 
		if(root == null) return ans;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.empty() || root != null)
		{
			if(root!= null)
			{
				stack.push(root);
				root = root.left;
			}
			else
			{
				root = stack.pop();
				ans.add(root.val);
				root = root.right;
			}
		}
		return ans;
	}
}
