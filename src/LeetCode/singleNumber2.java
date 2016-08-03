package LeetCode;

public class singleNumber2 {
	public static void main(String args[])
	{
		int[] nums = {1,2,3,2,3,2,3};
		System.out.print(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
		int len = nums.length;
		if(len == 0 || nums == null) return -1;
		if(len == 1) return nums[0];
		if(len>1 && len<4) return -1;
		int[] bits = new int[32];
		int ans = 0;
		for(int i=0;i<32;i++)
		{
			for(int j = 0;j<len;j++)
			{
				bits[i] += nums[j]>>i&1;
			}
			bits[i] = bits[i]%3;
			ans = bits[i]<<i|ans;
		}
        return ans;
    }
}
