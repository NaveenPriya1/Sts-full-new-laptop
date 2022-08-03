package com.strings;

public class PalindromeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		int count = 0;
		
		int j = s.length()-1;
		
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(j--))
				++count;
		}
		
		if(count==s.length()) 
			System.out.println(s+" is a Palindrome");
		else 
			System.out.println(s+" is not a palindrome");
			
	}

}
