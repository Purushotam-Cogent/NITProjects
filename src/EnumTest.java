
public class EnumTest {
	
	public static void main(String[] args) {
		Days day=Days.SUNDAY;
		System.out.println(day);
		System.out.println("Value of'SUNDAY' "+Days.valueOf("SUNDAY"));
		System.out.println(Days.SUNDAY);
		
		String days=enumInSwitch(day);
		System.out.println(days);
		
		Days d[]=Days.values();
		
		for(Days dd:d)
		{
			System.out.println(dd.name()+"\t"+dd.ordinal()+"\t"+dd.getId());
			
		}
		
		
		
	}
	
	   public static String enumInSwitch(Days day) {

	       switch(day) {

	           case SUNDAY:

	               return "Its Sunday!!";

	           case MONDAY:

	               return "Its Monday";

	           case TUESDAY:

	               return "Its Tuesday";

	           case WEDNESDAY:

	               return "Its Wednesday";

	           default:

	               return "Rest of the week....";

	       }

	   }

}


enum Days{
	SUNDAY(100),
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY(200);
	
	int id;
	Days(int id)
	{
		this.id=id;
	}
	
	Days()
	{
		this.id=0;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	
}
