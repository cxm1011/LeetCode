package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class subsets {
	public static void main(String args[])
	{
		int[] nums = {1,3,2};
		System.out.println(subsets(nums));
	}
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int length = nums.length;
        ans.add(temp);
        if(nums==null || length == 0) return ans;
        for(int k=1;k<=length;k++)
        {
        	find(ans,temp,nums,length,k,0);
        }
        return ans;
    }
	public static void find(List<List<Integer>> ans,List<Integer> temp,
							int[] nums,int length,int k,int i)
	{
		if(temp.size() == k)
		{
			ans.add(new ArrayList<Integer>(temp));
			return;
		}
		while(i<length)
		{
			temp.add(nums[i]);
			find(ans,temp,nums,length,k,i+1);
			temp.remove(temp.size()-1);
			i++;
		}
		return;
	}	
}
