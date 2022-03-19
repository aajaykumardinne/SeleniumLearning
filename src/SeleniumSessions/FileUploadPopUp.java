package SeleniumSessions;

import org.openqa.selenium.By;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type  = "file"
		//name = "upfile"
//		driver.
//		findElement(By.name("upfile"))
//		.sendKeys("C:\\Users\\dinne\\Downloads\\ScrumQuick.jpg");
		
		
		
		
		

	}

}
