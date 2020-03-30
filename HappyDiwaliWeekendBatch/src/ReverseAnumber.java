import java.util.Scanner;

public class ReverseAnumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("PLease enter a number");
		int num = s.nextInt();
		int  rev=0;
		while (num!=0)
		{
			rev = rev*10+(num%10);
			num= num/10;
		}
		System.out.println(rev);
		s.close();
	}
}
