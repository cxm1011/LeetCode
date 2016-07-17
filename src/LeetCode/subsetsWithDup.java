package LeetCode;

import java.util.*;

public class subsetsWithDup {
	public static void main(String args[])
	{
		int[] nums = {1,2,2,2,3,3};
		System.out.print(subsetsWithDup(nums));
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
	    List<List<Integer>> ans = new  ArrayList<List<Integer>>();
	    List<Integer> temp  = new ArrayList<Integer>();
	    int length = nums.length;
	    ans.add(temp);
	    Arrays.sort(nums);
	    if(length == 0) return ans;
	    int last = Integer.MAX_VALUE;
	    for(int i=1;i<=length;i++)
	    {
	    	find(ans,temp,i,length,0,nums,last);
	    }
	    return ans;
	}
	public static void find(List<List<Integer>> ans, List<Integer> temp,int i,
						int length,int j,int[] nums,int last)
	{
		if(temp.size() == i)
		{
			ans.add(new ArrayList<Integer>(temp));
			return;
		}
		
		while(j<length)
		{
			if(nums[j]!=last)
			{
				temp.add(nums[j]);
				find(ans,temp,i,length,j+1,nums,last);
				if(temp.size()>0)
				{
					last = temp.get(temp.size()-1);
					temp.remove(temp.size()-1);
				}
			}
			j++;
		}
		return;
	}
}

