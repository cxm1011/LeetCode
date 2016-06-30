package LeetCode;

public class romanToInt {
	public static void main(String args[])
	{
		String s = "MCDLXXVI";
		System.out.println(romanToInt(s));
				
	}
	public static int romanToInt(String s) {
		int ans = 0 ;
		if(s==null||s.length()==0) return 0;
		int[] nums = {1000, 500, 100, 50, 10, 5, 1};
		char[] ref = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int i;
		int j=0;
		int length = s.length();
		int[] s1 = new int[length];
		for(i = 0;i<length;i++)
		{
			j = 0;
			while(j<7)
			{
				if(s.charAt(i)!=ref[j]) j++;
				else break;	
			}
			s1[i] = j;
		}
		for(i = s.length()-1;i>0;i--)
		{
			
			if(s1[i]>=s1[i-1]) 
			{
				ans =ans+nums[s1[i]];
			}
			else
			{
				ans =ans+nums[s1[i]]-nums[s1[i-1]];
				i--;
			}
		}
		if(i == 0) ans =ans+nums[s1[i]];
		return ans;
        
    }
}
