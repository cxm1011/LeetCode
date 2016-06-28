package LeetCode;

public class reverse {
	
	public static void main(String args[])
	{
		int x;
		x = 2147483647;
		//x = 123;
	    System.out.println(reverse(x));
	}
	public static int reverse(int x) 
	{
		int reversed_n = 0;
        
        while (x != 0) {
            int temp = reversed_n * 10 + x % 10;
            x = x / 10;
            if (temp / 10 != reversed_n) //³¬³ö·¶Î§µÄÅĞ¶Ï
            {
                reversed_n = 0;
                break;
            }
            reversed_n = temp;
        }
        return reversed_n;
        
    }

}
