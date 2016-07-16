package LeetCode;

import java.util.*;



public class deleteDuplicates {
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
		for(int i=1;i<8;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode ans = deleteDuplicates(s);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
	}
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next == null) return head;
		int out = 0;
		if(head.val == head.next.val) out = 1;
		ListNode ans = new ListNode(head.val);
		ListNode ans1 = ans;
		ListNode temp = head.next;
		int flag =1;
		while(temp != null)
		{
			if(temp.val == head.val)
			{
				head = temp;
				flag = 1;
			}
			else
			{
				flag++;
				if(flag > 2)
				{
					ans = add(ans,head.val);
				}
				head = temp;
			}
			temp = temp.next;
		}
		if(temp==null && flag>=2) ans = add(ans,head.val);
		if(out == 1) return ans1.next;
		return ans1;
    }
	public static ListNode add(ListNode ans,int val)
	{
		ListNode temp1 = new ListNode(val);
		temp1.next = null;
		ans.next = temp1;
		ans = temp1;
		return ans;
	}

}
