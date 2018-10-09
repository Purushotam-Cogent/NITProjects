package nc.dbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;

public class ProjectsAPPS {
	
	static Connection conn;
	static {
		conn=DBConnect.getConnection();
	}
	
	public static int insertRecord(NCProject p)throws Exception
	{
		PreparedStatement ps=conn.prepareStatement
				("insert into ncprojects values(?,?,?,?)");
		
		ps.setInt(1, p.getP_id());
		ps.setInt(2, p.getCost());
		ps.setString(3, p.getOwner());
		ps.setString(4, p.getTech());
		return ps.executeUpdate();
		
		
	}
	
	public static ArrayList<NCProject> getAllRecords() throws SQLException
	{
		
		ArrayList<NCProject> np=new ArrayList<>();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from ncprojects");
		while(rs.next())
		{
			NCProject pp=new NCProject();
			pp.setP_id(rs.getInt(1));
			pp.setCost(rs.getInt(2));
			pp.setOwner(rs.getString(3));
			pp.setTech(rs.getString(4));
			np.add(pp);
		}
		
		return np;		
	}
	
	public static void main(String[] args) throws Exception {
	NCProject np=new NCProject(104,890000,"SAM JEU","Oracle Apps");
	int a=insertRecord(np);
	if(a>0) {
		System.out.println(a+" Record inserted....");
	
		ArrayList<NCProject> n=getAllRecords();
		ListIterator<NCProject> li=n.listIterator();
		while(li.hasNext())
		{
			System.out.println("Row =>"+li.nextIndex());
			System.out.println(li.next());
		}
		
	}
	else
		System.out.println("Not Inserted.....");
	
	}
	
	

}
