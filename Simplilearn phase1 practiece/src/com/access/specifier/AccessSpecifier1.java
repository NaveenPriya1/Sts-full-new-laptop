package com.access.specifier;

//default access Specifier
class deafultAcc{
	void display(){
		System.out.println("default access Specifier");
	}
}
public class AccessSpecifier1 {
	
	public static void main(String[] args) {
		deafultAcc as = new deafultAcc();
		
		as.display();
	}


		
	}

