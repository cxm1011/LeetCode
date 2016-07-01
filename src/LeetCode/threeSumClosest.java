package LeetCode;

import java.util.Arrays;

public class threeSumClosest {
	public static void main(String args[])
	{
		int s[]={1,2,4,8,16,32,64,128};
		int tar = 82;
		System.out.println(threeSumClosest(s,tar));
	}
	
	public static int threeSumClosest(int[] nums, int target) {
        
        int length = nums.length;
        if(length<3) return 0;
        int i =0;
        int temp;
        int minN = 0;
        Arrays.sort(nums);
        int low = 0;
        int high = length-1;
        int ans = nums[low]+nums[1]+nums[high];
        int min_temp = min(nums,low,high,target,ans);
        while( min_temp!=target)
        {
        	if(min_temp - target > 0)
        	{
        		high--;
        	}
        	else
        	{
        		low++;
        	}
        	if(high-low >= 2)
        	{
        		min_temp = min(nums,low,high,target,min_temp);
        	}
        	
        	else break;
        	/*low++;
        	if(high-low>=2) minN = min(nums,low,high,target);
        	else break;
        	
        	if(minN < min_temp) min_temp=minN;
        	high--;
        	
        	if(high-low>=2) minN = min(nums,low,high,target);
        	else break;
        	
        	if(minN < min_temp) min_temp=minN;*/
        }
        return min_temp;
    }
	public static int min(int[] nums,int low,int high,int target,int temp)
	{
		int mid = (high+low)/2;
        int ans = Math.abs(temp-target);
        int delta = 0;
        int min = ans;
        int temp1 = nums[low]+nums[mid]+nums[high];
        delta = temp1-target;
        int flag = 0;
        if(delta > 0 ) flag = 1;
		while(mid!=low && mid!=high)
        {
        	temp1 = nums[low]+nums[mid]+nums[high];
        	delta = temp1-target;
        	min = Math.abs(delta);
        	
        	if(min < ans){
        		ans = min;
        		temp = temp1;
        	}
        	if(ans == 0) return temp;
        	if(flag > 0 ) mid--;	
        	else mid++;
        }
		return temp;
	}

}
