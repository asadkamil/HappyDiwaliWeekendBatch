package ProgrammingClasses;

import java.util.Scanner;

public class DecimalToHexadecimal {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("PLease enter a number");
			int num = s.nextInt();
			String convert=" ";
			while (num!=0)
			{
				convert = (num%16)+ convert;
				num = num/16;
			}
			System.out.println(convert);
			s.close();
		}
	}

