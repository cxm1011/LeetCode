package huawei;

import java.util.*;

public class Labyrinth {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int M = in.nextInt();
			int[][] all = new int[N][M];
			for(int i=0;i<N;i++)
			{
				for (int j = 0; j < M; j++)
				{
					all[i][j] = in.nextInt();
				}
			}
			Stack<String> queue = new Stack<String>();
		    find(all,0,0,N,M,queue);
		    Stack<String> ans = new Stack<String>();
			while (!queue.isEmpty()) {
				ans.add(queue.pop());
			}
			while (!ans.isEmpty()) {
				System.out.println(ans.pop()+" ");
			}
		}
	}
	public static boolean find(int[][] all,int i,int j,int N,int M,Stack<String> queue)
	{
		if(i == N && j==M-1)
		{
			return true;
		}
		if(i == N-1 && j==M)
		{
		
			return false;
		}
		if(i == N) return false;
		if(j == M) return false;
		boolean temp1 = false;
		if(all[i][j] == 0)
		{
			String temp = "("+i+","+j+")";
			queue.push(temp);
			temp1 = find(all,i+1,j,N,M,queue);
			if(temp1 == true) return true;
			temp1 = find(all,i,j+1,N,M,queue);
			if(temp1 == true) return true;
			queue.pop();
		}
		else
		{	
			return false;
		}
		return temp1;
	}
}
