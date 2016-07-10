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
			temploc = new ArrayList<Integer>();	 //�������һ��Ҫִ�У��������temploc��ӡ�����λ������Ͳ�ֹ������
									//����ֻ���ж�λ�ò����ϵ������ִ�У���Ϊ�����ǰλ��������ڵݹ��������������Ͳ���ִ��
									//�����ͳ�����Ϊλ�����겻ֹ����
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
