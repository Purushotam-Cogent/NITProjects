package nc.dbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection()
	{
		Connection conn=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE","nic", "system");
		return conn;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE","nic", "system");
		if(conn!=null)
			System.out.println("DB connection done "+conn);
		else
			System.out.println("DB Connection not done pls connect DBAdmin");

	}

	
}
