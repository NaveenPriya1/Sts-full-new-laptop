package com.number.pattern;

import java.util.Scanner;

public class NumberPatternrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 != 0) {
				for (int j = 1; j <= 3; j++) {
					//count = count+1;
					System.out.print(++count+" ");

				}

			}else {
				int temp = count + 1;
				for (int j = count + 3; j >= temp; j--) {
					count+=1;
					System.out.print(j+" ");

				}}
				System.out.println();
			}
		}
	}


