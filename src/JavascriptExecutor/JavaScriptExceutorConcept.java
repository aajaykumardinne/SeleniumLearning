package JavascriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExceutorConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launch Chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/"); // enter the URl

		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");
		// driver.findElement(By.xpath("//input[@type='submit']"));

		// executeScript --- to execute JavaScript Code

		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); // login Button

		flash(loginBtn, driver); // highlight the element

//		drawBorder(loginBtn, driver);
//
//		// Take screenshot and store as a file format:
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		// now copy the screenshot to the desired location using copyFile method:
//		FileUtils.copyFile(src,
//				new File("C:\\Users\\dinne\\eclipse-workspace\\MorningSessions\\src\\SeleniumSessions//element.png"));
//
//		// generate alert
//		// generateAlert(driver, "There is an issue with Login Button on Login Page");
//
//		// click on any element by using JS exceutor.
//		clickElementbyJS(loginBtn, driver);
//
//		driver.navigate().refresh(); // refresh the page by using Selenium
//
//		refreshBrowserByJS(driver); // refresh the page by JS Executor.
//
//		// get the title of the page by JS
//		System.out.println(getTitleByJS(driver));
//
//		// get the page text
//		System.out.println(getPageInnerText(driver));
//
//		// scroll page down
////		scrollPageDown(driver);
//
//		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
//		scrollIntoView(forgotPwdLink, driver);

	}

	// Javascript methods
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver); // 1
			changeColor(bgcolor, element, driver);
		}

	}

	private static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" +color+ "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

//	public static void drawBorder(WebElement element, WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].style.border='3px solid red'", element);
//	}
//
//	public static void generateAlert(WebDriver driver, String message) {
//
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("alert('" + message + "')");
//
//	}
//
//	public static void clickElementbyJS(WebElement element, WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click()", element);
//	}
//
//	public static void refreshBrowserByJS(WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("history.go(0)");
//
//	}
//
//	public static String getTitleByJS(WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String title = js.executeScript("return document.title;").toString();
//		return title;
//	}
//
//	public static String getPageInnerText(WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String pageText = js.executeScript("return document.document.innerText").toString();
//		return pageText;
//
//	}
//
//	public static void scrollPageDown(WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	}
//
//	public static void scrollIntoView(WebElement element, WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].scrollIntoView(true)", element);
//	}

}
