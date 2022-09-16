package oar.org.pstmt;
import java.sql.*;
public class pstmtDemo {

	public static void main(String[] args) 
	{
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		PreparedStatement pstmt=null;
		String qry="insert into oejm5.std values(?,?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url);
			pstmt=connection.prepareStatement(qry);
			pstmt.setInt(1, 6);
			pstmt.setString(2, "Sannu");
			pstmt.setString(3, "Cse");
			pstmt.setDouble(4, 65.00);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 7);
			pstmt.setString(2, "Shweta");
			pstmt.setString(3, "Civil");
			pstmt.setDouble(4, 95.00);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 8);
			pstmt.setString(2, "Pankaj");
			pstmt.setString(3, "CSE");
			pstmt.setDouble(4, 100.00);
			pstmt.executeUpdate();
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
		}
	}
}