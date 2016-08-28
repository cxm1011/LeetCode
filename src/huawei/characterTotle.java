package huawei;

import java.util.*;

public class characterTotle {
	public static class Node
	{
		char s;
		int num;
		Node next;
		Node(int x)
		{
			num = x;
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			int len = s.length();
			Arrays.sort(chars);
			if(len == 1)
			{
				if(condition(chars[0]))
					System.out.print(chars[0]);
			}
			Node head = new Node(-1);
			head.next = null;
			for(int i=0;i<len;i++)
			{
				if(condition(chars[i]))
				{
					int sum = 1;
					while(i<len-1&&chars[i+1]==chars[i])
					{
						sum++;
						i++;
					}
					Node temp = new Node(sum);
					temp.s = chars[i];
					head = sort(head,temp);
				}
			}
			
			while(head.next.next!=null)
			{
				System.out.print(head.next.s);
				head = head.next;
			}
			System.out.println(head.next.s);
		}
	}
	public static boolean condition(char temp)
	{
		if((temp>='0'&&temp<='9')||(temp>='a'&&temp<='z')||(temp>='A'&&temp<='Z')||temp==' ')
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static Node sort(Node head,Node temp)
	{
		Node head1 = head.next;
		Node head2 = head;
		if(head.next == null)
		{
			head.next = temp;
		}
		else 
		{
			while(head1!=null &&head1.num >=temp.num)
			{
				head2 = head1;
				head1 = head1.next;
			}
			if(head1 == null)
			{
				head2.next = temp;
			}
			else
			{
				head2.next = temp;
				temp.next = head1;
			}
		}
		return head;
	}

}
