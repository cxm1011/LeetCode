package huawei;

import java.util.Scanner;

public class zhishuFactor {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long N = in.nextLong();
			int index = 2;
			StringBuilder ans = new StringBuilder();
			while(N != 1)
			{
				if(N%index == 0)
				{
					ans.append(index);
					ans.append(" ");
					N = N/index;
				}
				else {
					index++;
				}
			}
			String ans1 = ans.toString().substring(0,ans.length()-1);		
			System.out.println(ans1);
		}
	}
}
