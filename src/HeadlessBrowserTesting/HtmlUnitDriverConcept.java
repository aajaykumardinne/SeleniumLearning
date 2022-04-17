package HeadlessBrowserTesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitDriverConcept {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();  // Launch Chrome  

		// HtmlUnitDriver is not available in Selenium 3.x version
		// HtmlUnitDriver -- to use this concept we have to downlaod HtmlUnitDriver JAR
		// File

// Advantages

// 1. Testing is happening behind the scene.--- no browser launch
// 2. Very fast -- Execution of test cases -- Very Fast -- Performance of the script.
// 3. Not Suitable for Action Class -- user actions -- mouse movements , doubleClick , drag and drop 
// 4. Called as Ghost Driver --- Headless Browser ::
		// 1 . HtmlUnitDriver --- java
		// 2 .PhantomJs -- JavaScript

		WebDriver driver = new HtmlUnitDriver();

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com");

		System.out.println("Before login title is:===" + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

//		Thread.sleep(2000);

		System.out.println("After login title is:===" + driver.getTitle());
		

	}

}
