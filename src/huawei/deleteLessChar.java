package huawei;

import java.util.*;



public class deleteLessChar {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			int len = s.length();
			HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
			for(int i=0;i<len;i++)
			{
				if(temp.containsKey(chars[i]))
				{
					temp.put(chars[i], temp.get(chars[i]) +1);
				}
				else {
					temp.put(chars[i], 1);
				}
			}
			Iterator it = temp.keySet().iterator();
			int min = Integer.MAX_VALUE;
			while(it.hasNext())
			{
				char key = (char)it.next();
				if(temp.get(key)<min) min = temp.get(key);
			}
			StringBuilder delete = new StringBuilder();
			 it = temp.keySet().iterator();
			while(it.hasNext())
			{
				char key = (char)it.next();
				if(min == temp.get(key))
					delete.append(key);
			}
			String ans = deleteTwoString(s,delete.toString()); 
			System.out.println(ans);
		}
	}
	public static String deleteTwoString(String s1,String s2) 
	{
		int len1 = s1.length();
		int len2 = s2.length();
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		StringBuilder ans = new StringBuilder();
		int flag = 0;
		for(int i =0;i<len1;i++)
		{
			for(int j =0 ;j<len2;j++)
			{
				if(chars1[i] == chars2[j])
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0) ans.append(chars1[i]);
			flag = 0;
		}
		return ans.toString();
	}
}
