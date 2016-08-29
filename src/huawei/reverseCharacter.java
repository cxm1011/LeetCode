package huawei;

import java.util.*;

public class reverseCharacter {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			StringBuilder ans = new StringBuilder();
			int len = chars.length;
			for(int i=len-1;i >= 0;i--)
			{
				ans.append(chars[i]);
			}
			System.out.println(ans);
		}
	}

}
