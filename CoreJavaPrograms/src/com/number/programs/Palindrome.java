package com.number.programs;

import java.util.Scanner;

class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp=n;
		int rev=0;
		
		while(temp!=0) {
			
			rev=rev*10+(temp%10);
			temp=temp/10;
		}
		if(n==rev)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
	}
}