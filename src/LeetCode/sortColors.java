package LeetCode;

public class sortColors {
	public static void main(String args[])
	{
		int[] nums = {2,0,1,2,1,0,0,1,2};
		sortColors(nums);
		int length = nums.length;
		int i = 0;
		while(i<length)
		{
			System.out.print(nums[i]+" ");
			i++;
		}
	}
	public static void sortColors(int[] nums) {
        int length = nums.length;
        if(length <= 1) return ;
        int i = 0;
        int right = length-1;
        int left = 0;
        while(i<=right)
        {	
        	if(nums[i]==0)
        	{
        		swap(nums,i,left);
        		i++;
        		left++;
        	}
        	else if(nums[i] == 1)
        	{
        		i++;
        	}
        	else if(nums[i] == 2)
        	{
        		swap(nums,i,right);
        		right--;
        	}
        }
        
        
    }
	public static void swap(int[] nums,int i,int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
