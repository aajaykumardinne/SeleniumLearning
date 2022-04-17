package HeadlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadLess {

	// Revised
	public static void main(String[] args) {

		// Headless mode -- browser will not be launched and the program will be
		// executed

		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxBinary);

		WebDriver driver = new FirefoxDriver(fo);

		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
