package LeetCode;

public class searchRange {
	public static void main(String args[])
	{
		int[] nums={2,2};
		int[] ans = searchRange(nums,1);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
	public static int[] searchRange(int[] nums, int target) {
		int[] ans={-1,-1};
		int length = nums.length;
		if(length ==0) return ans;
        int mid = search(nums,0,length-1,target);
        if(mid==-1) return ans;
        int max = mid;
        int min = mid;
        while(min >= 0&&nums[min]==target) min--;
        while(max < length&&nums[max]==target) max++;
        ans[0] = min+1;
        ans[1] = max-1;
        return ans;
    }
	public static int search(int[] nums,int low,int high,int target)
	{
		int ans = -1;
		int mid = low;
		if(mid!=-1&&low<high && nums[mid]!=target)
		{
			mid = (low+high)/2;
			if(mid!=-1&&nums[mid] > target)
			{
				mid=search(nums,low,mid-1,target);
			}
			if(mid!=-1&&nums[mid] < target)
			{
				mid=search(nums,mid+1,high,target);
			}
		}
		if(mid == -1) return -1;
		if(nums[mid] == target) return mid;
		else return ans;
		
	}

}
