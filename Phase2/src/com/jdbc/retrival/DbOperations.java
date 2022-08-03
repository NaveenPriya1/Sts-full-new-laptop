package com.jdbc.retrival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbOperations {
	
	public static final String DB_URL="jdbc:mysql://localhost:3306/db";
	public static final String USERNAME="root";
	public static final String PASSWORD="abcd";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establishing Connection
     Connection con =DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        if(con != null)
        	System.out.println(con+" \n connection established");
        else
        	System.out.println(" connection not Established");
         
        Student s = new Student();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id");
        s.setSid(sc.nextInt());
        
        System.out.println("Enter the student name");
        s.setSname(sc.next());
        System.out.println("Enter the Student Email");
        s.setSemail(sc.next());
        
        //preparing sql statement
        String sql="select * from student";
        String sql1="insert into student values("+s.getSid()+",'"+s.getSname()+"','"+s.getSemail()+"')";
        Statement st = con.createStatement();
        
        int row=st.executeUpdate(sql1);
        
        //Retrieve Executequiery
        ResultSet rs = st.executeQuery(sql);
        //rs has the reference of the table
        
        while(rs.next()) {//next boolean here
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        
        st.close();
        con.close();
        rs.close();
        
	}

}
