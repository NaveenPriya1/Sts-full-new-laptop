package com.num.programs;

import java.util.Scanner;

public class FibonachiRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = sc.nextInt();
		
		int a=0,b=1,c=0;
		System.out.print("Fionachi series upto range is ");
		System.out.print(a+" "+b);
		for(int i =1;i<=range;i++) {
			c=a+b;
			if(c<range) {
				System.out.print(" "+c);
			    a=b;
			    b=c;
			}
		}

	}

}
