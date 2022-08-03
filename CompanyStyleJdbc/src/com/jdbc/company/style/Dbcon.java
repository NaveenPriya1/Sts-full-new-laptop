package com.jdbc.company.style;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbcon {
	
	public static final String DB_URL="jdbc:mysql://localhost:3306/db";
	public static final String USERNAME="root";
	public static final String PASSWORD="abcd";
	
	public static Connection dbConn() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		
		return con;
		
	}
	

}
