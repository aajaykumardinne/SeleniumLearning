package GeniusInXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		// Revised 
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/"); // enter the URL

		// absolute xpath: not recommended
		// Always use customize path and performance is very fast than the others.

		// Disadvantages of absolute xpath:
		// 1.Performance issue.
		// 2.Not Reliable.
		// 3.Can be changed at any time in the future.

		// Advantages of customize xpath:
		// 1.It is unique.
		// 2.Syntax is very simple.
		// 3.very fast
		// 4.No performance issues.

		// *[@id="mainContent"]/div[1]/ul/li[9]/a -- absolute xpath

		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");

		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Javascript");

		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");

		// dynamic id: input
		// id = gh-ac123
		// By.id("gh-ac123")
		// id = gh-ac_456
		// id = gh-ac_789

		// When contains is used??
		// It is used when the value of any attribute changes dynamically.

		// starts-with
		// id = gh-ac_4567
		// id = gh-ac_890
		// id = gh-ac_gh-ac_674774

		// ends-with
		// id = 4567_gh-ac
		// id = 890_gh-ac
		// id = 674774_gh-ac

		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[ends-with(@id,'gh-ac')]")).sendKeys("Test");

		// for links: custom xpath
		// all the href links are represented by <a> hmtl tag

		driver.findElement(By.xpath("//a[text() = 'Advanced']")).click();

	}

}
