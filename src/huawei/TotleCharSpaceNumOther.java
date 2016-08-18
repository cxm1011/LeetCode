package huawei;

import java.util.*;

public class TotleCharSpaceNumOther {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			int len = s.length();
			char[] chars = s.toCharArray();
			int numChar = 0,numSpace = 0,num =0,other =0;
			for (int i = 0; i < len; i++) 
			{
				if((chars[i]>='a'&&chars[i]<='z')|| (chars[i]>='A'&&chars[i]<='Z'))
					numChar++;
				else if(chars[i]>='0'&&chars[i]<='9')
					num++;
				else if(chars[i]==' ')
					numSpace++;
				else {
					other++;
				}
			}
			System.out.println(numChar);
			System.out.println(numSpace);
			System.out.println(num);
			System.out.println(other);
		}
	}
}
