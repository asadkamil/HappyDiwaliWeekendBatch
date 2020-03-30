package ProgrammingClasses;

import java.util.Scanner;

public class SwappingStrings {
	public static void main(String[] args) {
		System.out.println("enter the 2 strings");
		Scanner s = new Scanner(System.in);
		String s1= s.next();
		Scanner c = new Scanner(System.in);
		String s2= c.next();
		System.out.println("before swappping given the 1st string is "+s1);
		System.out.println("before swapping given the 2nd string is "+s2);
		s1= s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After sqapping 1st string becomes "+s1);
		System.out.println("After swapping 2nd string becomes "+s2);
		s.close();
		c.close();
	}
}
