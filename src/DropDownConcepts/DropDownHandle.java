package DropDownConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		// Includes the DropDown hanlde part 1 and 2
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruits = driver.findElement(By.id("fruits"));

		Select select1 = new Select(fruits);
		boolean b2 = select1.isMultiple(); // for multi-select drop down
		System.out.println(b2);

		select1.selectByVisibleText("Banana");
//		select1.selectByVisibleText("Grape");

//		select1.selectByIndex(2); // for random selection

		List<WebElement> list = select1.getOptions();
		System.out.println(list.size());
		
		System.out.println("Total no of fruits : " +list.size());
		
		for(int j=0; j<list.size(); j++) {
			String fruitNames = list.get(j).getText();
			System.out.println(fruitNames);
			if(fruitNames.equals("Apple")) {
				list.get(j).click();
				
			}
		}
		
//		select1.deselectAll();
		
		

	}

}
