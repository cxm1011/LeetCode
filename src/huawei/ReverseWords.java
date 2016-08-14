package huawei;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			String[] a =s.split(" ");
			StringBuilder ans = new StringBuilder();
			int len = a.length;
			for(int i=len-1;i>=1;i--)
			{
				ans.append(a[i]+" ");
			}
			ans.append(a[0]);
			System.out.println(ans);
		}
	}
}
