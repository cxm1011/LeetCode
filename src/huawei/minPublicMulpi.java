package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class minPublicMulpi {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int M = in.nextInt();
			int ans= 0;
			ans = maxDivisor(M,N);
			
			System.out.println((M*N)/ans);
		}
	}
	public static int maxDivisor(int m,int n)
	{
		while(n!=0)
		{
			int c = m%n;
			m = n;
			n = c;
		}
		return m;
	}
}
