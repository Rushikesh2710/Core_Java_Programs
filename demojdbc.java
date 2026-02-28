package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demojdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. Jdbc driver loaded");
		
		
		String url="jdbc:mysql://localhost:3306/comapany";
		String username="root";
		String password="";
		
		Connection cn=DriverManager.getConnection(url, username, password);
		System.out.println("2.connection sucess");
		
		Statement st=cn.createStatement();
		System.out.println("3.statement created successfully!");
		
//		String query="create table login1 (username varchar(50), password varchar(40))";
//		st.execute(query);
		
		String query="Insert into login1 values(\"sham\",\"sham@123\")";
		st.execute(query);
		System.out.println("4.query execution done!");
		cn.close();
		System.out.println("5.connection close!");
	}
	
	
}
