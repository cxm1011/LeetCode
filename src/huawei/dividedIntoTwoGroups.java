package huawei;

import java.util.*;

import LeetCode.intToRoman;

public class dividedIntoTwoGroups {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[] all = new int[N];
			for(int i=0;i<N;i++)
			{
				all[i] = in.nextInt();
			}
			int s3 = 0;
			int s5 = 0;
			int s = 0;
			List<Integer> last = new ArrayList<Integer>();
			for(int i=0;i<N;i++)
			{
				if(all[i]%5 == 0)
				{
					s5+=all[i];
					continue;
				}
				if(all[i]%3 == 0)
				{
					s3+=all[i];
					continue;
				}
				last.add(all[i]);
				s +=all[i];
			}
			int len = last.size();
			int[] All = new int[len];
			for(int i=0;i<len;i++)
				All[i] = last.get(i);
			
			int temps = s+s3-s5;
			boolean ans = false;
			if((temps&1) == 0) 
			{
				int sum = temps/2;
				for(int i = 1;i<=len;i++)
				{
					ans = find(All, sum, 0,0, len, i, 0);
					if(ans)
						break;
				}
			}
			System.out.println(ans);
			
		}
	}
	public static boolean find(int[] all,int sum,int start,int tempN,int allN,int N,int s)
	{
		boolean ans = false;
		if(tempN == N)
		{
			if(s == sum)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		for(int i =start;i<allN;i++)
		{
			s += all[i];
			tempN++;
			ans = find(all, sum, i+1, tempN, allN, N, s);
			if(!ans)
			{
				tempN--;
				s -= all[i];
			}
			else {
				return ans;	
			}
		}
		return ans;
	}
}
