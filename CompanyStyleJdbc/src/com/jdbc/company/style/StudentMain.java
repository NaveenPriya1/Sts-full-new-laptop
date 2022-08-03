package com.jdbc.company.style;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Curd operations");
		
		while (true) {

			System.out.println("select 1.insert 2.update 3.retrive 4.delete 5.exit");
			System.out.println("write your choice here");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				StudentDao sd= new StudentDao();
				int row=sd.insert();
				if(row !=0)
					System.out.println(row+" row inseted successfully \n");
				else
					System.out.println(" not inserted \n");
				
				break;
				
			case 2:
				StudentDao sdu= new StudentDao();
				int rowu=sdu.update();
				if(rowu !=0)
					System.out.println(rowu+" rows Updated \n");
				else
					System.out.println("not updated");
				break;
				
			case 3:
				StudentDao sd1= new StudentDao();
				sd1.retrive();
				break;
				
			case 4:
				StudentDao sd2= new StudentDao();
				int row1=sd2.delete();
				if(row1 !=0)
					System.out.println(row1+" rows deleted successfully \n");
				else 
					System.out.println(" not deleted");
				break;
			
			case 5:
				System.out.println("Bye Bye");
				System.exit(0);
				break;
				
			default:
					System.out.println("Please choose the correct option");
					break;
			

			}
		}
	}

}
