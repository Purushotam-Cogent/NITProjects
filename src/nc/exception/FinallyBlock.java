package nc.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		int x=90;
		try {
			System.exit(0);
			System.out.println(x/0);
		}
		finally {
		System.out.println("Finally Block always execute");
		System.out.println("close d connection or any resource if you "
				+ "using that must be close in finally");
		System.out.println(x+=100);
		
		
		}
		
		System.out.println("Outside block of finally ");
		System.out.println(x+=100);
		

	}

}
