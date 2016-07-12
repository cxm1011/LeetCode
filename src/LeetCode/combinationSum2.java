package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
	public static void main(String args[])
	{
		int[] nums={1,2,2,2,5};
		
		List<List<Integer>> ans = combinationSum2(nums,5);
		System.out.println(ans);
	
	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int length = candidates.length;
		if(length == 0) return ans;
		List<Integer> temp = new ArrayList<Integer>();
		int sum = 0;
		Arrays.sort(candidates);
		find(ans,temp,candidates,0,sum,length,target);
        return ans;
    }
	public static void find(List<List<Integer>> ans,List<Integer> temp,
							int nums[],int i,int sum,int length,int target)
	{
		if(i==length)
		{
			if(temp.size() ==0) return;
			return;
		}
		sum+=nums[i];
		if(sum == target)
		{
			temp.add(nums[i]);
			ans.add(new ArrayList<Integer>(temp));
			sum = sum-nums[i];
			temp.remove(temp.size()-1);
			return;
		}
		if(sum < target)
		{
			temp.add(nums[i]);
			find(ans,temp,nums,i+1,sum,length,target);
			temp.remove(temp.size()-1);
			sum-=nums[i];
		}
		if(sum>target) return;
		while(i+1<length && nums[i+1] == nums[i]) i++;
		find(ans,temp,nums,i+1,sum,length,target);
	}

}
