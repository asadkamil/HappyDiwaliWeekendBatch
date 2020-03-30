import java.util.Scanner;

public class VerifyNumberIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check whether it is even or not");
		int n =s.nextInt();
		if(n%2==0)
		{
			System.out.println("it is even");
		}
		else {
			System.out.println("it is odd number");
	}
		
		s.close();
	}

}
