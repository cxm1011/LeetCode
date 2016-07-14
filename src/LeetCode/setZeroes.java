package LeetCode;

public class setZeroes {
	public static void main(String args[])
	{
		int[][] nums = {{1,2,3},{5,0,6},{0,3,1}};
		setZeroes(nums);
		int line = nums.length;
	    int row = nums[0].length;
	    for(int i=0;i<line;i++)
	    {
	    	for(int j=0;j<row;j++)
	    	{
	    		System.out.print(nums[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}
	public static void setZeroes(int[][] matrix) {
        int line = matrix.length;
        int row = matrix[0].length;
        int[][] flag = new int[line][row];
        for(int i=0;i<line;i++)
        {
        	for(int j = 0;j<row;j++)
        	{
        		if(matrix[i][j] == 0 &&flag[i][j] == 0)
        		{
        			set(matrix,i,j,line,row,flag);
        		}
        	}
        }
    }
	public static void set(int[][] matrix,int i,int j,int line,int row,int[][] flag)
	{
		int k = 0;
		for(k = 0;k<line;k++)
		{
			if(matrix[k][j] != 0)
			{
				matrix[k][j] = 0;
				flag[k][j] = 1;
			}
		
		}
		int m = 0;
		for(m = 0;m<row;m++)
		{
			if(matrix[i][m] != 0)
			{
				matrix[i][m] = 0;
				flag[i][m] = 1;
			}
			
		}
	}

}
