package com.selenium.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path to chrome driver
       String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
       
       System.setProperty("webdriver.chrome.driver", path);
       
       //initiate chrome driver
       
       WebDriver driver = new ChromeDriver();
       
       //setting up the path
       String base_url="https://www.google.com/";
       
       //expexted title
       String expectedTitle="Google";
       
       String actualTitle="";
       
       //launching driver
       driver.get(base_url);
       
       actualTitle=  driver.getTitle();
       
       if(expectedTitle.contentEquals(actualTitle))
    	   System.out.println("test case passed with title"+actualTitle);
       else
    	   System.out.println("Test case failed");
       
       driver.close();
       
	}

}
