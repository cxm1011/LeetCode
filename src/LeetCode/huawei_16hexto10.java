package LeetCode;

import java.util.*;

public class huawei_16hexto10 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			if(s.length() <= 2) return;
			char[] chars = s.toCharArray();
			if(chars[0]!='0'||chars[1]!='x') return;
			int len = chars.length;
			long ans = 0;
			long index = 1;
			for(int i =len-1;i>=2;i--)
			{
				if(chars[i]>='0'&&chars[i]<='9')
				{
					ans += (chars[i]-'0')*index;
				}
				else
				{
					ans += (chars[i]-'A'+10)*index;
				}
				index*=16;
			}
			System.out.println(ans);
		}
	}
}
