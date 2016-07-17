package LeetCode;

import java.util.Scanner;

import LeetCode.partition.ListNode;

public class reverseBetween {
	public static class ListNode {
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
		for(int i=1;i<5;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode ans = reverseBetween(s,2,4);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
	}
	public static ListNode reverseBetween(ListNode head, int m, int n) {
        int i = 1;
        ListNode head1 = head;
        int flag = 0;
     
        while(i < m-1)
        {
        	head1 = head1.next;
        	i++;
        }
        ListNode p = head1;
        ListNode p1 = head1;
        if(m == 1)
        {
        	flag = 1;
        }
        else
        	p1 = p.next;
    
        ListNode q1 = new ListNode(p1.val);
        q1.next = null;
        ListNode q2 = q1;
        for(int j = m;j<n;j++)
        {
        	p1 = p1.next;
        	if(p1 == null) continue;
        	q1 = tailInsert(q1,p1.val);
        }
        if(p1 == null)
    	{
        	if(flag == 1)
        	{
        		return q1;
        	}
        	else
        	{
        		p.next = q1;
        		q2.next = null;
        	}
    	}
        else
        {
        	if(flag == 1)
        	{
        		q2.next = p1.next;
        		return q1;
        	}
        	else
        	{	
        		p.next = q1;
	        	q2.next = p1.next;
        	}
        }
        return head;
    }
	public static ListNode tailInsert(ListNode temp,int val)
	{
		ListNode temp1 = new ListNode(val);
		temp1.next = temp;
		temp = temp1;
		return temp;
	}
}
