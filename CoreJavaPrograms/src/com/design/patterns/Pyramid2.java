package com.design.patterns;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}

}
