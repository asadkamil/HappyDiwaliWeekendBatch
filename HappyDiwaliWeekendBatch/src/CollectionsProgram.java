import java.util.HashMap;
import java.util.Scanner;

public class CollectionsProgram {

	public static void main(String[] args) {
		System.out.println("enter key and value");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Integer i = s.nextInt();
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put(str, i);
		System.out.println(hmap);
		s.close();
	}
}