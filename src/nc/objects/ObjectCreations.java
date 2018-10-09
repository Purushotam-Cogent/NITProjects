package nc.objects;

public class ObjectCreations {
	
	
	
	public void show() {
		System.out.println("ObjectCreations.show()");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		Class c=Class.forName("nc.objects.Hello");
		System.out.println(c.getName());
		Hello hello=(Hello) c.newInstance();
		hello.print();
		
		c=Hello.class;
		hello=(Hello) c.newInstance();
		hello.print();
		
		
		
		
		
		
		
	}

}


class Hello
{
	public void print()
	{
		System.out.println("Hello.print()");
	}
}
