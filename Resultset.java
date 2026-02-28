package Jdbc;

import java.sql.*;
public class Resultset {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="";
		
		Connection cn=DriverManager.getConnection(url, username, password);
		System.out.println("hello");
		
		Statement st=cn.createStatement();
		
		String fetch="select * from student1";
		ResultSet rs=st.executeQuery(fetch);
		
		System.out.println("Resultset interface execute the query");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"---"+
			rs.getString(2)+"---"+
			rs.getString(3));
			
		}
		System.out.println("data retrive success");
		rs.close();
		st.close();
		cn.close();
	}

}
