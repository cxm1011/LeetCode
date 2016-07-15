package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class combine {
	public static void main(String args[])
	{
		int n = 1;
		int k = 1;
		System.out.print(combine(n,k));
	}
	 public static List<List<Integer>> combine(int n, int k) {
	     List<List<Integer>> ans = new ArrayList<List<Integer>>();
	     List<Integer> temp = new ArrayList<Integer>();
	     if(k > n) return ans;
	     int i = 1;
	     if(k==n)
	     {
	    	 while(i<=n) 
	    		 {
	    		 
	    		 temp.add(i);
	    		 i++;
	    		 }
	    	 ans.add(temp);
	    	 return ans;	 
	     }
	     find(ans,temp,n,k,1);
	     return ans;
	     
	 }
	 public static void find(List<List<Integer>> ans,List<Integer> temp,int n,int k,int start)
	 {
		 if(temp.size() == k)
		 {
			 ans.add(new ArrayList<Integer>(temp));
			 return;
		 }
		 for(int i = start;i<=n ;i++)
		 {
			 temp.add(i);
			 find(ans,temp,n,k,i+1);
			 temp.remove(temp.size()-1);
		 }
		 return;
	 }

}
