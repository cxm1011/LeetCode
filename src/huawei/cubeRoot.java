package huawei;

import java.util.Scanner;

public class cubeRoot {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			double y = in.nextDouble();
			System.out.printf("%.1f\n",root(1, y));
		}
	}
	public static double root(double N,double y)
	{
		if(Math.abs(N*N*N-y)<0.00000001)
			return N;
		else
			return root(((2*N)/3.0+y/(3*N*N)), y);
	}

}
