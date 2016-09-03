package LeetCode;

public class rob {
	public static void main(String args[])
	{
		int[] num= {20,90,80,80,100};
		System.out.println(rob(num));
	}
	public static int rob(int[] nums) 
	{
		int len = nums.length;
		if(len==0 || nums == null) return 0;
		if(len == 1) return nums[0];
		if(len == 2) return Math.max(nums[0], nums[1]);
		
		int[] max = new int[len];
		max[0] = nums[0];
		max[1] = Math.max(nums[0], nums[1]);
		for(int i=2;i<len;i++)
		{
			max[i] = Math.max(max[i-2]+nums[i], max[i-1]);
		}
		return max[len-1];
    }

}
