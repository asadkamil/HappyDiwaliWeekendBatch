package ProgrammingClasses;

import java.util.Scanner;

public class PowerOfNumber{
	static int power(int num, int p) 
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*num;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the values of a number...");
		int num = s.nextInt();
		System.out.println("enter the values of a power...");
		int p = s.nextInt();
		System.out.println("the power of a number "+num+" to the power of "+p+" is : "+PowerOfNumber.power(num, p));
		s.close();
	}
}

/*public class PowerOfNumber {

	static int power(int num, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*num;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) {
		System.out.println(PowerOfNumber.power(5, 2));
	}

}
 */