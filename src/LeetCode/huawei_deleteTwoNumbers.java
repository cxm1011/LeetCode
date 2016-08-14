package LeetCode;

import java.util.*;

public class huawei_deleteTwoNumbers {

	public static class Node
	{
		int val;
		Node next;
		Node (int x)
		{
			val = x;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			if(N <=0 ) return;
			Node head = new Node(0);
			head.next = null;
			Node head1 = head;
			for(int i=1;i<N;i++)
			{
				Node temp = new Node(i);
				temp.next = head1;
				head.next = temp;
				head = temp;
			}
			Node p = head1.next;
			while(p!=head1)
			{
				
				p.next = p.next.next;
				head1 = p.next;
				p = head1.next;
			}
			System.out.println(p.val);
		}
	}
}
