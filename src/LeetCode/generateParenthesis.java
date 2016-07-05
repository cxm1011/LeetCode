package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
	public static void main(String args[])
	{
		List<String> ans1 = new ArrayList<String>();
		ans1 = generateParenthesis(3);
		System.out.println(ans1);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<String>();
		if(n < 1) return ans;
		String temp="";
		ans = gengerate(ans,temp,n,n);
		return ans;
    }
	public static List<String> gengerate(List<String> results,String temp,int left,int right)
	{
		if(left ==0 &&right==0)
		{
			results.add(temp);
			return results;
		}
		if(left > 0) results = gengerate(results,temp+"(",left-1,right);
		if(right > 0 && left < right) results = gengerate(results,temp+")",left,right-1);
		return results;
	}
}
