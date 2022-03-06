package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
		
		driver.navigate().to("https://www.amazon.in/");
		
		
		// // navigates to the different external site by navigate().to method
		// navigate() and navigate().to are used to launch the url of the website.
		
		
		driver.navigate().back();  // click on back button 
		
		Thread.sleep(2000);
		
		
		driver.navigate().forward(); // click on the forward button
		
		Thread.sleep(2000);
		
		driver.navigate().back(); // click on the forward button
		
		
		driver.navigate().refresh();  // refresh the page
		

	}

}
