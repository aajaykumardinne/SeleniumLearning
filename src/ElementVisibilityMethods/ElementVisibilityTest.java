package ElementVisibilityMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	// Revised
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://api.cogmento.com/register/");

		// 1.isDisplayed() method: applicable for all the elements
		// for a particular web element is present on the web page or not.

		boolean b1 = driver.findElement(By.name("action")).isDisplayed(); // for signup button
		System.out.println(b1); 

		// 2.isEnabled() method:
		// verfies an element or the button is enabled on the web page or not.
		boolean b2 = driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2); 

		// 3. isSelected() method: applicable for only checkbox, dropdown , radiobutton
		
		// Select  checkbox I agree to the terms and conditions
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		
		boolean b3 = driver.findElement(By.xpath("//input[@name='terms']")).isSelected();
		System.out.println(b3); 

		// de-select the checkbox
//
//		driver.findElement(By.xpath("//input[@name='terms']")).click();
//
//		boolean b5 = driver.findElement(By.xpath("//input[@name='terms']")).isSelected();
//		System.out.println(b5); 

	}

}
