package ProgrammingClasses;
import java.util.Scanner;
public class factorialClass {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = s.nextInt();
		int factorial=1;
		for (int i=1; i<=num; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);	
		s.close();
	}
}