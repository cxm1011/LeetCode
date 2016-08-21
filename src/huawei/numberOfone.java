package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class numberOfone {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int ans = 0;
			while(N!=0)
			{
				ans++;
				N = (N-1)&N;
			}
			System.out.println(ans);
		}
	}

}
