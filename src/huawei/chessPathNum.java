package huawei;

import java.util.*;

import LeetCode.findMedianSortedArrays;

public class chessPathNum {

	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			int m = in.nextInt();
			int ans = find(n,m,0,0,0);
			System.out.println(ans);
		}
	}
	public static int find(int n,int m,int i,int j,int ans)
	{
		
		if(i == n && j == m)
		{
			ans++;
			return ans;
		}
		if(i > n) return ans;
		if(j > m) return ans;
		ans = find(n,m,i+1,j,ans);
		ans = find(n,m,i,j+1,ans);
		return ans;
	}
}
