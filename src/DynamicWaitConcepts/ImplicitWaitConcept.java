package DynamicWaitConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	// Revised
	public static void main(String[] args) {

		// Implicit wait is the waiting time for all the elements.

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome

		driver.get("https://www.freshworks.com/");

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // time for page loading
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // putting a wait for all the elements
	}

}
