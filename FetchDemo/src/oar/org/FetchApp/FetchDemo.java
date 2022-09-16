package oar.org.FetchApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchDemo 
{
	public static void main(String[] args) 
	{
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
//		String qry="select * from oejm5.std";
//		String qry="select name,perc from oejm5.std";
		String qry="select * from oejm5.std";
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url);
			pstmt=connection.prepareStatement(qry);
			rs=pstmt.executeQuery();
//			if (rs.next())
//			{
////				int id=rs.getInt("id");
////				String name=rs.getString(2);
////				String branch=rs.getString("branch");
////				double perc=rs.getDouble(4);
////				System.out.println("Student Details:"
////						+id+" "+name+" "+branch+" "+perc+"...");
//				
////				String name=rs.getString(1);
////				double perc=rs.getDouble(2);
////				System.out.println(name+" "+perc);
//				
//				String name=rs.getString(1);
//				double perc=rs.getDouble(4);
//				System.out.println(name+" "+perc);
//			}
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString(2);
				String branch=rs.getString("branch");
				double perc=rs.getDouble(4);
				System.out.println("Student Details:"
					+id+" "+name+" "+branch+" "+perc+"...");
			}
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
			if(pstmt!=null)
			{
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try 
				{
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}