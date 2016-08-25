package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class numOfNegative {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[] all = new int[N];
			for (int i = 0; i < N; i++)
			{
				all[i] = in.nextInt();
			}
			int sum = 0;
			int numNeg = 0;
			int numPos = 0;
			for(int i=0;i<N;i++)
			{
				if(all[i] < 0) numNeg++;
				if(all[i] > 0)
				{
					numPos++;
					sum+=all[i];
				}
			}
			float aver = (float)sum/numPos;
			System.out.print(numNeg+" ");
			System.out.printf("%.1f\n",aver);
		}
	}
}
