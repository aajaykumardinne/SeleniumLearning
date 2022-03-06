package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTest {
	WebDriver driver = null;
	
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}	
		
		
	@Test
	public void searchTest() {
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptops");
		
		driver.findElement(By.xpath("//*[@id='gh-cat']")).sendKeys("Books");
		
		driver.findElement(By.xpath("// input[@type = 'submit']")).click();
		
		
		
	}
	
		
	@AfterMethod
	public void teardown() {
	
		driver.quit();
		
	}
		
	}
	


