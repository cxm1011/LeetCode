package LeetCode;

public class canJump {
	public static void main(String args[])
	{
		int[] nums = {3,2,1,1,4};
		System.out.print(canJump(nums));
	}
//	public static boolean canJump(int[] nums) {
//        int length= nums.length;
//        if(length <= 1) return true;
//        boolean[] every = new boolean[length];
//        every[0] = true;
//        for(int i=0;i<length;i++)
//        {
//        	for(int j=0;j<i;j++)
//        	{
//        		if(j+nums[j] >= i)
//        		{
//        			every[i] = true;
//        			break;
//        		}
//        	}
//        }
//        return every[length-1];
//    }
	public static boolean canJump(int[] nums) {
		int length= nums.length;
        if(length <= 1) return true;
        int far = nums[0];  
        for(int i= 1;i<length;i++)
        {
        	if(i+nums[i]>far && i<=far)
        		far = i+nums[i];
        }
        return far >= length-1;
	}
}
