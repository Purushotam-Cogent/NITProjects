package nc.exception;

public class UserDefinedException {
	
	public static void checkSalaryBasedOnPosition(String pos,int sal)
			throws SalaryNotInRangeException
	{
		if(pos.equalsIgnoreCase("manager") &&( sal>50000 && sal<150000 ))
			System.out.println("Welcome Mr.My Bank Bank Finance Ltd. "
					+ "Offered you 20Lacs as PL");
	else if(pos.equalsIgnoreCase("developer") && (sal>30000 && sal<80000))
			System.out.println("Welcome to Corp.Finance Ltd.Offered you credit "
					+ "card with Limit->1,50,000Lacs");
		else
			throw new SalaryNotInRangeException("Position "+pos
					+" But Salary is "+	sal+" SO Exception raised");
			
	}

	public static void main(String[] args) {
		
		try {
			UserDefinedException.checkSalaryBasedOnPosition
			("Manager", 49999);
		} catch (SalaryNotInRangeException e) {
			
			System.out.println("User=>Exception Raised based on Position "
					+ "& Salary");
		//	System.out.println("Message( "+e.getMyExceptionMessage()+")");
			System.out.println("Message( "+e.getMessage()+" )");
			
			e.printStackTrace();
		}
		
	}

}

class SalaryNotInRangeException extends Exception
{
	String str;
	public SalaryNotInRangeException() {
		super();
		str="Salary Exception Pls check your salarty Input";
	}
	
	public SalaryNotInRangeException(String str)
	{
		super(str);
	}
	
	public String getMyExceptionMessage()
	{
		return getClass().getName()+"=>"+str;
	}
	
}