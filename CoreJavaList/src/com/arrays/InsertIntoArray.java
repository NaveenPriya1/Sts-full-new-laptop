package com.arrays;

import java.util.Scanner;

public class InsertIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the lengthof array");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		//to insert into array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" element of array");
			
			arr[i] =sc.nextInt();
		}
		//to print array
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]----> "+arr[i]);
		}
       
	}

}
