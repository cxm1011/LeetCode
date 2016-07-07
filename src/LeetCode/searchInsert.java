package LeetCode;

public class searchInsert {
	public static void main(String args[])
	{
		int[] nums={1,2,3,4,5,7};
		System.out.print(searchInsert(nums,0));
	}
	
	public static int searchInsert(int[] nums, int target) {
		int length = nums.length;
		if(length ==0) return 0;
        int mid = search(nums,0,length-1,target);
        if(nums[mid] == target) return mid;
        else
        {
        	if(nums[mid] > target)
        	{
        		return mid;
        	}
        	else
        		return mid+1;
        }
    }
	
	public static int search(int[] nums,int low,int high,int target)
	{
		int mid = low;
		if(low<high && nums[mid]!=target)
		{
			mid = (low+high)/2;
			if(nums[mid] > target)
			{
				mid=search(nums,low,mid-1,target);
			}
			if(nums[mid] < target)
			{
				mid=search(nums,mid+1,high,target);
			}
		}
		if(nums[mid] == target) return mid;
		else return mid;
		
	}

}
