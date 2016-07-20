package LeetCode;
import java.util.*;
public class maxDepth {
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
		System.out.print(maxDepth(root1));
	}
	
	//--beats 4.17%
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.add(root);
		int ans = 0;
		int length = que.size();
		while(length!=0)
		{
			ans++;
			for(int i=0;i<length;i++)
			{
				TreeNode temptree = que.poll();
				if(temptree.left!=null) que.add(temptree.left);
				if(temptree.right!=null) que.add(temptree.right);
			}
			length = que.size();
			
		}
		return ans;
		
        
    }
}
