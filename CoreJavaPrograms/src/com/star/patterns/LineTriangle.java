package com.star.patterns;

import java.util.Scanner;

public class LineTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				if(i==j)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int k=2;k<(i*2);k++) {
				if(i>=2 && k<(i*2)-1)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
