package huawei;

import java.util.*;

public class RabbitNumber {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[] numRabbit = new int[N+1];
			numRabbit[0] = 1;
			numRabbit[1] = 1;
			numRabbit[2] = 1;
			for(int i = 3;i<=N;i++)
			{
				numRabbit[i] = numRabbit[i-1]+numRabbit[i-2];
			}
			System.out.println(numRabbit[N]);
		}
	}
}
