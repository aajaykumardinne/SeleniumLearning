package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		// 1.FF Browser
		// Geckodriver
		
	//	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver(); // Launch Firefox browser 
		
		
		////  WebDriver is the interface and chromedriver is the class
		
		//// driver is the object reference name representing chromedriver object
		
		// 2.chrome browser 
		// Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Launch Chrome  
		// Chrome driver class is implemented in web driver interface 
		
		
		driver.get("http://www.google.com");   // enter URL
		
		
		String title = driver.getTitle();  // get title 
		
		System.out.println(title);
		
	
		
		// validation point 
		
		if (title.equals("Google")) {
			System.out.println("correct title");
		}
		
		else {
			System.out.println("incorrect title");
		
		}
		
		System.out.println(driver.getCurrentUrl());
		
	// 	System.out.println(driver.getPageSource());
		
		driver.quit();  // quit the browser

	}

}
