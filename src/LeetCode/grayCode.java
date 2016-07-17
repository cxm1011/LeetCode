package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class grayCode {
	public static void main(String args[])
	{
		int n = 3;
		//double length = Math.pow(2, 3);
		//System.out.print(length);
		System.out.print(grayCode(n));
	}
	public static List<Integer> grayCode(int n) {
	   List<Integer> ans = new ArrayList<Integer>();
	   if(n<=0) return ans;
       int length = (int)Math.pow(2, n); 
       
       for(int i = 0;i<length;i++)
       {
    	   int temp = (i>>1)^i;
    	   ans.add(temp);
       }
       return ans;
    }
}
