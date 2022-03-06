package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {


		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\dinne\\eclipse-workspace\\MorningSessions\\config.properties");
		
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
//		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
//		}
//		else if(browserName.equals("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
	
		
//		driver.get(url);
		
		
		
		
		
		
	}

}
