package huawei;

import java.util.*;

public class maxSameSubString {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			int lens1 = s1.length();
			int lens2 = s2.length();
			String max = lens1<lens2?s2:s1;
			String min = lens1<lens2?s1:s2;
			int minlen = min.length();
			if(minlen == 0) System.out.print(0);
			int L =0;
			for(int i=0;i<minlen;i++)
			{
				for(int j = i+1;j<=minlen;j++)
				{
					if(max.contains(min.substring(i, j))&& (j-i)>L)
					{
						L = j-i;
					}
				}
			}
			System.out.println(L);
		}
	}
}
