package huawei;

import java.util.Scanner;


public class splitEvery8 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			String c = in.nextLine();
			int lens = s.length()/8;
			int len1s = s.length()%8;
			int lenc = c.length()/8;
			int len1c = c.length()%8;
			for(int i=0;i<lens;i++)
				System.out.println(s.substring(i*8,(i+1)*8));
			if(len1s != 0)
			{
				String other = s.substring(s.length() - len1s)+"00000000";
				System.out.println(other.substring(0,8));
			}
			for(int i=0;i<lenc;i++)
				System.out.println(c.substring(i*8,(i+1)*8));
			if(len1c != 0)
			{
				String other = c.substring(c.length() - len1c)+"00000000";
				System.out.println(other.substring(0,8));
			}
		}
	}
}
