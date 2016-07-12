package LeetCode;
import java.util.*;
public class combinationSum {
	public static void main(String args[])
	{
		int[] nums={1,2,3,6,7};
		
		List<List<Integer>> ans = combinationSum(nums,7);
		System.out.println(ans);
	
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int length = candidates.length;
		if(length == 0) return ans;
		List<Integer> temp = null;
		int i =0;
		int sum=0;
		Arrays.sort(candidates);
		temp = new ArrayList();
		sum = 0;
		search(candidates,target,temp,ans,i,sum,length);
		return ans;
    }
	public static void search(int[] nums, int target,
			List<Integer> temp,List<List<Integer>> ans,int i,int sum,int length)
	{	
		if(i == length)
		{
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
			search(nums,target,temp,ans,i,sum,length);
			temp.remove(temp.size() - 1);
			sum -= nums[i];
		}
		if(sum > target)
		{
			return;
		}
		search(nums,target,temp,ans,i+1,sum,length);
		return;
		
	}

}
