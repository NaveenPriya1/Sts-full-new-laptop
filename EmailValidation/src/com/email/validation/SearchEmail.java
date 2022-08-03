package com.email.validation;

import java.util.ArrayList;

public class SearchEmail {

	 public static void main(String[] args) {
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("simon.hasler@gmx.com");
	        emailID.add("leonie.klein@gmx.com");
	        emailID.add("lea.hoch@gmx.com");
	        emailID.add("max.neumann@gmx.com");
	        emailID.add("henrik.fiesler@gmx.com");
	        emailID.add("laura.kramm@gmx.com");
	        emailID.add("sabine.neuwirth@gmx.com");
	        
	   
	        String searcElement = "simon.hasler@gmx.com";
	        
	                for(int i=0; i<emailID.size(); i++) {
	                    
	                    System.out.println(emailID.get(i));
	                    
	                    if(searcElement==emailID.get(i)) {
	                        
	                        System.out.println("\n");
	                        System.out.println("email ID " + searcElement + " is found");
	                        
	                        break;
	                        
	                    }
	                }

	    }
	
}
