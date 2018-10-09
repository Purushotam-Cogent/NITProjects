package nc.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Main Started.......");
		
		try {
			Employee.checkSalary(null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Calling...Ended...");
		
		
	}
}


class Employee
{
	public static void checkSalary(String sal)throws 
	NumberFormatException,ArithmeticException,NullPointerException,
	CloneNotSupportedException,IOException,SQLException,InterruptedException,
	Exception
	
	{
		String ss=sal.toString();
		int e_sal=Integer.parseInt(sal);
		
		if(e_sal>20000 && e_sal<55000)
		{
			System.out.println("Your Application Accepted...");
		}
		else
		{
			System.out.println("As per Salary "+e_sal+" Application rejected");
		}
	}
}