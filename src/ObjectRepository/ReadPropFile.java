package ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	// Revised
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\dinne\\eclipse-workspace\\SeleniumTrainingSessions\\src\\ObjectRepository\\config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
//			else if(browserName.equals("Firefox")) {
//				System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
//				driver = new FirefoxDriver();
//		}

		driver.get(url);
		
		driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
	}

}
