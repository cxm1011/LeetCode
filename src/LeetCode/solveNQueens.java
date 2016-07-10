package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class solveNQueens {
	public static void main(String args[])
	{
		int n = 4;
		
		List<List<String>> ans = solveNQueens(n);
	
		System.out.print(ans);
	}
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> ans = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<String>();
		
		List<List<Integer>> loc = new ArrayList<List<Integer>>();
		List<Integer> temploc = new ArrayList<Integer>();
		
		if(n<=0||n==2||n==3) return ans;
		if(n==1)
		{
			temp.add("Q");
			ans.add(temp);
			return ans;
		}
		StringBuilder temp1 = new StringBuilder();
		for(int i=0;i<n;i++)
		{
			temp1.append('.');
		}
		ans = find(0,n,ans,temp,temp1,loc);
		return ans;
    }
	public static List<List<String>> find(int i,int n,List<List<String>> ans,List<String> temp
			               ,StringBuilder temp1,List<List<Integer>> loc)
	{
		if(i == n)
		{
			ans.add(new ArrayList<String>(temp));
			if(temp.size()>0) temp.remove(temp.size()-1);//���ҵ�һ�ֿ��������Ҫ���аѵ�ǰ��loc��temp���һ��ȥ��
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
				temp1.setCharAt(j,'Q');
				temp.add(temp1.toString());
				temp1.setCharAt(j,'.');
				loc.add(temploc);
				ans = find(i+1,n,ans,temp,temp1,loc);
			}
			temploc = new ArrayList<Integer>();	 //�������һ��Ҫִ�У��������temploc��ӡ�����λ������Ͳ�ֹ������
									//����ֻ���ж�λ�ò����ϵ������ִ�У���Ϊ�����ǰλ��������ڵݹ��������������Ͳ���ִ��
									//�����ͳ�����Ϊλ�����겻ֹ����
		}
		if(temp.size()>0) temp.remove(temp.size()-1);//ѭ����������û�нⶼҪȥ��
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
