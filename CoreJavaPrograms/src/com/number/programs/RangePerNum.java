package com.number.programs;

import java.util.Scanner;

public class RangePerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n = sc.nextInt();
     
      for(int i=1;i<=n;i++) {
    	  int sum = 1;
    	  for(int j=2;j<=i/2;j++) {
    		  if(i%j==0)
    			  sum+=j;
    	  }
    	  if(sum==i)
    	  System.out.println(i+" is a perfect number");
      }
	}

}
