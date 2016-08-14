package huawei;

import java.util.*;

public class lengthOfLastWord {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			
			String[] all = s.split(" ");
			System.out.println(all[all.length-1].length());
		}
	}
}
