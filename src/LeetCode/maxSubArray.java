package LeetCode;

public class maxSubArray {
	public static void main(String args[])
	{
		int[] nums={-2,1};
		System.out.print(maxSubArray(nums));
	}
	/*public static int maxSubArray(int[] nums) //time out
	{
	    int length = nums.length;
	    if(length < 1) return 0;
	    if(length == 1) return nums[0];
	    int i = 0;
	    int sum = 0;
	    while(i<length)
	    {
	    	sum+=nums[i];
	    	i++;
	    }
	    int j = 0;
	    int max = sum;
	    int sumtemp = sum;
	    for(j=0;j<length;j++)
	    {
	    	//if(sumtemp > max) max = sumtemp;
	    	max = Math.max(sumtemp, max);
	    	for(int k = length-1;k>j;k--)
	    	{
	    		sumtemp = sumtemp-nums[k];
	    		max = Math.max(sumtemp, max);
	    		//if(sumtemp > max) max = sumtemp;	
	    	}
	    	sum = sum-nums[j];
	    	sumtemp = sum;
	    }
	    return max;
	}*/
	public static  int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0){
           return 0;
       }
       
       int max = Integer.MIN_VALUE, sum = 0;
       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           max = Math.max(max, sum);
           sum = Math.max(sum, 0);
       }

       return max;
   }
}
