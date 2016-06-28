package LeetCode;

import java.util.Scanner;

public class convert {
	
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		String s;
		int n ;
		s = "ABCD";
		n = 2;
		//String s1="";
		//String s2 = s1+s.charAt(2);
		//System.out.println(s2);
		System.out.println(convert(s,n));
	}
	public static String convert(String s, int numRows) 
	{
		if(s == null||s.length()==0) return "";
        String ans="";
        String[] s1=new String[numRows];
        for(int m = 0;m<numRows;m++) s1[m] ="";
        int length = s.length();
        int num = 0;
        int i = 0;
        int j = 0;
        while(num <length)
        {
        	if(j == 0)
        	{
	        	for(i=0;i<numRows;i++)
	        	{
	        		if(num >=length) break;
	        		s1[i] = s1[i]+s.charAt(num);
	        		num++;
	        	}
        	}
        	if(i == numRows)
        	{
        		if(numRows-2 <=0) //防止出现1行和2行情况
        		{
        			j=0;
        			continue;
        		}
        		
        		for(j = numRows-2;j>0;j--)
        		{
        			if(num >=length) break;
        			s1[j] = s1[j]+s.charAt(num);
        			num++;
        		}
        	}	
        }
        for(int k=0;k<numRows;k++)
        	ans = ans+ s1[k];
        return ans;
    }

}
