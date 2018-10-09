
public class DefaultMethod {
	
	public static void main(String[] args) {
		
		Bank bb=new HDFC();
		bb.updateContact();
	}

}

interface Bank{
	default void updateContact()
	{
		System.out.println("upadate contact number in your A/c");
	}
	
	public void saving();
	public void current();
	public void creditCard();
	public void kyc();
}


class HDFC implements Bank
{

	@Override
	public void updateContact() {
		// TODO Auto-generated method stub
		Bank.super.updateContact();
		System.out.println("update your comm. address");
		System.out.println("update your email-id");
	}
	
	
	@Override
	public void saving() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}
	
}