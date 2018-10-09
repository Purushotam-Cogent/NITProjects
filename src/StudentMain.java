
public class StudentMain {

	public static void main(String[] args) {
		Student obj[]=new Student[3];
		obj[0]=new Student(1001, "Razz", 23);
		obj[1]=new Student(1101, "Rohan", 20);
		obj[2]=new Student(2001, "Rahul", 28);
		
		Student ss=new Student();
		ss.loadStudent(obj);
		ss.searchStudent(2001);
		
		
		

	}

}
