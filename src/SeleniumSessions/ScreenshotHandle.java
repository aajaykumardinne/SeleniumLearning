package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {
	static WebDriver driver ;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		takeScreenshot("Facebook_LoginPage");
		
		

	}

	
	public static void takeScreenshot(String fileName) throws IOException {
		// 1. Take screenshot and store as a file format
		 File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// 2. now copy the screenshot to the desired location using copyFile method:
		FileUtils.copyFile(file, new File("C:\\Users\\dinne\\eclipse-workspace\\MorningSessions\\Screenshots/" + fileName+".jpg"));
		
	}
}
