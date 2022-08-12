package com.number.programs;

import java.util.Scanner;

public class RangeFact {
	
	public static int facto(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
		
	}
	
//	static int facto(int num) {
//		int fact=1;
//		while(num>0) {
//			fact*=num;
//			num--;
//		}
//		return fact;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
        	System.out.println(i+"!----->"+facto(i));
        }
	}

}
