package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class totalNQueens {
	public static void main(String args[])
	{
		int n = 8;
		int ans = totalNQueens(n);
		System.out.print(ans);
	}
	public static int totalNQueens(int n) {
		int ans =0;
		List<List<Integer>> loc = new ArrayList<List<Integer>>();
		if(n<=0||n==2||n==3) return 0;
		if(n==1)
		{
			return 1;
		}
		ans = find(0,n,ans,loc);
		return ans;
    }
	public static int find(int i,int n,int ans,List<List<Integer>> loc)
	{
		if(i == n)
		{
			ans++;
			if(loc.size()>0)
			   loc.remove(loc.size()-1);
			return ans;
		}
		int j = 0;
		List<Integer> temploc = new ArrayList<Integer>();
		for(j=0;j<n;j++)
		{
			temploc.add(i);
			temploc.add(j);
			if(insert(loc,temploc))
			{
				loc.add(temploc);
				ans = find(i+1,n,ans,loc);
			}
			temploc = new ArrayList<Integer>();	 //这条语句一定要执行，否则会在temploc后加。这样位置坐标就不止两个了
									//不能只在判断位置不符合的情况下执行，因为如果当前位置满足后，在递归后回来则这条语句就不会执行
									//这样就出错。因为位置坐标不止两个
		}
		if(loc.size()>0)
		   loc.remove(loc.size()-1);
		return ans;
	}
	public static boolean insert(List<List<Integer>> loc,List<Integer> temploc)
	{
		int lenall = loc.size();
		int lentemp = temploc.size();
		if(lenall == 0) return true;
		int i = 0;
		int tempx = temploc.get(0);
		int tempy = temploc.get(1);
		for(i =0;i<lenall;i++)
		{
			int lastx = loc.get(i).get(0);
			int lasty = loc.get(i).get(1);
			if(tempx == lastx||tempy == lasty||
					Math.abs(tempx-lastx)==Math.abs(tempy-lasty))
			{
				return false;
			}
		}
		return true;
	}
}
