package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class arithmeticSum {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int a1 = 2;
			int d =3;
			int an = a1+(N-1)*d;
			int s  =(a1+an)*N/2;
			System.out.println(s);
		}
	}
	
}
