package LeetCode;

import java.util.Scanner;

import LeetCode.addTwoNumbers.ListNode;

public class mergeTwoLists {
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
		for(int i=1;i<3;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}

	
		System.out.println("第二个结点：");
		ListNode s2 = new ListNode(in.nextInt());
		s2.next = null;
		ListNode temp1=s2;
		for(int i=1;i<5;i++)
		{
			ListNode s3 = new ListNode(in.nextInt());
			s3.next= null;
			temp1.next = s3;
			temp1 =s3;
		}
		
		ListNode ans = mergeTwoLists(s,s2);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	{
		ListNode ans = new ListNode(0); //头结点为0
		ListNode temp = ans;
		while(l1!=null && l2!=null)
		{
			if(l1.val <=l2.val)
			{
				temp.next = l1;
				l1 = l1.next;
			}
			else
			{
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if(l1 == null)
		{
			temp.next = l2;
		}
		if(l2 == null)
		{
			temp.next = l1;
		}
		return ans.next;
    }
}
