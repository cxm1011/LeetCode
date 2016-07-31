package LeetCode;



public class sumNumbers {

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
		//root1.left.left = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		/*root1.right.left = new TreeNode(2);
		root1.right.right = new TreeNode(5);*/
		System.out.print(sumNumbers(root1));
	}
	public static int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        int ans = find(root,0,0);
        return ans;
    }
	public static int find(TreeNode root,int temp,int sum)
	{
		if(root == null) return sum;
		temp = temp*10+root.val;
		if(root.left  == null && root.right == null)
		{
			sum+=temp;
			return sum;
		}
		
		sum = find(root.left,temp,sum);
		sum = find(root.right,temp,sum);
		return sum;
	}
}
