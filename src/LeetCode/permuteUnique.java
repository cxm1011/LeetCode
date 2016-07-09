package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
	public static void main(String args[])
	{
		int[] nums={2,2,1};
		List<List<Integer>> ans= permuteUnique(nums);
		System.out.println(ans);
	}
	
	public static List<List<Integer>> permuteUnique(int[] nums) {
        int length =nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(length ==0) return ans;
        List<Integer> temp = new ArrayList<Integer>();
        int[] flag = new int[length];
        Arrays.sort(nums);
        ans = find(ans,temp,nums,length,flag);
        return ans;
    }
	
	public static List<List<Integer>> find(List<List<Integer>> ans,List<Integer>temp,
			int[] nums,int length,int[] flag)
	{
		if(temp.size() == length)
		{
			ans.add(new ArrayList<Integer>(temp));
			return ans;
		}
		int i = 0;
		for(i = 0;i<length;i++)
		{
			if(flag[i]!=0 ||(i!=0 && nums[i] == nums[i-1]&&flag[i-1]==0)) //相等的同样位置不放
			{
				continue;
			}
			else
			{
				flag[i] = 1;
				temp.add(nums[i]);
				ans = find(ans,temp,nums,length,flag);
				flag[i] = 0;
				temp.remove(temp.size()-1);
				
			}
		}
		return ans;
	}

}
