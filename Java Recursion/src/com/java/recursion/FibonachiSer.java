package com.java.recursion;

import java.util.Scanner;

public class FibonachiSer {
	static int a=0,b=1,c;
	
	void fibo(int i) {
		if(i>1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibo(i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter u r number");
		int n=sc.nextInt();
		System.out.print(b);
		FibonachiSer fs= new FibonachiSer();
		fs.fibo(n);
	}

}
