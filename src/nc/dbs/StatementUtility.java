package nc.dbs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementUtility {
	static Connection conn;
	
	static {
		conn=DBConnect.getConnection();
	}
	
	public static void createTable()throws Exception
	{
		String sql="create table ncprojects"
				+ "(p_id number primary key,p_cost number,"
				+ "p_owner varchar2(50),tech varchar2(50))";
		
		Statement st=conn.createStatement();
		Boolean bool=st.execute(sql);
		System.out.println("Table Created with Status "+bool);
		
		
	}
	
	public static int insertRecord(int id,int cost,String owner,String tech) throws SQLException
	
	{
		String sql="insert into ncprojects values"
		+"("+id+","+cost+",'"+owner+"','"+tech+"')";
		Statement st=conn.createStatement();
		return st.executeUpdate(sql);
		
	}
	
	public static void showRecords() throws SQLException
	{
		String sql="select * from emp";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		System.out.println("EMPID\tENAME\tJOB\tMGR\tHIREDATE\tSAL\tCOMM\tDEPTNO");
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getDate("hiredate"));
			System.out.print("\t"+rs.getInt(6));
			System.out.print("\t"+rs.getInt("comm"));
			System.out.println("\t"+rs.getInt(8));
			
			
		}
	}
	
		
		public static void ShowResultSetScrollable() throws SQLException
		{
			String sql="select EMPno,ENAME,JOB,SAL from emp";
			Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery(sql);
			rs.last();
			System.out.println("Row :=> "+rs.getRow());
				System.out.println("EMPID\tENAME\tJOB\t\tSAL");
				System.out.print(rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t"+rs.getInt(4));
				
			rs.first();
			System.out.println("Row :=> "+rs.getRow());
			System.out.println("EMPID\tENAME\tJOB\t\tSAL");
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.println("\t"+rs.getInt(4));
			rs.next();
			System.out.println("Row :=> "+rs.getRow());
			System.out.println("EMPID\tENAME\tJOB\t\tSAL");
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.println("\t"+rs.getInt(4));
			
			rs.absolute(7);
			System.out.println("Row :=> "+rs.getRow());
			System.out.println("EMPID\tENAME\tJOB\t\tSAL");
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.println("\t"+rs.getInt(4));
			
			rs.previous();
			System.out.println("Row :=> "+rs.getRow());
			System.out.println("EMPID\tENAME\tJOB\t\tSAL");
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.println("\t"+rs.getInt(4));
				
				
				
				
			
		}

	public static void main(String[] args) throws Exception {
		
		System.out.println("DB Utility Demo");
		
		//System.out.println("Creation Table.......");
		
		//createTable();
		/*int a=insertRecord(1001, 2300000, "ShreeWanth", "Java/Spring/AngularJS");
		
		if(a>0)
			System.out.println(a+" Record Inserted..");
		else
			System.out.println("Record not inserted...");*/
		
		//showRecords();
		
		ShowResultSetScrollable();

	}

}
