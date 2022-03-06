package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Launch Chrome
		
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		driver.manage().window().maximize();  // maximize window
		driver.manage().deleteAllCookies();  // delete all the cookies
		
		Actions action = new Actions(driver);
		
		WebElement rigthClickButton = driver.findElement(By.cssSelector(".context-menu-one"));
		
		action.contextClick(rigthClickButton).
		build().
		perform();
		
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		
		
		String copyText = copy.getText();
		
		
		System.out.println(copyText);
		
		
		copy.click();
		
		
		
		

	}

}
