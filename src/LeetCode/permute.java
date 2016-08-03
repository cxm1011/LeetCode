package LeetCode;
import java.util.*;
public class permute {
	public static void main(String args[])
	{
		int[] nums={2,3,1};
		List<List<Integer>> ans= permute(nums);
		System.out.println(ans);
	}
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length == 0) return ans;
        List<Integer> temp = new ArrayList<Integer>();
        int length = nums.length;
        ans = find(ans,temp,nums,length);
        return ans;
    }
	public static List<List<Integer>> find(List<List<Integer>> ans,List<Integer> temp,int[] nums,int length)
	{
		if(temp.size() == length)
		{
			ans.add(new ArrayList<Integer>(temp)); //这样是个新的temp加进去。否则当temp改变时，ans中的元素也会改变
			return ans;
		}
		int i = 0;
		for(i = 0;i<length;i++)
		{
			if(temp.contains(nums[i]))
				continue;
			temp.add(nums[i]);
		    ans = find(ans,temp,nums,length);
		    temp.remove(temp.size()-1);
		}
		return ans;
	}

}
