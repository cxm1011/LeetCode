package huawei;

import java.util.*;

public class combineTwoArrays {

	public static void main(String args[])
	{	
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int NA = in.nextInt();
			int[] A = new int[NA];
			for(int i=0;i<NA;i++)
				A[i] = in.nextInt();
			int NB = in.nextInt();
			int[] B = new int[NB];
			for(int i=0;i<NB;i++)
				B[i] = in.nextInt();
			
			Arrays.sort(A);
			Arrays.sort(B);
			List<Integer> ans = new ArrayList<Integer>();
			int i = 0;
			int j = 0;
			if(NA == 0 && NB!=0)
			{
				for(j=0;j<NB;j++)
					ans.add(B[j]);
			}
			if(NB == 0 && NA!=0)
			{
				for(i=0;i<NA;i++)
					ans.add(A[i]);
			}
			while(i<NA && j<NB)
			{
				if(A[i] < B[j])
				{
					ans.add(A[i]);
					i++;
				}
				else if(A[i]>B[j])
				{
					ans.add(B[j]);
					j++;
				}
				else {
					ans.add(A[i]);
					i++;
					j++;
				}
			}
			if(i == NA &&j<NB)
			{
				for(int k=j;k<NB;k++)
					ans.add(B[k]);
			}
			if(j == NB &&i<NA)
			{
				for(int k=i;k<NA;k++)
					ans.add(A[k]);
			}
			Iterator it = ans.iterator();
			while(it.hasNext())
			{
				int num = (int)it.next();
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
