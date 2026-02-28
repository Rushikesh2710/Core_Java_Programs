package Jdbc;
import java.util.*;
import java.sql.*;
public class userinsert extends setup{
	void insert() throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the student name:");
		String name=sc.next();
		
		System.out.println("Enter the student Roll no:");
		int rollno=sc.nextInt();
		
		System.out.println("Enter the student class:");
		String class1=sc.next();
		
		String query="insert into student values(?,?,?)";
		
		PreparedStatement st=cn.prepareStatement(query);
		
		st.setString(1, name);
		st.setInt(2, rollno);
		st.setString(3, class1);
		
		st.executeUpdate();
		sc.close();
	}
	void close() throws SQLException {
		
		cn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		userinsert obj=new userinsert();
		obj.dbsetup();
		obj.insert();
		obj.close();
	}
}
