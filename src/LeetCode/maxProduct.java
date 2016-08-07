package LeetCode;

public class maxProduct {
	public static void main(String[] args)
	{
		int[] nums = {2,3,-2,4};
		System.out.print(maxProduct(nums));
	}
	public static int maxProduct(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0) return 0;
        if(len == 1) return nums[0];
        int max = nums[0];
        int ans = nums[0];
        int min = nums[0];
        for(int i = 1;i<len;i++)
        {
        	int  Minend = min*nums[i];
        	int  Maxend = max*nums[i];
        	max = Math.max(Math.max(Minend,Maxend),nums[i]);
        	min = Math.min(Math.min(Minend,Maxend),nums[i]);
        	ans = Math.max(ans, max);

        }
        return ans;
    }

}
