
public class FinalDemo {
	public static void main(String[] args) {
		final int cx=100;
		
		ABC abc=new XYZ();
		abc.show();
		
	}

}

class ABC
{
	public final void add()
	{
		
	}
	public static void show()
	{
		System.out.println("static => ABC.show()");
	}
}

class XYZ extends ABC
{
	
	public void add1() {
		
	}
	
	public static void show()
	{
		System.out.println("static => XYZ.show()");
	}
}
