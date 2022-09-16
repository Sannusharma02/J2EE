package oar.org.LoginApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginDemo 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="Select name from oejm5.user where username=? and password=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String uname=sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				String name=rs.getString(1);
				System.out.println("Welcome"+name+"...");
			}
			else
			{
				System.out.println("Invalid Username or password...!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try 
				{
					con.close();
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