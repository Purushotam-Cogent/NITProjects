package nc.exception;

public class MultipleCatches {
	void display()
	{
		System.out.println("MultipleCatches.display()");
	}

	public static void main(String[] args) {
		System.out.println("1.MultipleCatches.main()");
		try {
	int a[]=new int[23];
	MultipleCatches m=null;
	a[23]=9000;
	int x=Integer.parseInt("23S");
	System.out.println("Index 23 Array Element => "+a[23]);
	m.display();
	System.out.println("Convert String into Numberic "+x);
		}catch(ArithmeticException|NumberFormatException|
				NullPointerException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		

	}

}
