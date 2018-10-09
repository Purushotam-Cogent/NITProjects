package nc.collections;

import java.util.Collections;
import java.util.TreeSet;

public class StudentSortedCollection {

	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student(12, "Jack"));
		ts.add(new Student(10,"John"));
		ts.add(new Student(4,"SAM"));
		ts.add(new Student(10,"JOhn10"));
		
		System.out.println(ts);
		
	}

}
