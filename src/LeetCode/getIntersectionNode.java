package LeetCode;

import java.util.Scanner;

import LeetCode.deleteDuplicates.ListNode;

public class getIntersectionNode {
	public static class ListNode 
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val = x;
			next = null;
		}
   }
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		ListNode s = new ListNode(in.nextInt());
		s.next = null;
		ListNode temp=s;
		for(int i=1;i<2;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode s2 = new ListNode(in.nextInt());
		s2.next = null;
		ListNode temp1=s2;
		for(int i=1;i<1;i++)
		{
			ListNode s3 = new ListNode(in.nextInt());
			s3.next= null;
			temp1.next = s3;
			temp1 =s3;
		}
		
		ListNode ans = getIntersectionNode(s,s2);
		if(ans == null) System.out.print(0);
		else System.out.print(ans.val);
	}
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) 
	{
	     if(headA == null || headB == null) return null;
	     int lenA = 0;
	     ListNode headA1 = headA;
	     while(headA1 !=null)
	     {
	    	 lenA++;
	    	 headA1 = headA1.next;
	     }
	     ListNode headB1 = headB;
	     int lenB = 0;
	     while(headB1 !=null)
	     {
	    	 lenB++;
	    	 headB1 = headB1.next;
	     }
	     ListNode start = null;
	     int delta = lenB-lenA;
	     if(delta>0)
	     {
	    	 start = headB;
	    	 while(delta>0)
	    	 {
	    		 start = start.next;
	    		 delta--;
	    	 }
	    	 while(headA!=null && headA != start)
	    	 {
	    		 start = start.next;
	    		 headA = headA.next;
	    	 }
	    	 return headA;
	     }
	     else
	     {
	    	 start = headA;
	    	 delta = Math.abs(delta);
	    	 while(delta>0)
	    	 {
	    		 start = start.next;
	    		 delta--;
	    	 }
	    	 while(headB!=null && headB.val != start.val)
	    	 {
	    		 start = start.next;
	    		 headB = headB.next;
	    	 }
	    	 return headB;
	     }
	     
	     
	}

}
