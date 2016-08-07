package LeetCode;
import java.util.*;
public class evalRPN {
	public static void main(String[] args)
	{
		String[] tokens = {"2", "1", "/"};
		System.out.print(evalRPN(tokens));
	}
	public static int evalRPN(String[] tokens) {
		int len = tokens.length;
        if(tokens == null || len==0) return -1;
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;

        for(i=0;i<len;i++)
        {
        	if(tokens[i].equals("+") || tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/"))
        	{
        		int a = stack.pop();
        		int b = stack.pop();
        		if(tokens[i].equals("+"))
        			stack.push(b+a);
        		if(tokens[i].equals("-"))
        			stack.push(b-a);
        		if(tokens[i].equals("*"))
        			stack.push(b*a);
        		if(tokens[i].equals("/"))
        		{
        			if(a == 0) return 0;
        			stack.push(b/a);
        		
        		}
        	}
        	else
        	{
        		stack.push(Integer.valueOf(tokens[i]));
        	}
        }
        
        return stack.peek();
        
    }
	
}
