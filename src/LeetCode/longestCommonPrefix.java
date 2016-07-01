package LeetCode;

public class longestCommonPrefix {
	
	public static void main(String args[])
	{
		String[] s = {"aca","cba"};
		System.out.println(longestCommonPrefix(s));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String ans="";
		int length = strs.length;
		if(length==0) return ans;
		int[] lens = new int[length];
		int i = 0;
		int min = strs[0].length();
		for(i=1;i<length;i++)
		{
			lens[i] = strs[i].length();
			if(lens[i] < min) min = lens[i];
		}
		int j=0;
		for(j=0;j<min;j++)
		{
			for(i=0;i<length-1;i++)
			{
				if(strs[i].charAt(j) == strs[i+1].charAt(j)) continue;
				else break;
			}
			if(i==length-1) ans=ans+strs[i].charAt(j);
			else break;
		}
		return ans;
        
    }

}
