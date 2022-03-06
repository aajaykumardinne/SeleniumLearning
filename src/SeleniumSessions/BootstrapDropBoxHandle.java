package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies();  // delete all the cookies
		
		// dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");  // enter the URL
		
		driver.findElement(By.xpath("//button[contains(@class ,'multiselect')]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		
		System.out.println(list.size());
		
//		// selecting all the checkboxes/options
//		for(int i=0 ; i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
//			list.get(i).click();
//		}	
//		
		
		
		// selecting the Angualt Options
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				break;
				
		
		}
		
	}	
		
 }

}
