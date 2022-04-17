package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class ExtraLocators {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(new ByAll(By.name("firstname"), By.xpath("//input[@name='firstname']"))).sendKeys("Aajay");

	}

}



// doubts in the ByAll class