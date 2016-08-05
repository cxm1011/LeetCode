package LeetCode;

import java.util.*;

public class preorderTraversal {
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        preorder(ans,root);
        return ans;
    }
	public void preorder(List<Integer> ans,TreeNode root)
	{
		if(root!=null)
		{
			ans.add(root.val);
			preorder(ans,root.left);
			preorder(ans,root.right);
		}
	}
}
