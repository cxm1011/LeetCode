package LeetCode;

import java.util.Arrays;

public class maximumGap {
	public static void main(String args[])
	{
		int[] temp = {2,4,1,6,2,9};
		System.out.println(maximumGap(temp));
	}
	public static int maximumGap(int[] nums)
	{
        int ans = 0;
        int len = nums.length;
        if(len < 2) return 0;
        Arrays.sort(nums);
        for(int i=0;i<len-1;i++)
        {
        	ans = Math.max(ans, nums[i+1]-nums[i]);
        }
        return ans;
    }

}
