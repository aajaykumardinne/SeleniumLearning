package ConceptsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // time for the page loading
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://naveenautomationlabs.com/");
		
		clickOn(driver,driver.findElement(By.xpath("//a[text()='Schedule Meeting with Naveen']//parent::li[@id='menu-item-2085']")),20);

	}
	
	public static void clickOn(WebDriver driver,WebElement locator, int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
