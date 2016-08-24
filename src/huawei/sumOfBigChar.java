package huawei;

import java.util.*;

public class sumOfBigChar {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			int len = s.length();
			int ans = 0;
			for(int i =0;i<len;i++)
			{
				if(chars[i]>='A'&&chars[i]<='Z')
					ans++;
			}
			System.out.println(ans);
		}
	}
}
