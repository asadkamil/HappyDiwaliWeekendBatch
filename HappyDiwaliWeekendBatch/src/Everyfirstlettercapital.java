import java.util.Scanner;

public class Everyfirstlettercapital 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter any string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] c = str.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if( i==0 || (c[i]!=' ' && c[i-1]==' '))
			{
				if(c[i]>=65 && c[i]<=90)
				{
					c[i]=(char)(c[i]+32);
				}
				else if(c[i]>=97 && c[i]<=122 )
				{
					c[i]=(char)(c[i]-32);
				}
			}
		}
		System.out.println(c);
		s.close();
	}
}
//asad kamil