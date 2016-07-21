package LeetCode;
import java.util.*;
public class sortedArrayToBST {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String args[])
	{
		int[] nums = {1,2,3,4};
		
		TreeNode ans = sortedArrayToBST(nums);
		inOrder(ans);
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if(length==0) return null;
        return sort(nums,0,length-1);
    }
	public static TreeNode sort(int[] nums,int left,int right)
	{
		if(left>right) return null;
		int mid = (left+right)/2;
		TreeNode head = new TreeNode(nums[mid]);
		head.left = sort(nums,left,mid-1);
		head.right = sort(nums,mid+1,right);
		return head;
		
	}
	public static void inOrder(TreeNode root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.val+" ");
			inOrder(root.right);
		}
	}
}
