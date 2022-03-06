package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // Launch chrome  
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com"); // enter the URL
		
		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click(); // login Button
		
		driver.switchTo().frame("mainpanel");
		
		String date = "20-November-2021";
		String dateArr[] = date.split("-"); // {20, November , 2021}
		String day  = dateArr[0];
		String month =  dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[5]/td[4]
		
		
		String before_xpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[" ;
		String after_xpath = "]/td[";
		
		final int totalWeekDays = 7;
		
		boolean flag = false;
		String dayVal = null;
		for(int rowNum=2; rowNum<=7;rowNum++) {
			
			for(int colNum= 1; colNum<=7; colNum++) {
				
				try {
				dayVal = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
				}
				
				
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
					flag = true;
					break;
			     }
				
		     }
			
			if(flag) {
			break;
		    }
			
			
			
		}
		
		// doubts
		driver.quit();
	

	}

}
