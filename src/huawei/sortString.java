package huawei;

import java.util.*;

public class sortString {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			int len = s.length();
			char[] chars = s.toCharArray();
			char[] chars1 = s.toLowerCase().toCharArray();
			for(int i=0;i<len;i++)
			{
				for(int j=len-1;j>i;j--)
				{
					if((chars[j]>='a'&& chars[j]<='z')||(chars[j]>='A'&& chars[j]<='Z'))
					{
						int k = j-1;
						while((k>=i)&&(!((chars[k]>='a'&& chars[k]<='z')||(chars[k]>='A'&& chars[k]<='Z'))))
						{
							k--;
						}
						
						if(k<i) continue;
						if(chars1[j]<chars1[k])
						{
							char temp = chars[j];
							chars[j] = chars[k];
							chars[k]  = temp;
							
							char temp1 = chars1[j];
							chars1[j] = chars1[k];
							chars1[k]  = temp1;
						}
					}
				}
			}
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i < len; i++) {
				ans.append(chars[i]);
			}
	
			System.out.println(ans);
		}
	}
}
