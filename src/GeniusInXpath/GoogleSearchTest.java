package GeniusInXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		// Revised
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in"); // enter the URL

		driver.findElement(By.name("q")).sendKeys("Selenium with Java");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='wM6W7d']"));
		
		System.out.println("Total number of suggestions in the search box: " +list.size());
		
		for(int i=0; i<list.size() ;i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("selenium with java pdf")) {
				list.get(i).click();
			}
		}



	}

}
