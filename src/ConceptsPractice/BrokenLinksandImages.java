package ConceptsPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksandImages {
	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://makemysushi.com/404?");

		// 1. get the all the links of href and images
		List<WebElement> li = driver.findElements(By.tagName("a"));
		li.addAll(driver.findElements(By.tagName("img")));

		System.out.println("No of links and images:"+li.size());

		// 2. prints the links and images which has only href attribute
		List<WebElement> activeLinks = new ArrayList<WebElement>();
	
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getAttribute("href"));
			if (li.get(i).getAttribute("href") != null
					&& (!li.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(li.get(i));
			}
		}
	
		System.out.println("No of active links and images: " +activeLinks.size());

	
		// 3. check the href url with http connection api
	   for(int j=0; j<activeLinks.size(); j++) {
		   
			HttpURLConnection connection= (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activeLinks.get(j).getAttribute("href") +"-->"+ response);
		   
	   }
	}
}
