package huawei;

import java.util.*;

public class maxPublicSubstring {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			String max = s1.length()>s2.length()?s1:s2;
			String min = s1.length()>s2.length()?s2:s1;
			int len = min.length();
			int L = 0;
			String ans = "";
			for(int i=0;i<len;i++)
			{
				for(int j = i+1;j<=len;j++)
				{
					if(max.contains(min.substring(i, j))&&j-i>L)
					{
						L = j-i;
						ans = min.substring(i,j);
					}
				}
			}
			System.out.println(ans);
		}
	}
}
