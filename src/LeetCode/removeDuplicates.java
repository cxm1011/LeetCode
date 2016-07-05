package LeetCode;

import java.util.Arrays;

public class removeDuplicates {
	public static void main(String args[])
	{
		int[] s ={1,1,2};
		System.out.println(removeDuplicates(s));
		
	}
	public static int removeDuplicates(int[] nums) {
        int ans=0;
        int length = nums.length;
        if(length == 0) return ans;
        Arrays.sort(nums);
        ans = 1;
        int same =0;
        for(int i=1;i<length;i++)
        {
        	if(nums[i]!=nums[i-1]) 
    		{
        		ans++;
        		nums[i-same]=nums[i];
    		}
        	else
        		same++;		
        }
        /*for(int i=0;i<ans;i++)
        	System.out.print(nums[i]+" ");
        System.out.println("");*/
        return ans;
    }

}
