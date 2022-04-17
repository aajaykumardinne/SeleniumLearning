package DynamicWaitConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	// Revised
	public static void main(String[] args) {

		// Explicit wait is the waiting time for specific element
		// Code only for the clicking the elements.
		// works for all the button,links and checkboxes.
		// does not work for the dropdown boxes

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // time for the page loading
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // putting a waiting time for all the elements.

//
//		driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.facebook.com/");
//		
//		clickOn(driver,driver.findElement(By.name("login")),20);  // login  button

		clickOn(driver, driver.findElement(By.xpath("//*[@id='reg_pages_msg']")), 20); // create a page link

//		driver.close(); // closes the current browser window 
//		
//		driver.quit(); // closes all the browsers windows which are open.

	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {

		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator)); 
		locator.click();

	}

}
