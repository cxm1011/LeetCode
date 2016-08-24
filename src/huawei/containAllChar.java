package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class containAllChar {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			String max = s1.length()>s2.length()?s1:s2;
			String min = s1.length()>s2.length()?s2:s1;
			HashSet<Character> maxString = new HashSet<Character>();
			char[] chars = max.toCharArray();
			int len = max.length();
			for(int i = 0;i<len;i++)
			{
				maxString.add(chars[i]);
			}
			int minlen = min.length();
			char[] charsmin = min.toCharArray();
			boolean ans = true;
			for(int i=0;i<minlen;i++)
			{
				if(!maxString.contains(charsmin[i]))
				{
					ans = false;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
