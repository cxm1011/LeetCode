package LeetCode;
import java.util.*;
public class TwoSum
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] number = new int[n];
		for(int i=0;i<number.length;i++)
			number[i] = in.nextInt();
		System.out.println("原数组为：");
		for(int i=0;i<number.length;i++)
			System.out.print(number[i]+" ");
		System.out.println("");
		
		int[] answer1 = new int[2];
		System.out.println("输入目标数：");
	    int target= in.nextInt();
		answer1 = twoSum(number,target);
		for(int i=0;i<answer1.length;i++)
			System.out.print(answer1[i]+" ");
		System.out.println("");
	}
	
	public static int[] twoSum(int[] nums, int target) 
	{
		int[] answer = new int[2];
		int length = nums.length;
        for(int i=0;i<length-1;i++)
        {
        	answer[0] = i;
        	for(int j=i+1;j<length;j++)
        	{
        		if(nums[i]+nums[j]==target)
        		{
        			answer[1] = j;
        			return answer;
        		}
        	}
 
        }
        return answer;
	}
}
