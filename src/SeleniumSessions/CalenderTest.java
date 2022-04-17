package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch chrome

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		// new WebDriverWait(driver, Duration.ofSeconds(5))
		// .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

		// Doubts

	}

}
