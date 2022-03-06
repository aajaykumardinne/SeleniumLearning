package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Launch Chrome  
		
		driver.get("https://html.com/input-type-file/");

		
		driver.findElement(By.xpath("//*[@id='fileupload]")).sendKeys("C:\\Users\\dinne\\Downloads/Sample.html");
		// Doubt in sendkeys part 
		
	}

}
