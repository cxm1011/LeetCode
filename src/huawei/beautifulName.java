package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class beautifulName {
	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			String[] S = new String[N];
			for(int k=0;k<N;k++)
			{
				 S[k] = in.next();
			}
			for(int m = 0;m<N;m++)
			{
				String s =S[m];
				s = s.toLowerCase();
				char[] chars = s.toCharArray();
				int len = s.length();
				HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
				for(int i=0;i<len;i++)
				{
					if(temp.containsKey(chars[i]))
						temp.put(chars[i], (temp.get(chars[i])+1));
					else
						temp.put(chars[i],1);
				}
				int num = temp.size();
				int[] all = new int[num];
				Iterator it = temp.keySet().iterator();
				int  i =0;
				while(it.hasNext())
				{
					char key = (char)it.next();
					all[i] = temp.get(key);
					i++;
				}
				Arrays.sort(all);
				int ans = 0;
				int index =26;
				for(int j=num-1;j>=0;j--)
				{
					ans += all[j]*index;
					index--;
				}
				System.out.println(ans);
			}
		}
	}
}
