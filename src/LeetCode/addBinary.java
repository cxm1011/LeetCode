package LeetCode;

public class addBinary {
	public static void main(String args[])
	{
		String a = "101111";
		String b = "10";
		
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int lengtha = a.length();
        int lengthb = b.length();
        if(lengtha == 0) return b;
        if(lengthb == 0) return a;
        char[] stra = a.toCharArray();
        char[] strb = b.toCharArray();
        int i=lengtha-1;
        int j = lengthb-1;
        int ten = 0;
        int bit = 0;
        while(i>=0&&j>=0)
        {
        	int temp = stra[i]-'0'+strb[j]-'0'+ten;
        	if(temp == 1)
        	{
        		bit = 1;
        		ten = 0;
        	}
        	else if(temp == 0)
        	{
        		bit = 0;
        		ten = 0;
        		
        	}
        	else if(temp == 2)
        	{
        		bit = 0;
        		ten = 1;
        		
        	}
        	else if(temp == 3)
        	{
        		bit = 1;
        		ten = 1;
        		
        	}
        	ans.append(bit);	
        	i--;
        	j--;
        }
        if(i==-1 &&j>=0)
        {
        	while(j>=0)
        	{
        		if((strb[j]-'0'+ten) == 1)
        		{
        			bit = 1;
            		ten = 0;
        		}
        		else if((strb[j]-'0'+ten) == 0)
            	{
        			bit = 0;
            		ten = 0;
            	}
        		else if((strb[j]-'0'+ten) == 2)
            	{
        			bit = 0;
            		ten = 1;
            	}
            	ans.append(bit);	
            	j--;
        	}
        	
        }
        if(j==-1 &&i>=0)
        {
        	while(i>=0)
        	{
        		if((stra[i]-'0'+ten) == 1)
        		{
        			bit = 1;
            		ten = 0;
        		}
        		else if((stra[i]-'0'+ten) == 0)
            	{
        			bit = 0;
            		ten = 0;
            	}
        		else if((stra[i]-'0'+ten) == 2)
            	{
        			bit = 0;
            		ten = 1;
            	}
            	ans.append(bit);
            	i--;
        	}
        }
        if(ten == 1) ans.append(1);
        StringBuilder ans1 = new StringBuilder();
        int length = ans.length();
        while(length>=1)
        {
        	ans1.append(ans.charAt(length-1));
        	length--;
        }
        return ans1.toString();
    }

}
