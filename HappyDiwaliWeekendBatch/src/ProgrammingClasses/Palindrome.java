package ProgrammingClasses;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("PLease enter a number");
		int num = s.nextInt();
		int  palindrome=0;
		while (num!=0)
		{
			palindrome = palindrome*10+(num%10);
			num= num/10;
		}
		System.out.println(palindrome);
		s.close();
	}
}