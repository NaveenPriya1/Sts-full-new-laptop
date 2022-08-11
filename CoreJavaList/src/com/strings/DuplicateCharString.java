package com.strings;

public class DuplicateCharString {
	
	public static void main(String[] args) {
	String s = "Hi Naveen Hi";
	String s1=s.toUpperCase();
	
	char s3[]=s1.toCharArray();
	for(int i=0;i<s3.length;i++) {
		for(int j=i+1;j<s.length();j++) {
			if(s3[i]==s3[j] && s3[i]!=' ') {
				System.out.println("duplicate character "+s3[j]);
			}
		}
	}
	

}
}