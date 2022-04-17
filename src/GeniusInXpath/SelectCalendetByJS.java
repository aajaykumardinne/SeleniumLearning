package GeniusInXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendetByJS {

	// Revised
	public static void main(String[] args) {

		// Calender handle/date-picker Using the JavascriptExecutor Concept.
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome browser

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.airindia.in/"); // open the url

		WebElement date = driver.findElement(By.id("_depdateeu1"));
		String dateVal = "25-05-2022";

		selectdateByJs(driver, date, dateVal);

	}

	public static void selectdateByJs(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');", element);

	}
}
