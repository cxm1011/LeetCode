package LeetCode;
import java.util.*;


public class largestNumber {
	public static void main(String args[])
	{
		int[] num = {0,0,0};
		System.out.print(largestNumber(num));
	}
	static class Node
	{
		int num;
		Node next;
		public Node(int x)
		{
			num = x;
		}
	}
	public static String largestNumber(int[] nums) {
        int len = nums.length;
        if(len == 0) return null;
        Node head = new Node(-1);
        head.next = null;
        for(int i = 0;i<len;i++)
        {
        	head = sharp(head, nums[i]);
        }
        Node head1 = head.next;
        StringBuilder ans = new StringBuilder();
        while(head1!=null)
        {
        	ans.append(String.valueOf(head1.num));
        	head1 = head1.next;
        }
        String temp = ans.toString();
        if(temp.charAt(0) == '0') temp = "0";
        return temp;
    }
	public static Node sharp(Node head,int num)
	{
		Node head1 = head;
		if(head.next == null)
		{
			Node temp = new Node(num);
			temp.next = null;
			head.next = temp;
		}
		else
		{
			Node temp1 = head.next;
			Node temp2 = head;
			while(temp1!=null && !compare(temp1, num))
			{
				temp2 = temp1;
				temp1 = temp1.next;
			}
			Node temp3 = new Node(num);
			temp3.next = null;
			if(temp1 == null)
			{
				temp2.next = temp3;
			}
			else {
				temp2.next = temp3;
				temp3.next = temp1;
			}
			
		}	
		return head1;
	}
	public static int[] every(int num)
	{
		List<Integer> ans = new ArrayList<Integer>();
		if(num == 0) ans.add(0);
		while(num!=0)
		{
			ans.add(num%10);
			num = num/10;
		}
		int len = ans.size();
		int[] all =new int[len];
		int k=0;
		for(int i=len-1;i>=0;i--)
		{
			all[k++] = ans.get(i);
		}
		return all;
	}
	public static boolean compare(Node temp,int num)
	{
		int[] adds = every(num);
		int[] temps = every(temp.num);
		int lenNum = adds.length;
		int lenTemp = temps.length;
		int lenAll = lenNum+lenTemp;
		int[] temp1 = new int[lenAll];
		for(int i=0;i<lenNum;i++)
		{
			temp1[i] = adds[i];
		}
		for(int i=0;i<lenTemp;i++)
		{
			temp1[i+lenNum] = temps[i];
		}
		
		int[] temp2 = new int[lenAll];
		for(int i=0;i<lenTemp;i++)
		{
			temp2[i] = temps[i];
		}
		for(int i=0;i<lenNum;i++)
		{
			temp2[i+lenTemp] = adds[i];
		}
		for(int i=0;i<lenAll;i++)
		{
			if(temp1[i] == temp2[i]) continue;
			if(temp1[i] >temp2[i]) return true;
			if(temp1[i] <temp2[i]) return false;
		}
		return true;
		
	}

}
