package GeniusInXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		// Revised
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies();  // delete all the cookies
		
		
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://www.vtiger.com/");  // enter the URL
		
		
		// 1. get the total count of links on the page
		// 2. get the text of each link on the page
		
		// all the links are represented by <a> hmtl tag
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		// size of linklist
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size() ; i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
//		how to access the ArrayList elements by get method
		
		
		
	}

}
