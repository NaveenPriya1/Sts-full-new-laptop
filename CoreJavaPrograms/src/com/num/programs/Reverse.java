package com.num.programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		
		while(temp!=0) {
			
			rev=rev*10+(temp%10);
			temp=temp/10;
		}
      System.out.println(rev);
	}

}
