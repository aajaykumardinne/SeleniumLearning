package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://classic.freecrm.com/register/");
		
		
		// 1.isDisplayed() method: applicable for all the elements
		
	   boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); // for submit button
	   System.out.println(b1);  // true
	   
	   // 2.isEnabled() method:
	   
	   boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
	   System.out.println(b2); // false
	   
	   // Select I agree checkbox:
	   
	   driver.findElement(By.name("agreeTerms")).click();  // --submit button is enabled now
	   boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
	   System.out.println(b3);  // true
	   
	   // 3. isSelected() method: applicable for only checkbox, dropdown , radiobutton
	   
	   
	   boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
	   System.out.println(b4); // true
	   
	   // de-select the checkbox
	   
	   driver.findElement(By.name("agreeTerms")).click(); 

	   boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
	   System.out.println(b5); // false
	   
	   
	   
	}

}
