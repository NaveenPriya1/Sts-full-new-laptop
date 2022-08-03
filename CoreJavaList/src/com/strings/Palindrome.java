package com.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Word");
		String s1 = sc.next();
		//to lowercase
		String str=s1.toLowerCase();

		int j = str.length() - 1;
		int size = str.length()-1;

		for (int i = 0; i <= size; i++) {
			if (str.charAt(i) == str.charAt(j)) {
				   --j;
				if (i == size) {
					System.out.println(s1 + " is a palindrome");
				}
			}else {
	    		   System.out.println(s1+" is not a palindrome");
	    		   break;
	    	   }

		}
	}
}
