package ProgrammingClasses;
import java.util.Scanner;
/*public class ReverseAnumber {
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
	}
}*/
//hello
//string reverse
public class ReverseAnumber {
	public static void main(String[] args) {
		String result="";
		Scanner s = new Scanner(System.in);
		System.out.println("enter any string");
		String str = s.next();
		char ar[] = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			result=result + ar[i];
		}
		System.out.println(result);
		s.close();
	}








}