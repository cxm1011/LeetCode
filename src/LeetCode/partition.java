package LeetCode;

import java.util.Scanner;

import LeetCode.deleteDuplicates.ListNode;

public class partition {
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
		for(int i=1;i<4;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode ans = partition(s,8);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
	}
	public static ListNode partition(ListNode head, int x) {
		if(head==null) return head;
		ListNode smaller = new ListNode(head.val);
		ListNode bigger = new ListNode(head.val);
		smaller.next = null;
		bigger.next = null;
        ListNode smaller1 = smaller;
        ListNode bigger1 = bigger;
        while(head!=null)
        {
        	if(head.val < x)
        	{
        		smaller = add(smaller,head.val);
        	}
        	else
        	{
        		bigger = add(bigger,head.val);
        	}
        	head = head.next;
        }
        smaller.next = bigger1.next;
        return smaller1.next;
    }
	public static ListNode add(ListNode ans,int val)
	{
		ListNode temp = new ListNode(val);
		temp.next = null;
		ans.next = temp;
		ans = temp;
		return ans;
	}
}
