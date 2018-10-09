package nc.dbs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CallableStatementDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn=DBConnect.getConnection();
		CallableStatement cs=conn.prepareCall("{call p_job_sal(?,?)}");
		
		cs.setString(1, "CLERK");
		cs.registerOutParameter(2, java.sql.Types.BIGINT);
		
		cs.execute();
		
		int sum_sal=cs.getInt(2);
		
		System.out.println("plSql Stored Procedure called,.....");
		
		System.out.println("Sum of Salary of Dept CLERK => "+sum_sal);

	}

}
