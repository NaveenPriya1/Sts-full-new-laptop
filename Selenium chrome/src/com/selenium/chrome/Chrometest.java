package com.selenium.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare the path
		String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		
		//Initiate driver
		WebDriver driver = new ChromeDriver();
		
		//step2 base url
		
		String base_url="https://www.google.com/";
		
		//step 3 launching google chrome
		driver.get(base_url);
		
		driver.close();
		
		
	}

}
