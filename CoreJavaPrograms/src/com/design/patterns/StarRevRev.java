package com.design.patterns;

import java.util.Scanner;

public class StarRevRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=2;j<=i;j++) {
    		   System.out.print("  ");
    	   }
    	   for(int k=n;k>=i;k--) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
       }
	}

}

