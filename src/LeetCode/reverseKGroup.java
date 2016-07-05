package LeetCode;

import java.util.Scanner;

import LeetCode.swapPairs.ListNode;

public class reverseKGroup {
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
		for(int i=1;i<8;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode ans = reverseKGroup(s,4);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
		
	}
	public static ListNode reverseKGroup(ListNode head, int k) {
		if(head==null ||head.next==null) return head;
		  ListNode[] ls = new  ListNode[k];
	      ListNode ans = new ListNode(-1);
	      ListNode temp = ans;
	      ListNode temp1 = head;
	      int num = 0;
	      while(head!=null )
	      {
	    	  ls[num] = head;
	    	  num++;
	    	  head = head.next;
	    	  if(num==k)
	    	  {
	    		  temp1 = head; //保存连着k个结点的起点处
	    		  while(num>0)
	    		  {
	    			  temp.next = ls[num-1];
	    			  ls[num-1].next = null; //这句一定要写，否则当K=2时会出现循环链表那样
	    			  temp = temp.next;
	    			  num--;
	    		  }
	    	  }
	      }
	      if(num!=0) 
	      {
	    	  temp.next = temp1;
	      }
	      return ans.next;
    }

}
