package ProgrammingClasses;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("PLease enter a number");
		int num = s.nextInt();
		String convert=" ";
		while (num!=0)
		{
			convert = (num%8)+convert;
			num = num/8;
		}
		System.out.println(convert);
		s.close();
	}

}

