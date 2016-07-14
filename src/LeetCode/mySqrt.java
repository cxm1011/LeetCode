package LeetCode;

public class mySqrt {
	public static void main(String args[])
	{
		int n = 10;
		System.out.println(mySqrt(2147395599));
	}
	public static int mySqrt(int x) {
        if(x<=0) return 0;
        int i = 1;
        
        long left = 1;
        long right = x;
        long mid = (left+right)/2;
        while(right*right > x)
        {
        	if(mid*mid>x) right=mid;
        	else
        	{
        		left = mid;
        	}
        	if(mid*mid<=x &&(mid+1)*(mid+1)>x) break;
        	mid = (left+right)/2;
        }
        return (int)mid;
    }
}
