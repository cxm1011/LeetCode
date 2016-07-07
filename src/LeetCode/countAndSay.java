package LeetCode;

public class countAndSay {
	public static void main(String args[])
	{
		/*int a=1;
		int b=2;
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		builder.append(b);
		String s = builder.toString();
		System.out.println(s);*/
		System.out.println(countAndSay(2));
	}
	public static String countAndSay(int n) {
		String ans = "1";
		String ans1="";
		StringBuilder builder = new StringBuilder();
		if(n ==1) return ans;
		if(n == 2)
		{
			ans = "11";
    		return ans;
		}
		int i = 2;
		int count = 1;
		int j=0;
		ans = "11";
		while(i < n)
		{
			int length = ans.length();
			ans1 ="";
			for(j=0;j<length-1;j++)
			{
				if(ans.charAt(j) == ans.charAt(j+1))
				{
					count++;	
				}
				else
				{
					builder.append(count);
	        		builder.append(ans.charAt(j));
	        		ans1 = ans1+builder.toString();
	        		builder = new StringBuilder();
					count = 1;
				}
			}
			if(j == length-1)
			{
				builder.append(count);
        		builder.append(ans.charAt(j));
        		ans1 = ans1+builder.toString();
        		builder = new StringBuilder();
				count = 1;
			}
			ans = ans1;
			
			i++;
			
		}
		return ans1;
		/*int[] s = new int[20];
		int i=0;
		while(n!=0)
		{
			s[i] = n%10;
			i++;
			n = n/10;
		}
		int j = i-1;
		int k=1;
        for(j=i-1;j>=1;j--)
        {
        	if(s[j] == s[j-1]) k++;
        	else
        	{
        		builder.append(k);
        		builder.append(s[j]);
        		ans = ans+builder.toString();
        		builder = new StringBuilder();
        		k=1;
        	}
        }
        builder.append(k);
		builder.append(s[j]);
		ans = ans+builder.toString();
        return ans;*/
    }

}
