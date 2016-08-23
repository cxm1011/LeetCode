package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class calculateTo24 {

	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int[] nums = new int[4];
			for(int i= 0;i<4;i++)
			{
				nums[i] = in.nextInt();
			}
			double[] nums1 = new double[4];
			for(int i= 0;i<4;i++)
			{
				nums1[i] = (double)nums[i];
			}
			boolean ans = calculate(nums1);
			
			System.out.println(ans);
		}
	}
	public static boolean calculate(double[] nums)
	{
		boolean ans = false;
		int len = nums.length;
		if(len == 1)
		{
			if(Math.abs(nums[0]-24)<0.00000001)
				return true;
			else 
				return false;
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i==j) continue;
				double temp = 0;
				for(int k =0;k<4;k++)
				{
					if(k==0)
					{
						temp = nums[i]+nums[j];
					}
					else if(k==1)
					{
						temp = nums[i]-nums[j];
					}
					else if(k==2)
					{
						temp = nums[i]*nums[j];
					}
					else {
						temp = (double)(nums[i]/nums[j]);
					}
					double[] newNums = deleteAndAdd(nums,i,j,temp);
					ans = calculate(newNums);
					if(ans == true)
					{
						return ans;
					}
				}
			}
		}
		return ans;
	}
	public static double[] deleteAndAdd(double[] nums,int i,int j,double temp)
	{
		int len = nums.length;
		int N = len-1;
		double[] newNums = new double[N];
		int m = 0;
		for(int k=0;k<len;k++)
		{
			if(k!=i && k!=j)
			{
				newNums[m] = nums[k];
				m++;
			}
		}
		newNums[m] = temp;
		return newNums;
	}
}
