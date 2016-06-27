package LeetCode;
import java.util.*;
public class addTwoNumbers 
{
	public static class ListNode 
	{
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
    }
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("请输入结点个数和其中的数字：");
		int n = in.nextInt();
		int temp =  in.nextInt();
		ListNode A = new ListNode(temp);
		A.next = null;
		ListNode first = A;
		for(int i=1;i<n;i++)
		{
			int temp1 =  in.nextInt();
			ListNode B = new ListNode(temp1);
			B.next = null;
			A.next = B;
			A = B;
		}
		
		
		
		System.out.println("请输入另一结点中的结点个数和数字：");
		int m = in.nextInt();
		temp =  in.nextInt();
		ListNode C = new ListNode(temp);
		C.next = null;
		ListNode second = C;
		for(int i=1;i<m;i++)
		{
			int temp2 =  in.nextInt();
			ListNode D = new ListNode(temp2);
			D.next = null;
			C.next = D;
			C = D;
		}
		
		/*System.out.println("结点1中的数字为：");
		while(first!=null)
		{
			System.out.println(first.val+" ");
			first = first.next;
		}	
		System.out.println("");
		System.out.println("结点2中的数字为：");
		while(second!=null)
		{
			System.out.println(second.val+" ");
			second = second.next;
		}	
		System.out.println("");*/
		ListNode ans = addTwoNumbers(first,second);
		System.out.println("结果为：");
		while(ans!=null)
		{
			System.out.println(ans.val+" ");
			ans = ans.next;
		}	
		System.out.println("");
	
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		long sum1=0,sum2=0,sum=0;
		long index = 1;
		while(l1!=null||l2!=null)
		{
			if(l1==null) sum1 = 0;
			else 
			{
				sum1 = l1.val*index;
				l1 = l1.next;
			}
			
			if(l2==null) sum2 = 0;
			else 
			{
				sum2 = l2.val*index;
				l2 = l2.next;
			}
			index = index*10;
			sum = sum1+sum2+sum;
		}
		System.out.println("INDEX=" + index);
		System.out.println("sum=" + sum);
		ListNode A=null;
		int a = (int) (sum/index);
		if(a == 0) index = index/10;
		while(index!=0)
		{
			a = (int) (sum/index);
			sum = sum-a*index;
			ListNode B = new ListNode(a);
			B.next = A;
			A = B;
			index = index/10;
		}
		
		return A;
	}
}
