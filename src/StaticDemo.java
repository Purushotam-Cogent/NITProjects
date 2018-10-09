
public class StaticDemo {
	
	static {
		System.out.println("1.First Excuteable block of class");
		
	}
	public static void main(String[] args) {
		
		System.out.println("StaticDemo.main()");
		
	}
	
	static {
		System.out.println("2.static block");
		College c=new College("NIT", "Calicut", 673601);
		c=null;
		c.academicCalander();
		c.holidayList();
		System.out.println("College Info");
		System.out.println(c.name+"\t"+c.address+"\t"+c.code);
	}

}


class College
{
	static String name,address;
	static int code;
	public College(String name,String address,int code) {
		College.name=name;
		College.address=address;
		College.code=code;
	}
	
	public static void holidayList() {
		System.out.println("Total Holiday =30 days exclude weekends");
	}
	public static void academicCalander()
	{
		System.out.println("Normal ----Working hours");
		
	}
	public void studentInfo(int id)
	{
		System.out.println(id+"\tName=Jai Kumar");
	}
	
}
