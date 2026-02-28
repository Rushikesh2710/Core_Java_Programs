package Jdbc;

import java.sql.*;
public class preaparestatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1.Driver loaded");
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="";
		
		Connection cn=DriverManager.getConnection(url, username, password);
		System.out.println("connection done!");
		
		String insert="insert into student values (?,?,?)";
		PreparedStatement ps=cn.prepareStatement(insert);
		System.out.println("Preapare statements created!");
		
		ps.setString(1,"ganesh");
		ps.setInt(2, 101);
		ps.setString(3, "Ty");
		
		ps.executeUpdate();
		System.out.println("query executed");
		
		cn.close();
		System.out.println("connection close!");
	}

}
