package com.num.programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String yn;
		// TODO Auto-generated method stub
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the second number");
		int num2= sc.nextInt();
		System.out.println("Enter one of these + - * / %");
		String sym = sc.next();
		
		switch(sym) {
		case "+":
			System.out.println(" addition of two numbers is "+(num1+num2));
			break;
			
		case "*":
			System.out.println(" Multiplication of two numbers is "+(num1*num2));
			break;
			
		case "-":
			System.out.println(" subtraction of two numbers is "+(num1-num2));
			break;
			
		case "/":
			System.out.println(" divison of two numbers is "+(num1/num2));
			break;
			
		case "%":
			System.out.println(" percentile of two numbers is "+(num1%num2));
			break;
		
		default:
			System.out.println("please type valid symbol");
			break;
		}
		System.out.println();
		System.out.println("if u want to continue type y");
		yn=sc.next();
		}while(yn.equals("y")|| yn.equals("Y"));
	}

}
