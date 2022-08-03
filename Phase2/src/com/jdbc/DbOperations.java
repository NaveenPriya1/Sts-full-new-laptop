package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperations {
	
	public static final String DB_URL ="jdbc:mysql://localhost:3306/db";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "abcd";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//registering driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establishing connection
		Connection con=DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        
		if(con != null)
			System.out.println(con+" \n connection Established");
		else
			System.out.println(" connection not Established");
	
	         //prepare a sql statement --> stsement prepared statement
             String sql = "insert into student values(222,'madhu','madhu@gmail.com')";
             String sql2 = "update student set sname='ramu' where sid=222";
             String sql3 = "delete from student where sid=222";
             
             Statement sts = con.createStatement();
             
             //for insert,update,delete
	            int row= sts.executeUpdate(sql);//returns rows effected
	            if(row !=0)
	            	System.out.println(row+" rows inserted successfully");
	            else
	            	System.out.println(" not inserted");
	            
	            sts.close();
	            con.close();
	
	}

}
