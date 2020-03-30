import java.util.Scanner;


public class Print2KaTable {

	public static void main(String[] args) {
		System.out.println("Enter the number to print table");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("The entered number is "+n);
		System.out.println("The table of "+n+" is below: ");
		for (int i=1;i<=10; i++)
		{	 	 
			System.out.println(n+"*"+i+"="+i*n);
		}
		s.close();
	}
}
