package huawei;

import java.util.*;

public class Rebound {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int height = in.nextInt();
			double N = 5;
			double s = height + height*(1-Math.pow((double)1/2, N-1))/(double)(1-1.0/2);
			double fiveHeight = height*Math.pow((double)1/2, N);
			System.out.println(s);
			System.out.println(fiveHeight);
		}
	}
}
