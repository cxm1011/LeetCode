package LeetCode;

import java.util.Arrays;

public class removeDuplicates2 {
	public static void main(String args[])
	{
		int[] nums = {1,2,2,2,2,3,3,3,4,4};
		System.out.println(removeDuplicates2(nums));
	}
	public static int removeDuplicates2(int[] nums) {
		int length = nums.length;
        if(length<=2) return length;
        Arrays.sort(nums);
        int ans = 1;
        int flag = 1;
        int same = 0;
        for(int i = 1;i<length;i++)
        {
        	if(nums[i] == nums[i-1] &&flag >= 2)
        	{
        		same++;
        	}
        	if(nums[i] == nums[i-1] && flag<2)
        	{
        		ans++;
        		flag++;
        		nums[i-same] = nums[i];
        	}
        	if(nums[i] != nums[i-1])
        	{
        		ans++;
        		flag = 1;
        		nums[i-same] = nums[i];
        	}
        }
        return ans;
    }
}
