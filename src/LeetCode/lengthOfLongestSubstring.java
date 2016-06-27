package LeetCode;
import java.util.*; 
public class lengthOfLongestSubstring 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s  = "[";
		System.out.println(s.length());
		
		
		//if(s.charAt(0)==s.charAt(1)) System.out.println("ПаµИ");
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s)
	{
	
		 if(s == null || s.length() == 0)
	        {
	            return 0;
	        }
        int length = s.length();
		int max = 1;
		int temp = 1;
		int flag = 0;
		for(int i=0;i<length-1;i++)
		{
			int other = length - i;
			for(int j=i+1;j<length;j++)
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
