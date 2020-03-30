import java.util.Scanner;

public class PyramidPrint {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 2 D array number...");
		int num = s.nextInt();
		for(int i = 0; i<=num; i++)
		{
			for(int j=0; j<=num; j++)
			{
				if(i==0 || j==0 || i==j || j==i+1)
				{
				System.out.print("*");
				}
				System.out.println();
				}
			s.close();
		}






	}
}
