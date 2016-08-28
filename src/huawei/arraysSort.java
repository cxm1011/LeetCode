package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class arraysSort {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[] all = new int[N];
			for(int i=0;i<N;i++)
				all[i] = in.nextInt();
			int flag = in.nextInt();
			Arrays.sort(all);
			int i = 0;
			if(flag == 0)
			{
				for(i=0;i<N-1;i++)
					System.out.print(all[i]+" ");
				System.out.println(all[i]);
			}
			else {
				for(i=N-1;i>0;i--)
					System.out.print(all[i]+" ");
				System.out.println(all[0]);
			}
		}
	}
}
