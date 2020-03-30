package ProgrammingClasses;

import java.util.Scanner;

public class CountCharsInString {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter your name::");
		String str = s.nextLine();
		char [] arr = str.toCharArray();
		int count = 0;
		for(int i=str.length()-1; i>=0; i--)
		{
			if(arr[i]=='A'|| arr[i]=='a')
			{
				count = count+1;
			}
		}
		System.out.println(count);
		s.close();
	}
}
