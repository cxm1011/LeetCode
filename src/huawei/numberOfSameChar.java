package huawei;

import java.util.*;

public class numberOfSameChar {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			String c = in.nextLine();
			char cc = c.charAt(0);
			int len = s.length();
			char other = ' ';
			int flag = 0;
			if(cc>='A'&&cc<='Z')
			{
				flag =1;
				other = c.toLowerCase().charAt(0);
			}
			if(cc>='a'&&cc<='z')
			{
				flag = 1;
				other = c.toUpperCase().charAt(0);
			}
			char[] chars = s.toCharArray();
			int ans = 0;
			if(flag == 1)
			{
				for(int i=0;i<len;i++)
				{
					if(chars[i] == cc || chars[i] == other)
						ans++;
				}
			}
			else {
				for(int i=0;i<len;i++)
				{
					if(chars[i] == cc)
						ans++;
				}
			}
			
			System.out.println(ans);
		}
	}
}
