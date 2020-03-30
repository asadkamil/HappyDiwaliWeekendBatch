package ProgrammingClasses;

import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char [] c = str.toCharArray();
		int count =0;
		int space =0;
		for(int i=str.length()-1; i>=0; i--)
		{
			if (c[i]=='A'|| c[i]=='a')
			{
				count = count+1;
			}
			if (c[i]==' ')
			{
				space = space+1;					
			}
		}
		System.out.println(count);
		System.out.println(space);
		s.close();
	}
}
