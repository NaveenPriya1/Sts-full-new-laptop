package com.number.programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int n = sc.nextInt();
		 int count = 0;
		 
		 for(int i=1;i<=n;i++) {
			 if(n%i==0)
				 count+=1;
		 }
		 if(count==2)
			 System.out.println("The number "+n+" is Prime");
		 else
			 System.out.println("The number "+n+" is Not a Prime");
	}

}
