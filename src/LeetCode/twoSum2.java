package LeetCode;

public class twoSum2 {
	public static void main(String[] args) 
	{
		
	}
	public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        if(len <2) return null;
        int left = 0;
        int right = len-1;
        int temp = numbers[left]+numbers[right];
        int[] ans = new int[2];
        while(left < right && temp!=target)
        {
        	if(temp<target)
        	{
        		left++;
        	}
        	else {
				right--;
			}
        	temp = numbers[left]+numbers[right];
        }
        if(temp == target)
        {
        	ans[0] = left+1;
        	ans[1] = right+1;
        }
        return ans;
     }

}
