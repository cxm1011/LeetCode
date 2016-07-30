package LeetCode;

public class maxProfit2 {
	public static void main(String args[])
	{
		int[] height={7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(height));
	}
	public static int maxProfit(int[] prices) {
        int length = prices.length;
        if(length==0 || prices == null || length==1) return 0;
        int max = 0;
        for(int i = 0;i<length-1;i++)
        {
        	int profit = prices[i+1]-prices[i];
        	if(profit > 0) max+=profit;
        	
        }
        return max;
    }
}
