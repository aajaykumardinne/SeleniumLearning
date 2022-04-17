package DropDownConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandle_part3 {

	static WebDriver driver;
	public static void main(String[] args) {

		// Drop down with out using select class
		// Creating the generic method which is important in the framework part
		// and call the function in the main method
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");
		
		String fruit_xpath = "//select[@id='fruits']//option";

		selectDropDownValue(fruit_xpath,"Grape");
		
	}
	
	public  static void selectDropDownValue(String xpathValue, String value) {
		List<WebElement> list = driver.findElements(By.xpath(xpathValue));

		for (int k = 0; k < list.size(); k++) {
			System.out.println(list.get(k).getText());
			if (list.get(k).getText().equals(value)) {
				list.get(k).click();
				break;
			}
		}
		
	}

}
