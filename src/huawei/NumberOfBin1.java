package huawei;

import java.util.Scanner;

public class NumberOfBin1 {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			String s = Integer.toBinaryString(N);
			char[] chars = s.toCharArray();
			int len = s.length();
			int ans = 0;
			for(int i=0;i<len;i++)
			{
				if(chars[i] == '1')
					ans++;
			}
			System.out.println(ans);
		}
	}
}
