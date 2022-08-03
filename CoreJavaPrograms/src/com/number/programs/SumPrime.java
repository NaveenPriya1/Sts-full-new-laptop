package com.number.programs;

import java.util.Scanner;

public class SumPrime {
	
	public static boolean isPrime(int num) {
		
		if(num==1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum=0;
		
		for(int j=1;j<=n;j++) {
			if(isPrime(j))
				sum+=j;
		}
		System.out.println(sum);

	}

}
