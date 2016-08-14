package LeetCode;

import java.util.*;


public class huawei201602 {

	public static class Node
	{
		String s;
		int num;
		Node next;
		Node(String x) { s = x; }
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Node head= new Node("head");
		head.num = 0;
		head.next = null;
		Node headtemp = head;
		int j = 0;
		while(in.hasNext() )
		{
			String path = in.nextLine();
			String[] all = path.split("\\\\");
			while(all.length <= 1)
			{
				path = in.nextLine();
				all = path.split("\\\\");
			}
	
			String error = all[all.length-1];
			
			Node temp = new Node(error);
			temp.num = 1;
			temp.next = null;
			head = headtemp;
			head = build(head,temp);

		}
		int i = 1;
		while(head.next!=null && i<=8)
		{
			if(head.next!=null)
			{
				String[] file = head.next.s.split(" ");
				if(file.length < 2)
				{
					head  = head.next;
					continue;
				}
				if(file[0].length() <= 16)
				{
					System.out.println(file[0]+" "+file[1]+" "+head.next.num);
				}
				else
				{
					System.out.println(file[0].substring(file[0].length()-16,file[0].length())+" "+file[1]+head.next.num);
				}
			}
			head  = head.next;
			i++;
		}
		
	}
	public static Node build(Node head,Node temp)
	{
		Node head1 = head;
		if(head.next==null)
		{
			head.next = temp;
		}
		else
		{
			while(head.next!=null && !head.next.s.equals(temp.s))
			{
				head = head.next;
			}
			if(head.next == null)
			{
				head.next = temp;
				
			}
			else
			{
				head.next.num = head.next.num+1;
				head1 = restart(head1,head);
			}
		}
		return head1;
	}
	public static Node restart(Node head,Node temp)
	{
		if(temp == head) return head;
		Node head1 = head;
		
		Node temp1 = temp.next;
		if(temp.next == null)
		{
			return head1;
		}
		temp.next = temp.next.next;
		while(temp.num <= head.next.num)
		{
			head = head.next;
		}
		temp1.next = head.next;
		head.next = temp1;
		return head1;	
	}
}
