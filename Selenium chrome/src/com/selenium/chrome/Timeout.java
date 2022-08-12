package com.selenium.chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	       
	       System.setProperty("webdriver.chrome.driver", path);
	       
	       //initiate chrome driver
	       
	       WebDriver driver = new ChromeDriver();
	       
	       //setting up the path
	       String base_url="https://www.facebook.com/";
	       
	       //launching facebook
	       driver.get(base_url);
	       
	       //implicitly time out
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       //pageload timeout
	       driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	       
	       //set script timeout
	       driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	       
	       driver.close();
	}

}
