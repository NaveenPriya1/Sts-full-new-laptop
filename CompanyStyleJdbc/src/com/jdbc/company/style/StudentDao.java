package com.jdbc.company.style;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDao {
	
	int insert() throws ClassNotFoundException, SQLException {
		Connection con = Dbcon.dbConn();
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student id");
		s.setSid(sc.nextInt());
		System.out.println("Enter the Student name");
		s.setSname(sc.next());
		System.out.println("Enter the Student mail");
		s.setSemail(sc.next());
		
		String str = "insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1, s.getSid());
		ps.setString(2, s.getSname());
		ps.setString(3, s.getSemail());
		int row=ps.executeUpdate();
		return row;
		}
	
	    public void retrive() throws ClassNotFoundException, SQLException {
	    	Connection con = Dbcon.dbConn();
	    	String str= "select * from student";
	    	PreparedStatement ps=con.prepareStatement(str);
	    	ResultSet rs=ps.executeQuery();
	    	
	    	while(rs.next()) {
	    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    		
	    	}
		
	   }
	    
	   public int delete() throws ClassNotFoundException, SQLException {
    		Connection con= Dbcon.dbConn();
    		Student s = new Student();
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter sis to delete");
    		s.setSid(sc.nextInt());
    		String str = "delete from student where sid=?";
    		PreparedStatement ps = con.prepareStatement(str);
    		ps.setInt(1, s.getSid());
    		int row=ps.executeUpdate();
    		return row;	
    	}
	   
	   
	   public int update() throws ClassNotFoundException, SQLException {
		   Connection con = Dbcon.dbConn();
		   Student s = new Student();
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the id which we want see changes");
		   s.setSid(sc.nextInt());
		   System.out.println("Enter the name to change");
		   s.setSname(sc.next());
		   String str = "update student set sname=? where sid=?";
		   PreparedStatement ps = con.prepareStatement(str);
		   ps.setString(1, s.getSname());
		   ps.setInt(2, s.getSid());
		   int row=ps.executeUpdate();
		   return row;
		   
	   }

}
