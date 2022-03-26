package DataProviderConceptInTestNg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ebayTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // launch the browser

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F"); // get the URL
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();

	}

	@Test(dataProvider="getTestData")
	public void ebayRegPageTest(String firstName, String lastName, String email) {

		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstName);

		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastName);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
