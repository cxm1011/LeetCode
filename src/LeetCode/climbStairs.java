package LeetCode;

public class climbStairs {
	public static void main(String args[])
	{
		int n = 44;
		System.out.print(climbStairs(n));
		
	}
	/*public static int climbStairs(int n) { //timeout when n = 44
		if(n<1) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n > 2)  return climbStairs(n-1)+climbStairs(n-2);
        return 0;
    }*/
	public static int climbStairs(int n)
	{
		if (n <= 1) 
		{
			return 1;
		}
	    int last = 1, lastlast = 1;
	    int now = 0;
	    for (int i = 2; i <= n; i++) {
	        now = last + lastlast;
	        lastlast = last;
	        last = now;
	    }
	    return now;
	}
}
