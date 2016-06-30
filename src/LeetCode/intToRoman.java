package LeetCode;

public class intToRoman {
	public static void main(String args[])
	{
		int num = 872;
		System.out.println(intToRoman(num));
	}
	public static String intToRoman(int num) {
		if(num <= 0) {
			return "";
		}
	    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    //StringBuilder res = new StringBuilder();
	    String res = new String();
	    int digit=0;
	    while (num > 0) {
	        int times = num / nums[digit];
	        num -= nums[digit] * times;
	        for ( ; times > 0; times--) {
	        	res = res+symbols[digit];
	            //res.append(symbols[digit]);
	        }
	        digit++;
	    }
	    //return res.toString();
	    return res;
	    
    }

}
