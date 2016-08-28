package huawei;

import java.util.Scanner;

import LeetCode.intToRoman;

public class splitCharacterEvery8 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			String[] all = new String[N];
			for(int i=0;i<N;i++)
				all[i] = in.next();
			for(int i=0;i<N;i++)
			{
				String temp = all[i];
				int len = temp.length();
				int sum8 = len/8;
				int lastlen = len-sum8*8;
				if(lastlen !=0)
				{
					String[] tempall = new String[sum8+1];
					for(int j=0;j<sum8;j++)
					{
						tempall[j] = temp.substring(j*8,(j+1)*8);
					}
					StringBuilder addString = new StringBuilder();
					for(int k=0;k<(8-lastlen);k++)
						addString.append("0");
					tempall[sum8] = temp.substring(sum8*8,len)+addString.toString();
					for (int m = 0; m < tempall.length; m++) 
					{
						System.out.println(tempall[m]);
					}
				}
				else
				{
					String[] tempall = new String[sum8];
					for(int j=0;j<sum8;j++)
					{
						tempall[j] = temp.substring(j*8,(j+1)*8);
					}
					for (int m = 0; m < tempall.length; m++) 
					{
						System.out.println(tempall[m]);
					}
				}
				
				
				
				
				
			}
				
		}
	}
}
