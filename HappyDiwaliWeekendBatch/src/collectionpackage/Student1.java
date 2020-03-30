package collectionpackage;
import java.util.ArrayList;
import java.util.Iterator;
public class Student1 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Student s1 = new Student(23,101,"sonu");
		Student s2 = new Student(34,102,"Asad");
		Student s3 = new Student(35,105,"shruti");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.age+st.name+st.roll_no);
		}
		//printing address of each object
		System.out.println(al);
	}	
}