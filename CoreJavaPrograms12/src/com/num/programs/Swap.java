//Swap using Third variable

package com.num.programs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for i");
           int i = sc.nextInt();
           System.out.println("Enter the value for j");
           int j = sc.nextInt();
           int k;
           k=i;
           i=j;
           j=k;
           System.out.println("i = "+i);
           System.out.println("j = "+j);
	}

}
