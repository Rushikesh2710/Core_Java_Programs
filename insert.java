package Jdbc;

import java.sql.SQLException;

public class insert extends setup {
	void query() throws SQLException {
		String ins="insert into student values ('Rushi',20,'first year');";
		st.execute(ins);
		System.out.println("query excuted");
		
	}
	void close() throws SQLException {
		cn.close();
		System.out.println("Connection closed!");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insert i=new insert();
		i.dbsetup();
		i.query();
		i.close();
	}
}
