package com.number.pattern;

import java.util.Scanner;

public class NumPat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				//count+=1;
				System.out.print(++count);
			}
			System.out.println();
		}
	}

}
