package MouseMovementConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandDConceptPart2 {

	public static void main(String[] args) {

		// Revised
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0); // switch to frame if it is present

		WebElement sourceElement = driver.findElement(By.id("draggable"));

		WebElement targetElement = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

	}

}
