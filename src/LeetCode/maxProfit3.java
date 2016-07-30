package LeetCode;

public class maxProfit3 {

	public static void main(String args[])
	{
		int[] height={2,3,1,4,6,7,2};
		System.out.println(maxProfit(height));
	}
	public static int maxProfit(int[] prices) {
		int length = prices.length;
        if(length==0 || prices == null || length==1) return 0;
        int[] left = new int[length];
        int[] right = new int[length];
        int min = prices[0];
        left[0] = 0;
        for(int i=1;i<length;i++)
        {
        	min = Math.min(prices[i], min);
        	left[i] = Math.max(left[i-1],prices[i]-min);
        }
        int max = prices[length-1];
        right[length-1] = 0;
        for(int j=length-2;j>=0;j--)
        {
        	max = Math.max(prices[j], max);
        	right[j] =Math.max(right[j+1],max-prices[j]);
        	
        }
        int MaxProfit = 0;
        for(int k =0;k<length;k++)
        {
        	MaxProfit = Math.max(MaxProfit, left[k]+right[k]);
        }
        return MaxProfit;
        
    }
}
