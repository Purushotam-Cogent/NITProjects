package nc.eenum;

public class ENUMDemos {

	public static void main(String[] args) {
		
		Days day=Days.SUNDAY;
		System.out.println("Sunday "+day);
		System.out.println(day.name());
		System.out.println("Value "+day.ordinal());
		
		System.out.println(Days.valueOf("TUESDAY"));
		
		Days d[]=Days.values();
		for (Days days : d) {
			
			System.out.println(days.name()+"\t"+days.ordinal());
			
		}
		
		switch(day)
		{
		case SUNDAY:
			
		case SATURDAY:
			System.out.println("Weekends");
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("Working hours");
			break;
		
			
		}
		
		
		d=Days.values();
		for (Days days : d) {
			
			System.out.println(days.name()+"\t"+days.ordinal()+"\t"+days.getId());
			
		}

	}

}
