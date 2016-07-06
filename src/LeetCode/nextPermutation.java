package LeetCode;

import java.util.Arrays;

public class nextPermutation {
	public static void main(String args[])
	{
		int[] nums = {3,2,1};
		nextPermutation(nums);
		int length = nums.length;
		for(int i=0;i<length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	public static void nextPermutation(int[] nums) {
		int length = nums.length;
        if(length > 1)
        {
        	int i = length-2;
        	while(i!=-1 &&nums[i] >= nums[i+1]) i--;
        	if(i==-1) Arrays.sort(nums);
        	else
	        {
        		int[] temp = Arrays.copyOfRange(nums,i,length);
	        	Arrays.sort(temp);
	        	
	        	int k = 0;
	        	int flag = 0;
	        	for(int j = i;j<length;j++)
	        	{
	        		if(flag == 1)
	        		{
	        			nums[j] = temp[k];
	        			k++;
	        		}
	        		if(flag == 0)
	        		{	
	        			if(nums[i] >= temp[k])
		        		{
		        			nums[j+1] = temp[k];
		        			k++;
		        		}
		        		else
		        		{
		        			nums[i] = temp[k];
		            		k++;
		            		flag = 1;
		        		}
	        		}
	        		
	        	}
	        }
        }
        
    }

}
