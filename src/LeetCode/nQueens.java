package LeetCode;

public class nQueens {
	public static void main(String args[])
	{
		int n=8;
		System.out.println(nQueens(n));
	}
	 public static int nQueens(int n) 
	 {
		 if(n<1) return 0;
		 int[] record = new int[n];
		 return process(0,record,n);
	 }
	 public static int process(int i,int[] record,int n)
	 {
		 int ans =0;
		 if(i==n) return 1; //之前n行都满足条件了，所以有一种情况可满足。递归回去
		 for(int j = 0;j<n;j++)//对列遍历，找到满足条件的
		 {
			 if(solution(i,j,record)) //当满足条件时，行数加1。此时的j不改变。当递归返回时改变
			 {
				 record[i] = j;
				 ans=ans+process(i+1,record,n); //有的话加1，否则递归回来
			 }
		 }
		 return ans; //遍历所有列之后还没找到满足条件的，则返回0.
	 }
	 public static boolean solution(int i,int j,int[] record)
	 {
		 boolean flag = true;
		 for(int k=0;k<i;k++) //对行遍历，当前(i,j)与之前的i-1个坐标进行对比
		 {
			 if(j!=record[k] && Math.abs(k-i)!=Math.abs((record[k]-j)))
				 continue;
			 else
				 return false;
		 }
		 return flag;
	 }
}
