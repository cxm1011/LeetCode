package LeetCode;

public class uniquePaths {
	public static void main(String[] args) 
	{
		int m = 36;
		int n = 7;
		System.out.print(uniquePaths(m,n));
	}
	public static int uniquePaths(int m, int n) {
        if(m<=0 || n<=0) return 0;
        if(m ==1 || n==1) return 1;
        int all= m+n-2;
        int p = m-1;
        int q = n-1;
        if(q<p) p = q;
        long up = 1;
        long down =1;
        int i = 0;
        int j = 0;
        while(i<p){
        	up*=all;
        	all--;
        	i++;
        }
        while(p>0)
        {
        	down*=p;
        	p--;
        }
        return (int) (up/down);
    }
}
