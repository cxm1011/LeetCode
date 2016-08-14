package huawei;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			StringBuilder ans = new StringBuilder();
			while(N!=0)
			{
				ans.append(N%10);
				N = N/10;
			}
			System.out.print(ans);
		}
	}
}
