package com.star.patterns;

import java.util.Scanner;

public class CrossLine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i>=2 && k>1) 
					System.out.print(" ");
				
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
