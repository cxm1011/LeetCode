package huawei;

import java.util.HashSet;
import java.util.Scanner;

public class differentNumberOfChar {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			HashSet<Character> temp = new HashSet<Character>();
			char[] chars = s.toCharArray();
			int len = s.length();
			for(int i = 0;i<len;i++)
			{
				temp.add(chars[i]);
			}
			System.out.println(temp.size());
		}
	}
}
