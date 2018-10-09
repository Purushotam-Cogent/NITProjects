package nc.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Customer> hs=new HashSet<>();
		hs.add(new Customer(101,20000));
		hs.add(new Customer(102,15000));
		hs.add(new Customer(103,35000));
		hs.add(new Customer(101,65000));
		
		System.out.println(hs);

	}

}

class Customer
{
	private int id;
	private float amount;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id,float amount)
	{
		this.id=id;
		this.amount=amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer cc=(Customer) obj;
		
		return (this.getId()==cc.getId()?true:false);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getId();
	}
	
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", amount=" + amount + "]";
	}
	
	
	
}