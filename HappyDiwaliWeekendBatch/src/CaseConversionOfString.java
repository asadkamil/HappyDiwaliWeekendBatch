package src;

import java.util.Scanner;

public class CaseConversionOfString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string value");
		String s1 = s.nextLine();
		char[] c = s1.toCharArray();		
		for(int i=0; i<=c.length-1; i++)
		{
			if(c[i]>=65 && c[i]<=90)
			{
				c[i]=(char) (c[i]+32);
			}
			else if(c[i]>=97 && c[i]<=122)
			{
				c[i]=(char) (c[i]-32);
			}
		}
		s1= new String(c);
		System.out.println(s1);
		s.close();
	}
}

