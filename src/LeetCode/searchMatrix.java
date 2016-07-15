package LeetCode;

public class searchMatrix {
	public static void main(String args[])
	{
		int[][] nums ={{1},
		  {10},
		  };
		System.out.println(searchMatrix(nums,10));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int line = matrix.length;
        int row = matrix[0].length;
        int lineleft = 0;
        int lineright = line-1;
        int rowleft = 0;
        int rowright = row-1;
        if(line < 1 || row<1) return false;
        if(target<matrix[0][0] || target>matrix[line-1][row-1]) return false;
        int mid = (lineleft+lineright)/2;
        int mid1 = (rowleft+rowright)/2;
        if(line>1)
        {
        	int flag =0;
        	while(lineleft <= lineright)
        	{
        		if(mid == line-1 ||mid==-1)
        		{
        			flag = 1;
        			break;
        		}
        		if(target < matrix[mid][0])
        		{
        			lineright = mid-1;
        		}
        		else if(target >= matrix[mid+1][0])
        		{
        			lineleft = mid+1;
        		}
        		else if(target>=matrix[mid][0] && target<matrix[mid+1][0]) 
        		{
        			flag = 1;
        			break;
        		}
        		mid = (lineleft+lineright)/2;
        	}
        	if(flag == 0 ) return false;
        }
        while(rowleft <= rowright)
    	{
    		if(target < matrix[mid][mid1])
    		{
    			rowright = mid1-1;
    		}
    		if(target > matrix[mid][mid1])
    		{
    			rowleft = mid1+1;
    		}
    		if(target==matrix[mid][mid1])
    		{
    			return true;
    		}
    		mid1 = (rowleft+rowright)/2;
    	}
        return false;
    }

}
