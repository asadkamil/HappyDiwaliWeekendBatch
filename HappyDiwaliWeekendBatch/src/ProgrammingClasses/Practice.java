package ProgrammingClasses;
import java.util.*;
import com.sun.jmx.snmp.internal.SnmpAccessControlSubSystem;
public class Practice{
	public static void main(String[] args) {
		/*System.out.println("enter any string to reverse");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		//char [] arr = str.toCharArray();
		String reverse ="";
		//s.close();
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);*/
//===========================================================================//
		System.out.println("enter any number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		fact(num);
		System.out.println(fact(num));
	}
	public static int fact(int num)
	{
		if (num<=1)
		return 1;		
		return num*fact(num-1);
	}
}