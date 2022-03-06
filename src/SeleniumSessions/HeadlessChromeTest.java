package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		
		// Mandatory:
		// 1. Chrome version should be greater than 59 on mac and greater than 60 on windows.
		// 2. window size = 1400,800
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		WebDriver driver = new ChromeDriver(options);  // Launch Chrome  
		

		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://classic.freecrm.com"); // enter the URL
		
		System.out.println("Login page title:==="+driver.getTitle());
		
		
		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Home Page Title:===" +driver.getTitle());

	}

}
