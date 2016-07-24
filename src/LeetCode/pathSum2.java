package LeetCode;

import java.util.*;

public class pathSum2 {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String args[]) {
		TreeNode root1 = new TreeNode(5);
		root1.left = new TreeNode(4);
		root1.right = new TreeNode(2);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);
		root1.right.left = new TreeNode(1);
		root1.right.right = new TreeNode(5);
		System.out.print(pathSum(root1, 12));
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> temp1 = new ArrayList<Integer>();
		if (root == null)
			return ans;
		search(root, sum, 0, ans, temp1);
		return ans;
	}

	public static void search(TreeNode root, int sum, int temp,
			List<List<Integer>> ans, List<Integer> temp1) {
		if (root == null)
			return;
		temp += root.val;
		temp1.add(root.val);
		if (root.left == null && root.right == null) {
			if (sum != temp) {
				temp -= root.val;
				temp1.remove(temp1.size() - 1);
				return;
			} else
				ans.add(new ArrayList(temp1));
		}
		search(root.left, sum, temp, ans, temp1);
		search(root.right, sum, temp, ans, temp1);
		temp -= root.val;
		temp1.remove(temp1.size() - 1);
	}
}
