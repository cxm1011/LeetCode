package huawei;

import java.util.HashSet;
import java.util.Scanner;



public class lastToFistNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			HashSet<Integer> temp = new HashSet<Integer>();
			int[] ans = new int[1000];
			int len = 0;
			while(N!=0)
			{
				int last = N%10;
				N = N/10;
				if(!temp.contains(last))
				{
					ans[len] = last;
					len++;
					temp.add(last);
				}
				
			}
			int j =0 ;
			int ans1 = 0;
			while(j<len)
			{
				ans1 = ans1*10+ans[j];
				j++;
			}
			System.out.println(ans1);
		}
	}
}
