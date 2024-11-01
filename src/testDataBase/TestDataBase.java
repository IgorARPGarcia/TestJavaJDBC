package testDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataBase {
	static String url, login, password, employeeId, lastName, salary;
	static Connection conn;
	static Statement stat;
	static ResultSet result;
	
	public TestDataBase() throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			url = "jdbc:mysql://localhost:3306/employees";
			
			login = "root";
			
			password = "senhaSenha";
			
			conn = DriverManager.getConnection(url, login, password);
			
			stat = conn.createStatement();
			
			result = stat.executeQuery("select * from employeesData");
			
			while(result.next()) 
			{
				employeeId = result.getString("employeeId");
				lastName = result.getString("lastName");
				salary = result.getString("salary");
				
				System.out.println("ID: " + employeeId + "		Last Name: " + lastName + "		Salary: $" + salary);
			}
		}
		
		catch(ClassNotFoundException e) 
		{
			System.out.println("SQL Driver not found");
		}
		catch(SQLException e) 
		{
			System.out.println("Failed to execute SQL command");
		}
		
		
		
	}
	
	public static void main(String[] args) throws SQLException
	{
		new TestDataBase();
	}
	
}
