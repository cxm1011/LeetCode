package huawei;

import java.util.*;

public class maxContinues1OfByte {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			String temp = Integer.toBinaryString(N);
			char[] chars =temp.toCharArray();
			int len = temp.length();
			int ans = 0;
			int max = 0;
			for(int i = 0;i<len;i++)
			{
				while(i<len && chars[i] == '1')
				{
					ans++;
					i++;
				}
				max = Math.max(ans, max);
				ans = 0;
			}
			System.out.println(max);
		}
	}
}
