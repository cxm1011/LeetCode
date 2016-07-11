package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
	public static void main(String args[])
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.print(spiralOrder(matrix));
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans= new ArrayList<Integer>(); 
		int line = matrix.length;
		if(line == 0) return ans;
		int row = matrix[0].length;
		int lmin=0,lmax=line,rmin=0,rmax=row;
		int length = line*row;
		int i = 0;
		int flag = 1;
		int templ=0,tempr=0;
		while(i<length)
		{
			while(i<length && flag == 1 && tempr<rmax)
			{
				i++;
				ans.add(matrix[templ][tempr]);
				tempr++;
			}
			flag = 2;
			lmin++;
			tempr--;
			templ++;
			while(i<length && flag == 2 && templ<lmax)
			{
				i++;
				ans.add(matrix[templ][tempr]);
				templ++;
			}
			flag = 3;
			rmax--;
			templ--;
			tempr--;
			while(i<length && flag == 3 && tempr>=rmin)
			{
				i++;
				ans.add(matrix[templ][tempr]);
				tempr--;
			}
			flag = 4;
			lmax--;
			tempr++;
			templ--;
			while(i<length && flag == 4 && templ>=lmin)
			{
				i++;
				ans.add(matrix[templ][tempr]);
				templ--;
			}
			flag=1;
			rmin++;
			templ++;
			tempr++;
		}
		return ans;
    }

}
