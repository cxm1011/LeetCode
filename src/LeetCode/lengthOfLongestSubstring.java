package LeetCode;
import java.util.*;
public class lengthOfLongestSubstring 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s  = in.nextLine();
		//if(s.charAt(0)==s.charAt(1)) System.out.println("ПаµИ");
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s)
	{
		s = s.replaceAll(" ","");
		int length = s.length();
        if(length <= 2) return 0;
		int max = 1;
		int temp = 1;
		int flag = 0;
		for(int i=1;i<length-2;i++)
		{
			int other = length - i;
			for(int j=i+1;j<length-1;j++)
			{
				for(int k=i;k<j;k++)
				{
					if(s.charAt(k)==s.charAt(j)) flag = 1;
				}
				if(flag!=1) temp = j-i+1;
				else break;	
			}
			if(temp > max) max = temp;
			if(other <= max) return max;
			temp = 1;
			flag = 0;
		}
		return max;
	}

}
