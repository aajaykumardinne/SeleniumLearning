package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();  // Launch Chrome browser
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // global wait --- for all the pages
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // for all the elements -- global wait
		
		
		driver.get("https://classic.freecrm.com/");
		
		
		WebElement username = driver.findElement(By.name("username"));
		
		
		username.sendKeys("aajaykumardinne");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("Meat@2050");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
