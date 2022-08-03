package com.access.specifier;

public class Main {
	
	public static void main(String[] args) {
		//public
		PublicAccsSpecifier pc = new PublicAccsSpecifier();
		pc.display();
		
		//private
		PrivateAccSpe ps= new PrivateAccSpe();
		//ps.display();
		//its not gonna work
		
		ProtectedAccSpe pca = new ProtectedAccSpe();
		pca.display();
	}

}
