package com.sachin;


import java.sql.*;


public class DemoJdbcEx {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/abc";
		String uname = "root";
		String pass = "Srk9620522075";
		String query = "insert into students values(4,'Mohini');";
 		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		
		System.out.println(rs + " row/s affected");
		
		st.close();
		con.close();

	}

}
