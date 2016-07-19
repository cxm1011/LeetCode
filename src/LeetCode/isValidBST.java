package LeetCode;
import java.util.*;

public class isValidBST {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String args[])
	{
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		System.out.print(isValidBST(root));
	}
	public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        List<Integer> ans = new ArrayList<Integer>();
        inOrder(root,ans);
        System.out.print(ans);
        int len = ans.size();
        for(int i=0;i<len-1;i++)
        {
        	if(ans.get(i+1) < ans.get(i))
        	{
        		return false;
        	}
        }
        return true;
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
}
