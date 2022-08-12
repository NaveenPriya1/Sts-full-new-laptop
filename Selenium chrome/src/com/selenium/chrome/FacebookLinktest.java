package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	       
	       System.setProperty("webdriver.chrome.driver", path);
	       
	       //initiate chrome driver
	       
	       WebDriver driver = new ChromeDriver();
	       
	       //setting up the path
	       String base_url="https://www.facebook.com/";
	       
	       driver.get(base_url);
	       
	       //find by link test
	       WebElement linktest1= driver.findElement(By.linkText("Forgotten password?"));
	       linktest1.click();
	}

}
