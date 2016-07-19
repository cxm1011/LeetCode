package LeetCode;

public class numTrees {
	public static void main(String args[])
	{
		System.out.print(numTrees(3));
	}
	public static int numTrees(int n) {
		if(n<2) return 1;
		int[] nums = new int[n+1];
		nums[0] = 1;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				nums[i]+=nums[j-1]*nums[i-j];
			}
		}
        return nums[n];
    }
}
