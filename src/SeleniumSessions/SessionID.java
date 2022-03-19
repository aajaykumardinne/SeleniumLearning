package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.ca/");
		
		String title = driver.getTitle();
		
		System.out.println("page title is: " + title);
		
		
		driver.quit(); 
		
		System.out.println(driver.getTitle());
		
		
		
		// NoSuchSessionException: invalid session id  ---- close 
		// Session ID is null. Using WebDriver after calling quit()?  ---- quit

	}

}
