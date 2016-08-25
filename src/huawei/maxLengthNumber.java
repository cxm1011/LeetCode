package huawei;

import java.util.*;

public class maxLengthNumber {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			List<String> ans = new ArrayList<String>();
			int len = s.length();
			char[] chars = s.toCharArray();
			int temp = 0;
			int max = 0;
			StringBuilder temps = new StringBuilder();
			for(int i=0;i<len;i++)
			{
				while(i<len && chars[i]>='0'&&chars[i]<='9')
				{
					temps.append(chars[i]);
					temp++;
					i++;
				}
				if(temp == max)
				{
					ans.add(temps.toString());
				}
				if(temp > max)
				{
					max = temp;
					ans.clear();
					ans.add(temps.toString());
				}
				temps = new StringBuilder();
				temp = 0;
			}
			Iterator it = ans.iterator();
			StringBuilder anStringBuilder = new StringBuilder();
			while(it.hasNext())
			{
				String temps1 = (String)it.next();
				anStringBuilder.append(temps1);
			}
			System.out.println(anStringBuilder+","+max);
			
		}
	}

}
