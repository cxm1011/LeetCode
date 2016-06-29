package LeetCode;
import java.util.*;
public class myAtoi {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		String s = " ++1";
		//int a = s.charAt(1);
		//System.out.println(a);
		System.out.println(myAtoi(s));
		
	}
	public static int myAtoi(String str) 
	{
		str = str.trim();  //首先将前面和的空格去除
		int length = str.length();
		if(str==null||length == 0) return 0;
		int  flag = 1;
		int zheng = 0;
		int fu = 0;
        double ans = 0;
        for(int i = 0;i<length;i++)
        {
        	if(str.charAt(i) =='+') 
    		{
        		flag = 1;
        		zheng++;
        		continue;
    		}
        	if(str.charAt(i) =='-') 
    		{
        		flag = -1;
	    		fu++;
	    		continue;
    		}
        	if(zheng+fu>1 ) {ans = 0; return (int)ans;} //符号连着出现超过两个就结束
        	if(str.charAt(i)>='0'&&str.charAt(i)<='9')
        		ans = ans*10+(str.charAt(i)-'0');
        	else break;  //出现非数字就结束
        } 
        ans = flag*ans; 
        if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;//防止超过范围
        if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)ans;
    }
}
