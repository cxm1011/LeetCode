package LeetCode;

import java.util.*;


import LeetCode.removeNthFromEnd.ListNode;

public class reorderList {
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
		reorderList(s);
		while(s!=null)
		{
			System.out.print(s.val+" ");
			s = s.next;
		}
		System.out.println();
		
	}
	public static void reorderList(ListNode head) {
        if(head==null) return;
        if(head.next == null || head.next.next == null) return;
        ListNode head1 = head;     
        Stack<ListNode> stack = new Stack<ListNode>();        
        int len = 0;
        while(head1!=null)
        {
        	stack.push(head1);
        	len++;
        	head1 = head1.next;
        }
        int mid = len/2;
        ListNode temp = head;
        for(int i = 0;i<mid;i++)
        {
        	ListNode temp1 = stack.peek();
        	stack.pop();
        	if(temp.next != temp1)
        	{
        		temp1.next = temp.next;
        		temp.next = temp1;
        		temp = temp1.next;
        	}
        	else
        		break;
        }
        if(len%2 == 0) temp.next.next = null;
        else temp.next = null;
        
        
    }
}
