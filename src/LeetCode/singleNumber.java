package LeetCode;

public class singleNumber {
	public static void main(String args[])
	{
		int[] nums = {1,2,3,1,2,3,4};
		System.out.print(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
		int len = nums.length;
		if(nums == null || len == 0) return 0;
		if(len == 1) return nums[0];
		int ans = 0;
		for(int i = 0;i<len;i++)
		{
			ans = ans^nums[i];
		}
		return  ans;
    }
}
