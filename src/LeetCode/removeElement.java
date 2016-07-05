package LeetCode;

import java.util.Arrays;

public class removeElement {
	public static void main(String args[])
	{
		int[] nums={1,2,3,3,3};
		System.out.println(removeElement(nums,3));
	}
	public static int removeElement(int[] nums, int val) {
        int ans=0;
        int length = nums.length;
		if(length == 0) return 0;
		Arrays.sort(nums);
		int left = 0;
		int right = length-1;
		
		while(left <= right)
		{
			if(nums[left] == val)
			{
				nums[left] = nums[right];
				right--;
			}
			else left++;
		}
		
		
		/*for(int i=0;i<length;i++)
		{
			while(nums[i]==val && length-1!=i)
			{
				nums[i]=nums[length-1];
				ans--;
				length--;
			}
			if(nums[i]==val &&length-1 ==i) 
			{
				ans = ans-1;
			}
		}*/
		
		return length-1-right;
    }

}
