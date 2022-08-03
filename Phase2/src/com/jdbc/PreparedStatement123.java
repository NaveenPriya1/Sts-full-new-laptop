package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement123 {
	
	public static final String DB_URL="jdbc:mysql://localhost:3306/db";
	public static final String USERNAME="root";
	public static final String PASSWORD="abcd";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
      if(con != null)
    	  System.out.println(con+" \n connection established");
      else
    	  System.out.println("connection not established");
      
      Student s = new Student();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter student id");
      s.setSid(sc.nextInt());
      System.out.println("Enter student name");
      s.setSname(sc.next());
      System.out.println("Enter student email");
      s.setSemail(sc.next());
      
      String sql = "insert into student values(?,?,?)";
      PreparedStatement ps= con.prepareStatement(sql);
      ps.setInt(1, s.getSid());
      ps.setString(2, s.getSname() );
      ps.setString(3, s.getSemail());
      int row=ps.executeUpdate();
      
      String sql2= "select * from student";
      PreparedStatement ps1= con.prepareStatement(sql2);
      ResultSet rs = ps1.executeQuery();
      
      while(rs.next()) {
    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
      }
      con.close();
      ps.close();
      ps1.close();
       
 
	}

}
