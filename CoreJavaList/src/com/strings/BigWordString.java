package com.strings;

public class BigWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s= " Developer Java";
     String s1[]= s.split(" ");
     String temp = null;
     
     if(s1[0].length() > s1[1].length()) {
    	 temp=s1[0];
     }
     if(s1[1].length() > s1[0].length()) {
    	 temp=s1[1];
     }
     if(temp!=null) {
    	 System.out.println("The Biggest word is "+temp);
     }else {
    	 System.out.println("There are many words with same size");
     }
    		 
	}

}
