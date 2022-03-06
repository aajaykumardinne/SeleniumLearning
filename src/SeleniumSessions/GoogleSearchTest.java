package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies();  // delete all the cookies
		
		// dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");  // enter the URL
		
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		
		
		
		// doubts 

	}

}
