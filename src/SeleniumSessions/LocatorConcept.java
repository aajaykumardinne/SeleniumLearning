package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Launch Chrome
		
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		
		
		// Question ????: When you to use the particular locator when automating the particular web page to find the address
		// of the web element.
		
//		Answer>> Always per the id , name locator if the web page does not have both of them 
		// then move to the xpath and css selector/
		
		// 1. id: always unique --- I
	//	WebElement username = driver.findElement(By.id("login-username"));
	//	username.sendKeys("kumardinne@yahoo.com");
		
		
	//	WebElement nextBtn = driver.findElement(By.id("login-signin"));
	//	nextBtn.click();
	
	//	driver.findElement(By.id("login-username")).sendKeys("kumardinne@yahoo.com");
	//	driver.findElement(By.id("login-signin")).click();
		 
		 
		
		 // 2.name:always not unique -- I
		 
	//	driver.findElement(By.name("username")).sendKeys("kumardinne@yahoo.com");
	//	driver.findElement(By.name("signin")).click();
		 
		 
		 
		 // 3.xpath means extended html path , means address of any specific element -- II
		 
	//	 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kumardinne@yahoo.com");
	//	 driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		 
		 // 4.cssSelector  -- II
		 
	//	 driver.findElement(By.cssSelector("#login-username")).sendKeys("kumardinne@yahoo.com");
	//	 driver.findElement(By.cssSelector("#login-signin")).click();
		 
		 // 5.linkText : only for links - IV
		 
		// driver.findElement(By.linkText("Create an account")).click();
		// driver.findElement(By.linkText("Forgotten username?")).click();
		 
		 //6.partialLinkTest : only for links but not recommended  - V
		
//		driver.findElement(By.partialLinkText("Forgotten")).click();
	
//		 7.class name: is not unique -- IV
		driver.findElement(By.className("phone-no")).sendKeys("kumardinne@yahoo.com");
		 
		
//		8.Tag Name:
		 
		

	}

}
