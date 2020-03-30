package collectionpackage;
import java.util.*;
public class ListAndSetInterface {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		System.out.println("enter string and numbers");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Integer i = s.nextInt();		
		al.add(str);
		//al.add(i);
		al.add(str);
		al.add(i);
		al.add(' ');
		al.add("test123");
		//al.remove(1);
		//al.clear();
		al.iterator();
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
			//for printing as a normal output
			System.out.println(itr.next());
		}
	//for printing in an arraylist
		System.out.println(al);
		s.close();
	}
}
