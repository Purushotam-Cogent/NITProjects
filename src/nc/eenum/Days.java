package nc.eenum;

public enum Days {
	SUNDAY(90),
	MONDAY,
	TUESDAY,
	WEDNESDAY(50),
	THURSDAY,
	FRIDAY,
	SATURDAY(89);
	
	int id;
	private Days() {
		// TODO Auto-generated constructor stub
	}
	private Days(int id) {
		this.id=id;

	}
	public int getId() {
		return id;
	}
	
	
	
	
}
