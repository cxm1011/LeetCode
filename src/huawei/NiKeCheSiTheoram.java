package huawei;

import java.util.*;

public class NiKeCheSiTheoram {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int ans = N*N*N;
			StringBuilder ansBuilder = new StringBuilder();
			//if((N&1) == 1)
			//{
				int a = ans/N;
				int i =0;
				for(i =1-N;i<N-1;i+=2)
				{
					int temp = a+i;
					ansBuilder.append(String.valueOf(temp));
					ansBuilder.append("+");
				}
				int temp = a+i;
				ansBuilder.append(String.valueOf(temp));
				System.out.println(ansBuilder);
			//}
			//else
			//{
				
			//}
		}
	}
}
