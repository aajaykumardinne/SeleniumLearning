package SeleniumSessions;

import Basics.FirefoxDriver;
import Basics.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
	
		
//		WebDriver driver = new ChromeDriver();
		
		
		
		WebDriver driver = new  FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement("name");
		driver.close();
		driver.quit();
		
	}

}
