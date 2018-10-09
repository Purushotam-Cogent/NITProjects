package nc.io;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int id;
	private transient float fee;
	private double tot_fee;
	public Student()
	{
		
	}
	public Student(int id, float fee, double tot_fee) {
		super();
		this.id = id;
		this.fee = fee;
		this.tot_fee = tot_fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public double getTot_fee() {
		return tot_fee;
	}
	public void setTot_fee(double tot_fee) {
		this.tot_fee = tot_fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fee=" + fee + ", tot_fee=" + tot_fee + "]";
	}
	
	
	

}
