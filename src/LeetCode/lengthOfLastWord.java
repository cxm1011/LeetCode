package LeetCode;

public class lengthOfLastWord {
	public static void main(String args[])
	{
		String s = "a hh";
		System.out.print(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) {
        int length = s.length();
        if(s==null || length==0) return 0;
        int ans = 0;
        char[] chars = s.toCharArray();
        int i = length-1;
        while(i>=0)
        {
        	if(chars[i]==' '&& ans==0) 
        	{
        		i--;
        		continue;
        	}
        	if(chars[i]==' '&& ans!=0) break;
        	i--;
        	ans++;
        }
        return ans;
    }

}
