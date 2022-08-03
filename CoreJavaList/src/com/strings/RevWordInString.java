package com.strings;

public class RevWordInString {
  
	// To reverse a word in a String
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "run time call";
		String rev = "";
		String temp=null;
		
		String s[]= s1.split(" ");
		
		if(s[0].equals("run")) {
			for(int i=s[0].length()-1;i>=0;i--) {
				rev = rev+s[0].charAt(i);
			}
			temp=rev+" "+s[1]+" "+s[2];
			
		}
		
		if(s[1].equals("run")) {
			for(int i=s[1].length()-1;i>=0;i--) {
				rev = rev+s[1].charAt(i);
			}
			temp=s[0]+" "+rev+" "+s[2];
			
		}
		
		if(s[2].equals("run")) {
			for(int i=s[2].length()-1;i>=0;i--) {
				rev = rev+s[2].charAt(i);
			}
			temp=s[0]+" "+s[1]+" "+rev;
			
		}
		
		System.out.println(temp);

	}

}
