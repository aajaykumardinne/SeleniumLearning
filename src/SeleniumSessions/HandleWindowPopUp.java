package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		
		// 1. Alerts -- JavaScript Pop Up -- Alert API(accept, dismiss)
		// 2. File Upload Pop Up -- Browse Button (type = file , sendKeys(path))
		// 3. Browser Window Pop Up --- Advertisement pop up(windowhandler API - getWindowHandles())
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.popuptest.com/goodpopups.html");
	}

}



// Doubts in the concept