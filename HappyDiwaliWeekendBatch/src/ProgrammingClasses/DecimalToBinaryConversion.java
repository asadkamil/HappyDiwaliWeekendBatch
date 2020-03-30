package ProgrammingClasses;

import java.util.Scanner;

public class DecimalToBinaryConversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("PLease enter a number");
		int num = s.nextInt();
		String convert=" ";
		while (num!=0)
		{
			convert = (num%2)+ convert;
			num = num/2;
		}
		s.close();
		System.out.println(convert);
	}
}
