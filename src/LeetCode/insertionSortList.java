package LeetCode;

import java.util.*;

import LeetCode.reorderList.ListNode;

	public class insertionSortList {
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
		ListNode ans = insertionSortList(s);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
		
	}
	public static ListNode insertionSortList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode ans = new ListNode(-1);
        ListNode first = new ListNode(head.val);
        first.next = null;
        ans.next = first;
  
        ListNode temp1 = head.next;
        while(temp1 != null)
        {
        	ListNode temp = ans.next;
        	ListNode last = temp;
	        while(temp!=null && temp1.val > temp.val)
	        {
	        	last = temp;
	        	temp = temp.next;	
	        }
	        ListNode temp2 = new ListNode(temp1.val);
	        temp2.next = null;
	        if(temp == null)
	        {
	        	last.next = temp2;
	        }
	        else if(temp == ans.next)
	        {
	        	ans.next = temp2;
	        	temp2.next = temp;
	        }
	        else
	        {
	        	last.next = temp2;
	        	temp2.next = temp;
	        }
	        temp1 = temp1.next;
	        
        }
        return ans.next;
    }	
}
