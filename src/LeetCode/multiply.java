package LeetCode;

public class multiply {
	public static void main(String args[])
	{
		String ans = multiply("0","32");
		String ans1 = add("0","0");
		System.out.println(ans1);
	}
	public static String multiply(String num1, String num2) {
		int length1 = num1.length();
		int length2 = num2.length();
		if(length1 ==0) return num2;
		if(length2 ==0) return num1;
		String ans="";
		int j = length2-1;
		char[] charnum2 = num2.toCharArray();
		String temp;
		String zero="";
		for(j= length2-1;j>=0;j--)
		{
			temp = multi(num1,charnum2[j]);
			if(!temp.equals("0"))temp = temp+zero;
			ans = add(ans,temp);
			zero = zero+"0";
		}
		
        return ans;
    }
	public static String multi(String a,char b)
	{
		if(b=='0') return "0";
		if(b=='1') return a;
		int length = a.length();
		char[] stra = a.toCharArray();
		int ten = 0;
		StringBuilder ans = new StringBuilder();
		String ans1;
		for(int i = length-1;i>=0;i--)
		{
			int temp = (stra[i]-'0')*(b-'0');
			int bit = (ten+temp%10)%10;
			ten = temp/10+(ten+temp%10)/10;
			ans.append(bit);	
		}
		if(ten!=0) ans.append(ten);
		ans1 = convert(ans.toString());
		return ans1; 
	}
	public static String add(String a,String b)
	{
		int lengtha = a.length();
		int lengthb = b.length();
		if(lengtha==0) return b;
		if(lengthb==0) return a;
		char chara[] = a.toCharArray();
		char charb[] = b.toCharArray();
		StringBuilder ans = new StringBuilder();
		String ans1;
		int i = lengtha-1;
		int j = lengthb-1;
		int ten = 0;
		int bit = 0 ;
		while(i>=0 && j >= 0)
		{
			int temp = (chara[i]-'0')+(charb[j]-'0');
			bit = (ten+temp%10)%10;
			ten = temp/10+(ten+temp%10)/10;
			
			ans.append(bit);
			i--;
			j--;
			
		}
		
		if(i<0&&j<0)
		{
			if(ten!=0) ans.append(ten);
			ans1 = convert(ans.toString());
			return ans1;
		}
		if(i<0&&j>=0)
		{
			while(j>=0)
			{
				int temp = charb[j]-'0';
				bit = (ten+temp%10)%10;
				ten = temp/10+(ten+temp%10)/10;
				ans.append(bit);
				j--;
			}
			if(ten!=0) ans.append(ten);
			ans1 = convert(ans.toString());
			return ans1;
		}
		
		if(j<0&&i>=0)
		{
			while(i>=0)
			{
				int temp = chara[i]-'0';
				bit = (ten+temp%10)%10;
				ten = temp/10+(ten+temp%10)/10;
				ans.append(bit);
				i--;
			}
			if(ten!=0) ans.append(ten);
			ans1 = convert(ans.toString());
			return ans1;
		}
		return ans.toString();
		
	}
	public static String convert(String s)
	{
		int length = s.length();
		StringBuilder ans = new StringBuilder();
		int i=length-1;
		char[] ss = s.toCharArray();
		while(i>=0)
		{
			ans.append(ss[i]);
			i--;
		}
		return ans.toString();
	}
}
