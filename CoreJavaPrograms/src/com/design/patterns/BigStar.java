package com.design.patterns;

import java.util.Scanner;

public class BigStar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			
			for(int b=2;b<=i;b++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		for (int i = 1; i <= n; i++) {
			for (int l = 1; l <= i; l++) {
				System.out.print("  ");
			}
			for (int m = n - 1; m >= i; m--) {
				System.out.print("* ");
			}
			for(int a=n-2;a>=i;a--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
