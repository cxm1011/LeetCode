package LeetCode;

public class numDecodings {
	public static void main(String args[])
	{
		System.out.print(numDecodings("10"));
	}
	public static int numDecodings(String s) {
        int length = s.length();
        if(s==null || length ==0) return 0;
        if(length == 1)
        {
        	if(s.charAt(0)>'0' && s.charAt(0)<='9')
        		return 1;
        	else
        		return 0;
        }
        int[] nums = new int[length+1];
        nums[0] = 1;
        if(s.charAt(0)>'0' && s.charAt(0)<='9') nums[1] = 1;
        else nums[1] = 0;
        for(int i = 2;i<=length;i++)
        {
        	if(s.charAt(i-1)>'0' && s.charAt(i-1)<='9') nums[i] = nums[i-1];
        	int index = (s.charAt(i-2)-'0')*10+s.charAt(i-1)-'0';
        	if(index>=10 && index <=26) nums[i] = nums[i-2]+nums[i];
        	
        }
        return nums[length];
    }
}
