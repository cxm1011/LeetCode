package huawei;

import java.util.*;

import LeetCode.insertionSortList;
import LeetCode.intToRoman;

public class sortWords {

	public static class Node
	{
		String x;
		Node next;
		public Node(String s) {
			x = s;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			Node head = new Node(" ");
			head.next = null;
			for(int i=0;i<N;i++)
			{
				Node temp = new Node(in.next());
				temp.next = null;
				insert(head,temp);
				
			}
			Node ans = head.next;
			while(ans!=null)
			{
				System.out.println(ans.x);
				ans = ans.next;
			}
			
			
		}
	}
	public static void insert(Node head,Node temp)
	{
		Node head1 = head;
		Node last = head1;
		while(head1!=null && compare(head1.x, temp.x)<0)
		{
			last = head1;
			head1 = head1.next;
		}
		if(head1 == null)
		{
			last.next = temp;
		}
		else
		{
			last.next = temp;
			temp.next = head1;
		}
	}
	public static int compare(String a,String b) 
	{
		int lena = a.length();
		int lenb = b.length();
		char[] chara = a.toCharArray();
		char[] charb = b.toCharArray();
		int i = 0;
		int j = 0;
		while(i <lena ||j<lenb)
		{
			if(i==lena && j<lenb)
			{
				return -1;
			}
			if(i<lena && j==lenb)
			{
				return 1;
			}
			if(i<lena && j<lenb)
			{
				if(chara[i]<charb[j]) return -1;
				else if(chara[i]>charb[j]) return 1;
				else
				{
					i++;
					j++;
				}
			}
		}
		return 0;
	}
}
