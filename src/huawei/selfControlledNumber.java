package huawei;

import java.util.*;

public class selfControlledNumber {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int num = 0;
			for(int k = 0;k<N;k++)
			{
				long ans = k*k;
			
				String ns = Integer.toString(k);
				String anss = Long.toString(ans);
				char[] charns = ns.toCharArray();
				char[] charanss = anss.toCharArray();
				int lenns =ns.length();
				int lenanss = anss.length();
				boolean flag = false;
				for(int i=0;i<lenns && !flag;i++)
				{
					if(charns[i] != charanss[lenanss-lenns+i])
						flag = true;
				}
				if(!flag) num++;
			}
			System.out.println(num);
		}
	}
}
