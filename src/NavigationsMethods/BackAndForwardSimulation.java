package NavigationsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardSimulation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Launch Chrome
		
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.rediff.com/"); 
		
		System.out.println(driver.getTitle());
		
		// // navigates to the different external site by navigate().to method
		// navigate() and navigate().to are used to launch the url of the website.
		
		driver.navigate().back(); // click on back button 
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward(); // click on forward button
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		

		driver.navigate().back(); // click on back button
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		driver.navigate().refresh(); // refresh the  page

	}

}
