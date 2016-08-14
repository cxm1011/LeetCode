package huawei;

import java.util.Scanner;

public class Move {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			String[] all = s.split(";");
			int len = all.length;
			int[][] ans = new int[1][2];
			for(int i = 0;i<len;i++)
			{
				if(effective(all[i]))
				{
					move(all[i],ans);
				}
			}
			System.out.println(ans[0][0]+","+ans[0][1]);
		}
	}
	public static void move(String s,int[][] ans)
	{
		char[] chars = s.toCharArray();
		int len = s.length();
		int num = 0;
		if(len == 2)
		{
			num = chars[1]-'0';
		}
		else
		{
			num = (chars[1]-'0')*10+(chars[2]-'0');
		}
		if(chars[0] == 'A')
		{
			ans[0][0] -=num;
		}
		if(chars[0] == 'S')
		{
			ans[0][1] -=num;
		}
		if(chars[0] == 'D')
		{
			ans[0][0] +=num;
		}
		if(chars[0] == 'W')
		{
			ans[0][1] +=num;
		}
	}
	public static boolean effective(String s)
	{
		
		char[] chars = s.toCharArray();
		int len = s.length();
		if(s==null || len==0) return false;
		if(len>3) return false;
		if(chars[0]=='A'||chars[0]=='S'||chars[0]=='D'||chars[0]=='W')
		{
			if(chars[1]>='0' && chars[1]<='9')
			{
				if(len == 3)
				{
					if(chars[2]>='0' && chars[2]<='9')
						return true;
					else return false;
				}
				return true;
			}
			return false;
		}
		return false;
	}
}
