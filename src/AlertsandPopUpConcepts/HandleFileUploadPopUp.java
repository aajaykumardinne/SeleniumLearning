package AlertsandPopUpConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	// Revised
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome
		
		// type=file  should be present for Browse/AttachFile/UploadFile buttons

		// Example 1 for the file upload popups:
//		driver.get("https://html.com/input-type-file/");
//		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\dinne\\Downloads\\File Handles\\aajay.txt");

		// Example 2 for the file upload popups:
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\dinne\\Downloads\\File Handles\\sample.txt");

		// Use sendkeys method instead of click method for the file upload popups.

	}

}
