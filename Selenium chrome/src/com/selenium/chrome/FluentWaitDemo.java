package com.selenium.chrome;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path to chrome driver
	       String path="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	       
	       System.setProperty("webdriver.chrome.driver", path);
	       
	       //initiate chrome driver
	       
	       WebDriver driver = new ChromeDriver();
	       
	       //setting up the path
	       String base_url="http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html";
	       
	       //launching facebook
	       driver.get(base_url);
	       
	       driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
	       
	       FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
	    		   .withTimeout(30, TimeUnit.SECONDS)
	    		   .pollingEvery(5, TimeUnit.SECONDS)
	    		   .ignoring(NoSuchElementException.class);
	       
	     
	       WebElement element=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				WebElement element=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				String getTextOnPage=element.getText();
				
				if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
					
					System.err.println(getTextOnPage);
					return element;
				}else {
					System.out.println("Fluent wait failed");
				}
				
				return null;
			}
	    	   
	       });
	}

}
