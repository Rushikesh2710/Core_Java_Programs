package Jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class operation extends setup{
	void delete() throws SQLException {
		String del="delete from student where name=?";
		
		PreparedStatement ps=cn.prepareStatement(del);
		
		ps.setString(1, "Rushi");
		ps.executeUpdate();
	
	}
	
	void update() throws SQLException {
		String update="update student set name=? where rollno=?";
		PreparedStatement ps=cn.prepareStatement(update);
		ps.setString(1, "ram");
		ps.setInt(2, 101);
		
		ps.executeUpdate();
	}
	void close() throws SQLException {
		cn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		operation obj=new operation();
		obj.dbsetup();
		obj.delete();
		obj.update();
		obj.close();
	}
}
