package LeetCode;

import java.util.Stack;

public class isValid {
	public static void main(String args[])
	{
		String x = "((";
		System.out.println(isValid(x));
	}
	public static boolean isValid(String s) {
        int length = s.length();
        if(s==null || length==0) return true;
        if(length%2==1) return false;
        char[] all = {'(',')','[',']','{','}'};
        
        Stack<Character> stack = new Stack<Character>();
        char temp;
        int temp_index;
        int i = 0;
        int loc1,loc2;
        for(i = 0;i<length;i++)
        {
        	loc1 = index(all,s.charAt(i));
        	if(loc1%2==0)  stack.push(s.charAt(i));
        	else
        	{
        		if(!stack.empty())
    			{
        			temp = stack.pop();
        			temp_index = index(all,temp);
        			if(loc1-temp_index!=1) return false;
    			}
        		else
        			return false;
        		
        	}
        }
        if(!stack.empty()) return false;
        return true;
    }
	public static int index(char[] s,char search)
	{
		int i = 0;
		for(i=0;i<6;i++) 
		{
			if(s[i]==search)
				return i;
		}
		return -1;
	}

}
