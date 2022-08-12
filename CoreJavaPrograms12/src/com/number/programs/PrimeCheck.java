package com.number.programs;

public class PrimeCheck {

		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("enter number");
			int n = sc.nextInt();
			int i;
			if (n == 1) 
				System.out.println("Prime starts from 2");
			
			for (i = 2; i < n; i++) {
				if (n % i == 0)
					System.out.println("not a prime");
				if (n == i)
					System.out.println("prime");
				break;
				
			}}}
	