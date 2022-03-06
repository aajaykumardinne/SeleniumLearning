package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Launch Chrome
		
		driver.manage().window().maximize();  // maximize window
		driver.manage().deleteAllCookies();  // delete all the cookies
		
		
		driver.get("https://www.spicejet.com/");
		
		
		Actions action = new Actions(driver);
		

		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("International Connection Baggage")).click();
		
		
	}

}
