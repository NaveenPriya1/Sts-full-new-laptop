//Swap with out using third variable


package com.num.programs;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i = 10;
          int j = 30;
          i=i+j;
          j=i-j;
          i=i-j;
          System.out.println("i = "+i);
          System.out.println("j = "+j);
	}

}
