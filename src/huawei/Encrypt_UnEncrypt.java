package huawei;

import java.util.*;

public class Encrypt_UnEncrypt {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			String s1 = in.nextLine();
			char[] chars = s.toCharArray();
			int len = s.length();
			char[] res = new char[len];
			Encrypt(chars,res);
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i]);
			}
			
			System.out.println();
			char[] chars1 = s1.toCharArray();
			int len1 = s1.length();
			char[] res1 = new char[len1];
			unEncrypt(chars1,res1);
			for (int i = 0; i < len1; i++) {
				System.out.print(res1[i]);
			}
			
		}
	}
	public static void Encrypt (char aucPassword[], char aucResult[])
	{
		int len = aucPassword.length;
		for (int i = 0; i < len; i++) 
		{
			if(aucPassword[i]>='a'&&aucPassword[i]<'z')
			{
				aucResult[i] =(char) (aucPassword[i]-31);
			}
			else if(aucPassword[i]>='z')
			{
				aucResult[i] = 'A';
			}
			else if(aucPassword[i]>='0'&&aucPassword[i]<'9')
			{
				aucResult[i] = (char)(aucPassword[i]+1);
			}
			else if(aucPassword[i]=='9')
			{
				aucResult[i] = '0';
			}
			else if(aucPassword[i]>='A'&&aucPassword[i]<'Z')
			{
				aucResult[i] =(char) (aucPassword[i]+33);
			}
			else if(aucPassword[i]>='Z')
			{
				aucResult[i] = 'a';
			}
			else {
				return;
			}
			
		}
	}
	
	public static void unEncrypt (char result[], char password[])
	{
		int len = result.length;
		for (int i = 0; i < len; i++) 
		{
			if(result[i]>'a'&&result[i]<='z')
			{
				password[i] =(char) (result[i]-33);
			}
			else if(result[i]=='a')
			{
				password[i] = 'Z';
			}
			else if(result[i]>'0'&&result[i]<='9')
			{
				password[i] = (char)(result[i]-1);
			}
			else if(result[i]=='0')
			{
				password[i] = '9';
			}
			else if(result[i]>'A'&&result[i]<='Z')
			{
				password[i] =(char) (result[i]+31);
			}
			else if(result[i]=='A')
			{
				password[i] = 'z';
			}
			else {
				return;
			}
			
		}
	}
}
