package com.number.programs;

import java.util.Scanner;

public class PrimeNums {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the nUmber");
		int n = sc.nextInt();
		
		for(int i =2;i<=n;i++) {
			
			boolean isPrime=true;
			for(int j = 2;j<i; j++) {
				
				if(i%j==0)
					isPrime=false;
				break;
			}
			if(isPrime)
				System.out.print(i+" ");
		}

	}

}
