package LeetCode;

public class convertToTitle {
	public static void main(String args[])
	{
		int n = 53;
		System.out.print(convertToTitle(n));
	}
	public static String convertToTitle(int n) {
		StringBuilder ans = new StringBuilder();
		if(n <= 0) return null;
        while(n>0)
        {
        	int temp = n%26;
        	if(temp == 0)
        	{
        		temp = 26;
        		ans.append('Z');
        	}
        	else ans.append((char)(temp-1+'A'));
        	n = (n-temp)/26;
        	
        }
        StringBuilder ans1 = new StringBuilder();
        for(int i=ans.length()-1;i>=0;i--)
        {
        	ans1.append(ans.charAt(i));
        }
        return ans1.toString();
    }
}
