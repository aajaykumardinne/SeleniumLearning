package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies();  // delete all the cookies
		
		// dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'ui uiiiiiii')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
		
			
		
		
		
		
		
		
	}

}
