package com.strings;

public class SplitLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I want to be a Billionaire";
		String s2[] = s1.split(" ");
		
		//to see char at
		System.out.println(s1.charAt(3));
		
		//to see split length
		for(int i=0;i<s2.length;i++) {
		   System.out.println(s2[i].length());
		
		
		}

	}

}
