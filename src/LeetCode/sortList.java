package LeetCode;

import java.util.*;



public class sortList {
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
		for(int i=1;i<3;i++)
		{
			ListNode s1 = new ListNode(in.nextInt());
			s1.next= null;
			temp.next = s1;
			temp =s1;
		}
		
		ListNode ans = sortList(s);
		while(ans!=null)
		{
			System.out.print(ans.val+" ");
			ans = ans.next;
		}
		System.out.println();
	}
	public static ListNode sortList(ListNode head) {
		if(head == null ||head.next == null) return head;
		List<Integer> temp = new ArrayList<Integer>();
		ListNode head1 = head;
		int len = 0;
		while(head1!=null)
		{
			temp.add(head1.val);
			len++;
			head1 = head1.next;
		}
		int[] temp1 = new int[len];
		for(int i=0;i<len;i++)
		{
			temp1[i] = temp.get(i);
		}
		Arrays.sort(temp1);
		ListNode ans = new ListNode(temp1[0]);
		ans.next = null;
		ListNode temp2=ans;
		for(int i=1;i<len;i++)
		{
			ListNode s1 = new ListNode(temp1[i]);
			s1.next= null;
			temp2.next = s1;
			temp2 =s1;
		}
		return ans;
    }
}
