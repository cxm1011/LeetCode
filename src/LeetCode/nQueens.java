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
		 if(i==n) return 1; //֮ǰn�ж����������ˣ�������һ����������㡣�ݹ��ȥ
		 for(int j = 0;j<n;j++)//���б������ҵ�����������
		 {
			 if(solution(i,j,record)) //����������ʱ��������1����ʱ��j���ı䡣���ݹ鷵��ʱ�ı�
			 {
				 record[i] = j;
				 ans=ans+process(i+1,record,n); //�еĻ���1������ݹ����
			 }
		 }
		 return ans; //����������֮��û�ҵ����������ģ��򷵻�0.
	 }
	 public static boolean solution(int i,int j,int[] record)
	 {
		 boolean flag = true;
		 for(int k=0;k<i;k++) //���б�������ǰ(i,j)��֮ǰ��i-1��������жԱ�
		 {
			 if(j!=record[k] && Math.abs(k-i)!=Math.abs((record[k]-j)))
				 continue;
			 else
				 return false;
		 }
		 return flag;
	 }
}
