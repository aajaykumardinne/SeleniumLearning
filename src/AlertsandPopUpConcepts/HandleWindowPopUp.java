package AlertsandPopUpConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	// Revised
	public static void main(String[] args) throws InterruptedException {

		// 1. Alerts -- JavaScript Pop Up -- Alert API(accept, dismiss methods)
		// 2. File Upload Pop Up -- Browse Button (type = file , sendKeys(path))
		// 3. Browser Window Pop Up --- Advertisement pop up(windowhandler API -
		// getWindowHandles())

		// Important topic for the Interview
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
 
		driver.findElement(By.xpath("//a[text() ='Click Here']")).click();
		Thread.sleep(2000);

		// Use getWindowHandles method to obtain the windowid of parent and child window
		// iterator is used to handle elements which are not stored in order
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("Parent WindowId is: " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child WindowId is: " + childWindowId);

		driver.switchTo().window(childWindowId); // switch to child window
		Thread.sleep(2000);

		driver.findElement(By.name("emailid")).sendKeys("dinnekumar@outlook.com");
		driver.findElement(By.name("btnLogin")).click();

		System.out.println("Child Window title is: " + driver.getTitle());

		driver.close(); // close the specific browser window
		// clsoe the child window pop up

		// driver is active when it is present on the specfic window of the browser
		driver.switchTo().window(parentWindowId); // switch to parent window
		Thread.sleep(2000);

		System.out.println("Parent Window Title is: " + driver.getTitle());
		
		driver.quit();  // closes all the browser windows

	}

}
