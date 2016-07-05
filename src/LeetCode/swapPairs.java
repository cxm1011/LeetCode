package LeetCode;

import java.util.Scanner;

import LeetCode.mergeKLists.ListNode;

public class swapPairs {
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
		for(int i=1;i<4;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode ans = swapPairs(s);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
		
	}
	 public static ListNode swapPairs(ListNode head) 
	 {
	      if(head==null ||head.next==null) return head;
	      ListNode ans = new ListNode(-1);
	      ListNode temp = ans;
	      while(head!=null && head.next!=null)
	      {
	    	  ListNode temp1 = head.next.next;  //一定要先保存下来
	    	  temp.next = head.next;
	    	  head.next = null;  //进行截断
	    	  temp.next.next = head;
	    	  temp = temp.next.next;
	    	  head = temp1;
	      }
	      if(head == null) return ans.next;
	      if(head.next == null) temp.next = head;
	      return ans.next;
	      
	 }

}
