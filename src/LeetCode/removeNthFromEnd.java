package LeetCode;

import java.util.Scanner;



public class removeNthFromEnd {

	public static class ListNode 
	{
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
    }
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		ListNode s = new ListNode(in.nextInt());
		s.next = null;
		ListNode temp=s;
		for(int i=1;i<4;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		ListNode ans = removeNthFromEnd(s,1);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
		
	}
	public static ListNode removeNthFromEnd(ListNode head, int n)
	{
		
		ListNode ans = head;
		ListNode temp= head;
		ListNode temp1= head;
		int length =0 ;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		if(n <= 0||n>length) return ans;
		//if(n==1 && length==1) return null;
		if(n == length) return head.next;
		int index = length-n;
		for(int i=1;i<index;i++) temp1=temp1.next;
		temp1.next = temp1.next.next;
		return ans;
		
	}
}
