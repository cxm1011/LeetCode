package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
	
	public static void main(String args[])
	{
		String s = "2109";
		System.out.println(letterCombinations(s));
	}
	public static List<String> letterCombinations(String digits) {
		int digLen = digits.length();
		List<String> results = new ArrayList<String>();
		if(digits==null || digLen==0) return results;
		String[] all = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		StringBuilder sb = new StringBuilder();
		results = search(0,digits,digLen,all,sb,results);
		return results;
	        
	}
	
	public static List<String> search(int i,String digits,
			int digLen,String[] all,StringBuilder sb,List<String> results)
	{
		if(i == digLen) 
		{
			i--;
			results.add(sb.toString());
			return results;
		}
		int j=0;
		String temp = all[(digits.charAt(i)-'0')];
		int numLen = temp.length();
		if(numLen == 0)
		{
			results = search(i+1,digits,digLen,all,sb,results);
			return results;
		}
		for(j=0;j<numLen;j++)
		{
			sb = sb.append(temp.charAt(j));
			results = search(i+1,digits,digLen,all,sb,results);
			sb.deleteCharAt(sb.length() - 1);
		}
		return results;
	}
	

}
