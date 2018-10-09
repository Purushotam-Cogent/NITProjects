package nc.dbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUtility {
	static Connection conn;
	
	static{
		conn=DBConnect.getConnection();
	}
	
	public static int insertRecord(int id,int cost,String owner,String tech) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement
				("insert into ncprojects values(?,?,?,?)");
		ps.setInt(2, cost);
		ps.setString(4, tech);
		ps.setInt(1, id);
		ps.setString(3, owner);
		return ps.executeUpdate();
		
	}
	
	
	

	public static void main(String[] args) throws SQLException {
		/*int a=insertRecord(103, 120000, "JOHN", "Python/PyGame");
		if(a>0)
			System.out.println(a+"Record inserted..");
		else
			System.out.println("Not Inserted.......");*/

	}

}
