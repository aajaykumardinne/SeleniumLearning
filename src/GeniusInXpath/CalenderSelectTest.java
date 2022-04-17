package GeniusInXpath;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	// throwing an error while executing the program
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Launch chrome  
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com"); // enter the URL
		
		driver.manage().window().maximize(); // maximize the window 
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click(); // login Button
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text() = 'Calendar']")).click();
		
		String date = "20-December-2020";
		String datearr[] = date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1] //6 day
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1] //13
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[5]/td[1] //20
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1] //27
		
		
		String before_xpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		final int weekDays=7;
		
		String dayval=null;
		
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-1 3-2 3-3 3-4 3-5 3-6 3-7
		//4-1 4-2 4-3 4-4 4-5 4-6 4-7
		for(int rowNum=2; rowNum<=7; rowNum++) {
			for(int colNum=1; colNum<=weekDays; colNum++) {
				try {
				 dayval = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println(dayval);
				}
				
				
			}
			
		}

	}

}
