package LeetCode;

import java.util.Arrays;

public class firstMissingPositive {
	public static void main(String args[])
	{
		int[] nums ={};
		System.out.print(firstMissingPositive(nums));
	}
	public static int firstMissingPositive(int[] nums) {
		int length = nums.length;
		if(length ==0) return 1;
		Arrays.sort(nums);
        int i=0;
        int flag = 0;
        int pre = 0;
		while(i<length)
		{
			
			if(nums[i]<=pre) {i++;continue;}
			if(nums[i]==pre+1) pre = nums[i];
			else 
			{
				return pre+1;
			}
			i++;
		}
		if(i == length && nums[i-1]>0) return nums[i-1]+1;
		return pre+1;
    }

}
