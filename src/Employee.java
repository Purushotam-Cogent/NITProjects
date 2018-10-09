
public class Employee {
	private int id;
	private String name;
	
	public Employee()
	{
		this(10001);
		System.out.println("1.Employee.Employee()");
		System.out.println("This Keyword "+this);
	}
	public Employee(int id)
	{
		this(10001,"John");
		System.out.println("2.Employee.Employee(int)");
		this.id=id;
	}
	public Employee(int id,String name)
	{
		
		System.out.println("3.Employee.Employee(int,String)");
		this.id=id;
		this.name=name;
	}


	
	@Override
	public String toString() {
		return "Employee [id=" +this.id + ", name=" + this.name + "]";
	}
	public static void main(String[] args) {
		
		Employee ee=new Employee();
		System.out.println(ee);
		System.out.println("Object in Main "+Integer.toHexString(ee.hashCode()));
		//ee=new Employee(10001);
		//System.out.println(ee);
		//ee=new Employee(20001,"Rohan");
		//System.out.println(ee);

	}

}
