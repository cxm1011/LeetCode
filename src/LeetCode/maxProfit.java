package LeetCode;

public class maxProfit {
	public static void main(String args[])
	{
		int[] height={7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(height));
	}
	public static int maxProfit(int[] prices) {
		int low = 0;
		int length = prices.length;
		if(length == 0) return 0;
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for(int i =0 ;i<length;i++)
		{
			if(prices[i] <min) min = prices[i];
			if(profit < (prices[i]-min)) profit = prices[i]-min;
		}
		return profit;
        
    }
}
