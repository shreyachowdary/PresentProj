import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionDemo
{
	public static void main(String args[])
	{
		System.out.println("-----------MySQL JDBC Connection Demo---------");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("MySQL JDBC Driver Not Found!!");
			return;
		}
		System.out.println("MySQL JDBC Driver Registered");
		Connection connection=null;
		try
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","its_my_password");
			System.out.println("SQL Connection to database established!");
		}
		catch(SQLException e)
		{
			System.out.println("Connection Failed! Check Output console");
			return;
		}
		finally{
		try
		{
			if(connection!=null)
				connection.close();
			System.out.println("Connection closed!!");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
}