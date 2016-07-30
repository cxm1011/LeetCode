package LeetCode;

public class isPalindrome2 {
	public static void main(String args[])
	{
		String s = "0P";
		
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
        int length = s.length();
        if(length == 0 || s == null) return true;
        boolean ans = true;
        int left = 0;
        int right = length-1;
        char[] chars = s.toCharArray();
        while(left < right)
        {
        	while(left<right &&(chars[left] < 'a' || chars[left] > 'z')&&
        				 (chars[left]<'0'||chars[left]>'9')) 
        	{
        		left++;
        	}
        	while(left < right&&(chars[right] < 'a' || chars[right] > 'z')&&
   				 (chars[right]<'0'||chars[right]>'9')) 
        	{
        		right--;
        	}
        	if(chars[left] != chars[right]) return false; 
        	left++;
        	right--;
        }
		return ans;
    }
}
