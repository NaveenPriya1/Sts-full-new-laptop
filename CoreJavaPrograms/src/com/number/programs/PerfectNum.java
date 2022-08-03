//Perfect number, a positive integer that is equal to the sum of its proper 
//divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.

package com.number.programs;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=1;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(n==sum)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}

}
