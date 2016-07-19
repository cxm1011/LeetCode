package LeetCode;

import LeetCode.isValidBST.TreeNode;

public class isSameTree {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String args[])
	{
		TreeNode root1 = new TreeNode(2);
		root1.left = new TreeNode(1);
		root1.right = new TreeNode(4);
		
		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(3);
		System.out.print(isSameTree(root1,root2));
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q== null) return false;
        boolean ans1 = true;
        boolean ans2 = true;
        ans1 = preOrder(p,q,ans1);
        ans2 = inOrder(p,q,ans2);
        if(ans1)
        {
        	if(ans2)
        	{
        		return true;
        	}
        }
        return false;
    }
	public static boolean preOrder(TreeNode p, TreeNode q,boolean ans1)
	{
		if(!ans1) return ans1;
		if(p!=null && q ==null)
		{
			ans1 = false;
			return ans1;
		}
		if(p==null && q!=null)
		{
			ans1 = false;
			return ans1;
		}
		if(p!=null && q !=null )
		{
			if(p.val != q.val)
			{
				ans1 = false;
				return ans1;
			}
			ans1 = preOrder(p.left,q.left,ans1);
			ans1 = preOrder(p.right,q.right,ans1);
		}
		return ans1;
	}
	public static boolean inOrder(TreeNode p, TreeNode q,boolean ans2)
	{
		if(!ans2) return ans2;
		if(p!=null && q ==null)
		{
			ans2 = false;
			return ans2;
		}
		if(p==null && q!=null)
		{
			ans2 = false;
			return ans2;
		}
		if(p!=null && q !=null )
		{
			ans2 = preOrder(p.left,q.left,ans2);
			if(p.val != q.val)
			{
				ans2 = false;
				return ans2;
			}
			ans2 = preOrder(p.right,q.right,ans2);
		}
		return ans2;
	}
}
