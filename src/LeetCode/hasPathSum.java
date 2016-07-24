package LeetCode;



public class hasPathSum {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String args[])
	{
		TreeNode root1 = new TreeNode(-2);
		//root1.left = new TreeNode(4);
		root1.right = new TreeNode(-3);
		/*root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);
		root1.right.left = new TreeNode(1);
		root1.right.right = new TreeNode(5);*/
		System.out.print(hasPathSum(root1,-5));
	}
	public static boolean hasPathSum(TreeNode root, int sum) {
       if(root == null) return false;
       return search(root,sum,0);
    }
	public static boolean search(TreeNode root, int sum,int temp)
	{
		if(root == null) return false;
		temp  += root.val;
		if(root.left == null && root.right == null)
		{
			if(sum != temp)
			{
				temp -=root.val;
				return false;
			}
			else return true;
		}
		
		boolean ltemp = search(root.left,sum,temp);
		if(ltemp) return true;
		boolean rtemp = search(root.right,sum,temp);
		if(rtemp) return true;
		return false;
	}

}
