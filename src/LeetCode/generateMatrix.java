package LeetCode;

public class generateMatrix {
	public static void main(String args[])
	{
		int n = 1;
		int[][] ans1 = generateMatrix(n);
		//int[][] ans1 = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<ans1.length;i++)
		{
			int length = ans1[i].length;
			for(int j=0;j<length;j++)
			{
				System.out.print(ans1[i][j]+" ");
			}
			System.out.println();
		}
			//System.out.println(ans1[i]);
	}
	public static int[][] generateMatrix(int n) {
		int[][] ans = new int[n][n];
		if(n < 0) return null;
 
        int xstart = 0;
        int ystart = 0;
        int num = 1;
        while(n>0)
        {
        	if(n == 1)
            {
            	ans[xstart][ystart] = num++;
            	return ans;
            }
        	 for (int i = 0; i < n - 1; i++) {
                 ans[ystart][xstart + i] = num++;
             }

             for (int i = 0; i < n - 1; i++) {
                 ans[ystart + i][xstart + n - 1] = num++;
             }

             for (int i = 0; i < n - 1; i++) {
                 ans[ystart + n - 1][xstart + n - 1 - i] = num++;
             }

             for (int i = 0; i < n - 1; i++) {
                 ans[ystart + n - 1 - i][xstart] = num++;
             }

             xstart++;
             ystart++;
             n = n - 2;
        }
        return ans;
    }

}
