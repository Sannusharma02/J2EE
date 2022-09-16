package oar.org.FirstApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDemo {

	public static void main(String[] args) 
	{
		Connection connection = null; 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded & registered");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection established...");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
