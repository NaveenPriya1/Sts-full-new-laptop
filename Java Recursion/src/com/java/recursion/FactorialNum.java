package com.java.recursion;

import java.util.Scanner;

public class FactorialNum {
	
	 int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		FactorialNum fn= new FactorialNum();
		int x =fn.fact(n);
		System.out.println(x);

	}

}
