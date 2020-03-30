package ProgrammingClasses;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		char [] c = str.toCharArray();
		StringBuilder newStr = new StringBuilder();
		for (int i= str.length()-1; i>=0; i--)
		{
			newStr= newStr.append(c[i]);
		}
		if(str.equalsIgnoreCase(newStr.toString()))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
		s.close();
	}
}

