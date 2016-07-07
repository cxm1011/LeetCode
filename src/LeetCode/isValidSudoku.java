package LeetCode;

public class isValidSudoku {
	public static void main(String args[])
	{
		
	}
	public static boolean isValidSudoku(char[][] board) {
		int length_h = board.length;
		boolean ans = true;
		for(int i=0;i<length_h;i++) //对每一行
		{
			int lie = board[i].length;
			int[] visit = new int[lie];
			for(int j=0;j<lie;j++) //每一列中的元素进行检测，不满足即返回false
			{
				if(!check(board,i,j,visit)) return false;
			}
		}
		int length_l = board[0].length;
		for(int i=0;i<length_l;i++) //对每一列
		{
			int hang = board[i].length;
			int[] visit = new int[hang];
			for(int j=0;j<hang;j++) //每一行中的元素进行检测，不满足即返回false
			{
				if(!check(board,j,i,visit)) return false;
			}
		}
		int m = 0;
		while(m<length_h)
		{
			int n = 0;
			while(n<length_l)
			{
				int[] visit = new int[9];
				for(int p=0;p<3;p++)
				{
					for(int q=0;q<3;q++)
					{
						if(!check(board,m+p,n+q,visit)) return false;
					}
				}
				n = n+3;
			}
			m = m+3;
		}
        return ans;
    }
	public static boolean check(char[][] board,int i,int j,int[] visit)
	{
		int temp = board[i][j]-'0';
		if(visit[temp] == 1) return false;
		if((board[i][j]>='0'&&board[i][j]<='9')||board[i][j]=='.')
		{
			if(board[i][j]!='.')
			{
				visit[temp] = 1;	
			}
			return true;
		}
		else
			return false;
	}
	
	
}
