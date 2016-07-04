package LeetCode;
import java.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
	public static void main(String args[])
	{
		int s[] = {0,0,-1,-2,1,2};
		System.out.println(fourSum(s,0));
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int length = nums.length;
		if(length==0) return ans;
		Arrays.sort(nums);  //必须得先排序，否则会出现重复
		for(int i=0;i<length-3;i++)
		{
			if(i!=0 && nums[i]==nums[i-1]) continue;  //保证第一个数是不重复的，因为重复的数字如果已经达到target了，那么
													//就不会再可能出现不同组合的target了
			for(int j = i+1;j<length-2;j++)
			{
				if(j!=i+1 && nums[j]==nums[j-1]) continue;
				int left = j+1;
				int right = length-1;
				while(left < right)
				{
					int temp = nums[i]+nums[j]+nums[left]+nums[right];
					if(temp == target)
					{
						ArrayList<Integer> tmp = new ArrayList<Integer>();
						tmp.add(nums[i]);
						tmp.add(nums[j]);
						tmp.add(nums[left]);
						tmp.add(nums[right]);
						ans.add(tmp);
						left++;
						right--;
						while(left<right && nums[left] == nums[left-1]) left++;
						while(left<right && nums[right] == nums[right+1]) right--;
					}
					if(temp < target) left++;
					if(temp > target) right--;
				}
			}
		}
		return ans;
	}

}
