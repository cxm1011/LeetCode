package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class getRow {
	public static void main(String args[])
	{
		System.out.println(generate(1));
	}
	public static List<Integer> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> temp  = new ArrayList<Integer>();
		if(numRows < 0) return temp;
		temp.add(1);
		ans.add(temp);
		for(int i = 1;i <= numRows; i++)
		{
			List<Integer> temp1  = new ArrayList<Integer>();
			temp1.add(1);
			List<Integer> temp2 = ans.get(i-1);
			for(int j = 1;j<=i-1;j++)
			{
				temp1.add(temp2.get(j-1)+temp2.get(j));
			}
			temp1.add(1);
			ans.add(temp1);
		}
		return ans.get(ans.size()-1);
    }
}
