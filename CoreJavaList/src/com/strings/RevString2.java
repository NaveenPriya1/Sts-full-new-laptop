package com.strings;

public class RevString2 {

	// reverse String Without using built in method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "Hussain";
		
		int size = s.length();
		
		String rev = "";
		
		for (int i=size-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
       System.out.println(rev);
	}

}
