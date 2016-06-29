package LeetCode;

public class isPalindrome {
	public static void main(String args[])
	{
		int x = -23;
		System.out.println(isPalindrome(x));
	}
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		if(x/10 == 0) return true;
        int[] a = new int[12];
        int i = 0;
        int middle=0;
        int flag = 1;
        while(x != 0)
        {
        	a[i] = x%10;
        	i++;
        	x=x/10;
        }
        int length = i-1;
        middle = length/2;
        for(int j = 0;j<=middle;j++)
        {
        	if(a[j] != a[length-j])
        	{
        		flag = 0;
        		break;
        	}
        }
        if(flag == 1) return true;
        else return false;
    }

}
