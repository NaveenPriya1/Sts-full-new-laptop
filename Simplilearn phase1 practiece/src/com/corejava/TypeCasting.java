package com.corejava;

public class TypeCasting {
	
	 static public void main(String[] args) {
		//implicit type casting
		System.out.println("implicit type casting");
		char a='A';
		System.out.println("value of a is "+a);
		int b=a;
		System.out.println("value of b is "+b);
		float c=b;
		System.out.println("value of c is "+c);
		double d=a;
		System.out.println("value of d is "+d);
		long e=a;
		System.out.println("value of e is "+e);
		
		System.out.println("\n");
		
		//Explicit typecasting
		System.out.println("***********************");
		System.out.println("Explicit typecasting");
		
		double j=45.5;
		System.out.println("value of j is "+j);
		int k=(int) j;
		System.out.println("value of k is "+k);
		
	}

}
