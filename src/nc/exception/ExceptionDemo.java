package nc.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("ExceptionDemo.main()");
		System.out.println("--------Started------------");
		try {
			System.out.println("1.try block called....");
		System.out.println("5/0 => "+5/0 );
		
		System.out.println("Try block ended............");
		}catch(ArithmeticException e)
		{
			System.out.println("1. Exception Catch Block ");
			System.out.println("2.Exception due to "+e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		System.out.println("----------Ended--------------");
		System.out.println("------------Close-------------");

	}

}
