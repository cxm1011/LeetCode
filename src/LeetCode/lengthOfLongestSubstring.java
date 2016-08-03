package LeetCode;
import java.util.*; 
public class lengthOfLongestSubstring 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s  = "abcabcbb";
		System.out.println(s.length());
		int[] record = new int[1000];
		int end = 1;
		System.out.println(s.charAt(end-1));
		record[s.charAt(end-1)] = 1;
		System.out.println(record[0]);
		
		//if(s.charAt(0)==s.charAt(1)) System.out.println("相等");
		//System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s)
	{
	
		 if(s == null || s.length() == 0)
	        {
	            return 0;
	        }
	        
	        int maxLen = 1;
	        int nowLen = 1;
	        int len = s.length();
	        int[] record = new int[1000];
	        int start = 1;
	        int end = 1;
	        int buf;
	        record[s.charAt(end-1)] = end;
	        while(end < len)
	        {
	            end++;
	            if(record[s.charAt(end-1)] == 0)
	            {
	                ++nowLen;
	                record[s.charAt(end-1)] = end;
	                if(nowLen > maxLen)
	                {
	                    maxLen = nowLen;
	                }
	            }
	            else
	            {
	                nowLen = end - record[s.charAt(end-1)]; //求当前字符串长度
	                buf = record[s.charAt(end-1)];  //找到重复字符的位置
	                record[s.charAt(end-1)] = end;   // 更新重复位置
	                for(int i=start;i<buf;i++)   //将重复位置之前的字符标志位置0
	                {
	                    record[s.charAt(i-1)] = 0;
	                }
	                start = buf+1;//清零新的起点
	            }
	        }
	        
	        return maxLen;

	}

}
