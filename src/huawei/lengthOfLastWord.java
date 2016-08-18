package huawei;

import java.util.*;

public class lengthOfLastWord {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			double num = in.nextDouble();
			int first = (int)(num*10%10);
			if(first >=5)
			{
				System.out.println((int)(num+1));
			}
			else {
				System.out.println((int)(num));
			}
			
		}
	}
}
