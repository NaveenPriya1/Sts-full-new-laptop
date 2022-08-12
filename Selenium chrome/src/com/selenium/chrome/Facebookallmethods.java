package com.selenium.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookallmethods {
	public static void main(String[] args) {
		//path to chrome driver
	       String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	       
	       System.setProperty("webdriver.chrome.driver", path);
	       
	       //initiate chrome driver
	       
	       WebDriver driver = new ChromeDriver();
	       
	       //setting up the path
	       String base_url="https://www.facebook.com/";
	       
	       //launching facebook
	       driver.get(base_url);
	       
	       //element by id
	       WebElement idemail=driver.findElement(By.id("email"));
	       System.out.println(idemail.getAttribute("placeholder"));
	       
	       //find by name
	       WebElement nameemail=driver.findElement(By.name("email"));
	       System.out.println(nameemail.getAttribute("placeholder"));
	       
	       //find by xpath
	       WebElement xpathemail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	       System.out.println(xpathemail.getAttribute("placeholder"));
	       
	       //findby fullxpath
	       WebElement fullxapathemail=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	       System.out.println(fullxapathemail.getAttribute("placeholder"));
	       
	       //by css selector
	       WebElement cssselemail=driver.findElement(By.cssSelector("#email"));
	       System.out.println(cssselemail.getAttribute("placeholder"));
	       
	       
	       //list of web elements
	       List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));
	       for(WebElement l:list) {
	    	   System.out.println(l.getAttribute("placeholder"));
	       }
	     
	       
	       //tag and attribute
	       WebElement pass=driver.findElement(By.cssSelector("input[name=pass]"));
	       System.out.println(pass.getAttribute("placeholder"));
	       driver.close();
	}

}
