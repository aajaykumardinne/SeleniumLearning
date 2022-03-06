package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelPopUp {

	public static void main(String[] args) {


		
	    System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@name='username' and @type = 'text']")).sendKeys("aajaykumardinne");
		driver.findElement(By.xpath("//input[@name='username' and @type = 'text']")).sendKeys("Meat@2050");
		
		
		driver.switchTo().frame("intercom-launcher-frame");
		
		
		driver.findElement(By.xpath("input[@value='Login' and @type = 'submit']")).click();
		
		
		// Doubts
		
		
		
		
	}

}
