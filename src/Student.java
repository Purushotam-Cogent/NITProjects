
public class Student {
	
	Student obj[];
	
	int age;
	String name;
	int id;
	
public Student()
{
	
}
	public Student(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	
	public void loadStudent(Student o[])
	{
		obj=o;
	}
	
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Student["+id+","+name+","+age+"]");
	}
	
	public void searchStudent(int id)
	{
		for(int i=0;i<obj.length;i++)
		{
			if(obj[i].id==id)
			{
				System.out.println("Student Found");
				obj[i].display();
				break;
			}
		}
		
	}
	

}
