package com.design.patterns;

import java.util.Scanner;

public class StarPyramidRev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n+5;k>(i*2);k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
