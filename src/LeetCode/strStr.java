package LeetCode;

public class strStr {
	public static void main(String args[])
	{
		String s = " ";
		System.out.println(strStr(s," "));
		
	}
	public static int strStr(String haystack, String needle) 
    {
        int ans=-1;
        int length = haystack.length();
        int length1 = needle.length();
        if(length ==0 &&length1==0) return 0;
        if(length ==0 &&length1!=0) return -1;
        
        if(length!=0 && length1 == 0) return 0;
        int[] next = next(needle);
        int i = 0,j=0;
        while(i<length && j<length1)
        {
        	if(j==-1 || haystack.charAt(i) == needle.charAt(j))//j=-1时为起始值都得判断。
        	{
        		i++;
        		j++;
        	}
        	else
        	{
        		j = next[j];
        	}
        }
        if(j==length1)
        {
        	ans = i-j;
        }
        return ans;
        
    }
	public static int[] next(String s) //求next数组
	{
		int length = s.length();
		int[] next = new int[length];
		int i = 0;
		int j = -1;
		next[0] = -1;
		while(i<length-1)
		{
			if(j==-1||s.charAt(i)==s.charAt(j))
			{
				i++;
				j++;
				next[i] = j;
			}
			else j = next[j];
		}
		return next;
	}

}
