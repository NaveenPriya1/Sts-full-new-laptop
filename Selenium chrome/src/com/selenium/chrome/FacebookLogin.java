package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//path to chrome driver
	       String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	       
	       System.setProperty("webdriver.chrome.driver", path);
	       
	       //initiate chrome driver
	       
	       WebDriver driver = new ChromeDriver();
	       
	       //setting up the path
	       String base_url="https://www.facebook.com/";
	       
	       //launching facebook
	       driver.get(base_url);
	       
	       // fing elements from web page
	       WebElement email=driver.findElement(By.id("email"));
	       System.out.println(email.getAttribute("placeholder"));
	       
	       WebElement password=driver.findElement(By.id("pass"));
	       System.out.println(password.getAttribute("placeholder"));
	       
	       email.sendKeys("96425025771");
	       password.sendKeys("Naveen@1");
	       
	       WebElement login=driver.findElement(By.name("login"));
	       login.click();
	       
	      
	       try {
	    	  
	       WebElement linktest1= driver.findElement(By.linkText("Forgotten password?"));
	       linktest1.click();
	       }catch(Exception e) {
	    	   System.out.println(e);
	       }
	       
	       finally {
	       driver.close();
	       }
	       
	       
	}

}
