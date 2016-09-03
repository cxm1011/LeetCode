package LeetCode;

public class rob2 {
	public static void main(String args[])
	{
		int[] num= {20,90,80,80,100};
		System.out.println(rob2(num));
	}
	public static int rob2(int[] nums) 
	{
		int len = nums.length;
		if(len==0 || nums == null) return 0;
		if(len == 1) return nums[0];
		if(len == 2) return Math.max(nums[0], nums[1]);
		if(len == 3)
		{
			int temp = Math.max(nums[0], nums[1]);
			return Math.max(temp, nums[2]);
		}
		int[] max1 = new int[len-1];
		max1[0] = nums[0];
		max1[1] = Math.max(nums[0], nums[1]);
		for(int i=2;i<len-1;i++)
		{
			max1[i] = Math.max(max1[i-2]+nums[i], max1[i-1]);
		}
		
		int[] max2 = new int[len-1];
		max2[0] = nums[1];
		max2[1] = Math.max(nums[1], nums[2]);
		for(int i=3;i<len;i++)
		{
			max2[i-1] = Math.max(max2[i-3]+nums[i], max2[i-2]);
		}
		
		return Math.max(max1[len-2], max2[len-2]);
	}

}
