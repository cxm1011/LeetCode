package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class addCharBetweenNumber {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			int len = s.length();
			StringBuilder ans = new StringBuilder();
			int t = 0;
			for (int i = 0; i < len; i++) 
			{
				
				while(i<len && chars[i]>='0'&&chars[i]<='9')
				{
					t++;
					if(t==1)
					{
						ans.append('*');
					}
					ans.append(chars[i]);
					i++;
				}
				if(t!=0)
				{
					ans.append('*');
				}	
				if(i<len) ans.append(chars[i]);
				t = 0;
			}
			System.out.println(ans);
		}
	}
}
