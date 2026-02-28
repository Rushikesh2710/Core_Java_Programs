package Jdbc;
import java.sql.*;
public class setup {
	
	Connection cn;
	Statement st;
	void dbsetup() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1.Driver loaded");
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="";
		
		cn=DriverManager.getConnection(url, username, password);
		System.out.println("connection done!");
		
		st=cn.createStatement();
		System.out.println("Statement created!");
		
		
	}
}
