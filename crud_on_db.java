package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crud_on_db {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("hello");
		
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="";
		
		Connection cn=DriverManager.getConnection(url, username, password);
		
		Statement st=cn.createStatement();
		
		String query="create table student ( name varchar(40) , rollno int , class varchar(30))";
		st.execute(query);
		
		cn.close();
		
	}
}
