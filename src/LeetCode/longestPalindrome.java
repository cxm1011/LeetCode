package LeetCode;
import java.util.*;
public class longestPalindrome 
{
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		String s  = in.nextLine();
		System.out.println(longestPalindrome(s));
	}
	public static String longestPalindrome(String s) 
	{
        if (s == null || s.length() == 0) 
        {
            return "";
        }       
        int length = s.length();    
        int max = 0;
        int middle = 0;
        String result = "";
        for(int i = 0; i <= length - 1&&(length-i+1>max); i++)
        {
        	int temp = i;
        	for(int j = length -1;j>=i&&(j-i+1)>max;j--)
        	{
        		int tempj = j;
        		if((tempj-temp)%2 == 0) middle = (tempj-temp)/2-1+temp;
        		else middle = (tempj-temp)/2+temp;
            	while(temp <= middle)
            	{
            		if(s.charAt(temp) == s.charAt(tempj))
            		{
            			temp++;
            			tempj--;
            		}
            		else
            		{
            			break;
            		}
            		
            	}
            	if(temp-1 == middle)
            	{
            		if(j-i+1> max)
            		{
            			result = s.substring(i,j+1);
            			max = j-i+1;
            		}
            	}
            	temp = i;  //初始化不能少！
        	}	
        }
        return result;
    }
    
 
}
