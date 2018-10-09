
public class Customer {

	private int cid;
	private String name;
	private int amount;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}	
	@Override
	public String toString() {
		return super.toString()+"\nCustomer [cid=" + cid + ", name=" + name + ", amount=" + amount + "]";
	}
	public static void main(String[] args) {
	Customer cc=new Customer();
	cc.setCid(1001);
	cc.setName("Raman");
	cc.setAmount(100000);
	System.out.println(cc);
	System.out.println();
	}
	
}
