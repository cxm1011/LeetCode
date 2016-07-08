package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class plusOne {
	public static void main(String args[])
	{
		int[] nums = {9,9,9,8,9};
		int[] ans = plusOne(nums);
		int length = ans.length;
		for(int i = 0;i<length;i++)
			System.out.print(ans[i]+" ");
		
	}
	public static int[] plusOne(int[] digits) 
	{
	    int length = digits.length;
	    int ten = 1;
	    int bit;
	    List<Integer> ans = new ArrayList<Integer>();
	    int j = 0;
	    for(int i = length-1;i>=0;i--)
	    {
	    	int temp = digits[i]+ten;
	    	ten = temp/10;
	    	bit = temp%10;
	    	ans.add(bit);
	    	j++;
	    }
	    if(ten == 1) ans.add(ten);
	    int lengthans = ans.size();
	    int[] ans1 = new int[lengthans];
	    int k = 0;
	    int temp = lengthans;
	    while(k<lengthans)
	    {
	    	ans1[k] = ans.get(temp-1);
	    	k++;
	    	temp--;
	    }
	    return ans1;
	}

}
