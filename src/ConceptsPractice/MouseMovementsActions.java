package ConceptsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementsActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("https://www.toolsqa.com/");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']"))).build()
				.perform();

		Thread.sleep(3000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath(
				"//div[@class='first-generation']//ul//li//div//child::span[text()='Back-End Testing Automation']")))
				.build().perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='first-generation']//ul//li//a[text()='Postman']")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
