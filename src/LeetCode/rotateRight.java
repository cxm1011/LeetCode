package LeetCode;

import java.util.Scanner;

public class rotateRight {
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
		
		ListNode ans = rotateRight(s,6);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
	}
	 public static ListNode rotateRight(ListNode head, int k) {
		    if(k <= 0) return head;
		    if(head == null) return null;
	        ListNode headtemp = head;
	        ListNode headtemp1 = head;
	        ListNode lasttemp2 = head;
	        ListNode ans = head;
	        int length = 0;
	        
	        while(headtemp!=null)
	        {
	            length++;
	            lasttemp2 = headtemp;
	            headtemp = headtemp.next;
	        }
	        if(k >= length)
	        {
	            k = k%length;
	        }
	        if(k == 0) return head;
	        int index = length-k;
	        int i = 0;
	        while(i<index-1)
	        {
	            i++;
	            headtemp1 = headtemp1.next;
	        }
	        ans = headtemp1.next;
	        headtemp1.next = null;
	        lasttemp2.next = head;
	        return ans; 
	 }

}
