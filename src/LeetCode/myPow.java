package LeetCode;

public class myPow {
	public static void main(String args[])
	{
		double x = -2;
		int n =7;
		System.out.print(myPow(x,n));
	}
	public static double myPow(double x, int n) {
		if(n == 0) {
            return 1;
        }
		
		if(n == 1) {
			return x;
		}
        
		long nBuf = n;
        int flag = nBuf>0?1:-1;
        nBuf = nBuf>0?nBuf:-nBuf;
        long k = nBuf/2;
        long l = nBuf - k*2;
        double t1 = myPow(x, (int)k);
        double t2 = myPow(x, (int)l);
        return flag == 1?t1*t1*t2:1/(t1*t1*t2);
	}
}
