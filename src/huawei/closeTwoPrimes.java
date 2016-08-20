package huawei;

import java.awt.List;
import java.util.*;

import LeetCode.intToRoman;

public class closeTwoPrimes {

	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			ArrayList<Integer> all = new ArrayList<Integer>();
			for(int i =1;i<N;i++)
			{
				if(findPrime(i))
				{
					all.add(i);
				}
			}
			int left = middle(all,N/2);
			int right = left;
			while(all.get(left)+all.get(right)!=N)
			{
				if(all.get(left)+all.get(right)<N)
				{
					right++;
				}
				else
				{
					left--;
				}
				
			}
			for(int i = 0;i<all.size();i++)
			{
				System.out.print(all.get(i)+" ");
			}
			System.out.println(all.get(left));
			System.out.println(all.get(right));
		}
	}
	public static boolean findPrime(int N)
	{
		boolean ans = true;
		for(int i=2;i<=N/2;i++)
		{
			if(N%i==0) return false;
		}
		return ans;
	}
	public static int middle(ArrayList<Integer> all,int N)
	{
		int len = all.size();
		int min = 0;
		int max = len;
		int mid = (min+max)/2;
		while(all.get(mid)!=N && min<max)
		{
			if(all.get(mid)>N)
			{
				max = mid-1;
			}
			else 
			{
				min = mid+1;
			}
			mid = (min+max)/2;
		}
		return mid;
	}
}
