package com.number.programs;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
			
		}

	}

}
