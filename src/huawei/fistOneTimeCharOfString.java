package huawei;

import java.util.*;

public class fistOneTimeCharOfString {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
			char[] chars = s.toCharArray();
			int len = s.length();
			for(int i =0 ;i<len;i++)
			{
				if(temp.containsKey(chars[i]))
				{
					temp.put(chars[i],temp.get(chars[i])+1);
				}
				else
				{
					temp.put(chars[i], 1);
				}
			}
			for(int i=0;i<len;i++)
			{
				if(temp.get(chars[i])==1)
				{
					System.out.println(chars[i]);
					break;
				}
			}
		}
	}
}
