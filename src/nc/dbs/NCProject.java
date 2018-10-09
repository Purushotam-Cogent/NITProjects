package nc.dbs;

public class NCProject {
	
	private int p_id,cost;
	private String owner,tech;
	public NCProject() {
		// TODO Auto-generated constructor stub
	}
	public NCProject(int p_id, int cost, String owner, String tech) {
		super();
		this.p_id = p_id;
		this.cost = cost;
		this.owner = owner;
		this.tech = tech;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "NCProject [p_id=" + p_id + ", cost=" + cost + ", owner=" + owner + ", tech=" + tech + "]";
	}
	
	
	
	
	

}
