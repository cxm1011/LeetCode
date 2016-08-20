package huawei;

import java.util.*;

public class firstOfArray {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int k = in.nextInt();
			int[] all = new int[N];
			for(int i=0;i<N;i++)
			{
				all[i] = in.nextInt();
			}
			Arrays.sort(all);
			for(int i=0;i<k-1;i++)
			{
				System.out.print(all[i]+" ");
			}
			System.out.println(all[k-1]);
		}
	}

}
