package huawei;

import java.util.*;

import LeetCode.intToRoman;
import LeetCode.strStr;

public class lastOfKchar {

	public static class Node
	{
		int val;
		Node next;
		Node(int x) {
			val = x;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int[] all = new int[N];
			for(int i=0;i<N;i++)
			{
				all[i] = in.nextInt();
			}
			int k = in.nextInt();
			if(k<0||k>N-1) System.out.println(0);
			Node head = new Node(all[0]);
			head.next = null;
			Node head1 = head;
			for(int i = 1;i<N;i++)
			{
				Node temp = new Node(all[i]);
				temp.next = null;
				head1.next = temp;
				head1 = temp;
			}
			int m = N-k;
			for(int i=1;i<m;i++)
			{
				head = head.next;
			}
			System.out.println(head.val);
		}
	}
}
