package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class snake {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[][] ans = new int[N][N];
			result(N,ans);
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N-i;j++)
				{
					if(j!=N-i-1)
						System.out.print(ans[i][j]+" ");
					else {
						System.out.print(ans[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
	public static  void result(int N,int[][] ans) 
	{
		int index = 2;
		ans[0][0] = 1;
		for (int i = 1; i < N; i++) 
		{
			ans[0][i] = ans[0][i-1]+index;
			index++;
		}
		for (int i = 1; i < N; i++) 
		{
			int j = 0;
			while(j<N-i)
			{
				ans[i][j] = ans[i-1][j+1]-1;
				j++;
			}
		}
	}
}
