package oar.org.InsertDemo;
import java.sql.*;
import java.util.Properties;
public class InsertDemo 
{
	public static void main(String[] args) 
	{
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306";
		Statement stmt=null;
//		String inqry="insert into oejm5.std values(3,'Sannu','ec',70.99)";
		String upqry="update oejm5.std set perc=90.00 where id=3";
		Properties info=new Properties();
		info.put("user", "root");
		info.put("password", "root");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded and regd");
			connection=DriverManager.getConnection(url,info);
			System.out.println("connection established");
			stmt=connection.createStatement();
			System.out.println("Platform Created");
			stmt.execute(upqry);
			System.out.println("Data inserted successfully...");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try 
				{
					connection.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}