package com.datadriven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class WebTableHandle {

	public static void main(String[] args) {

		//Indicates the followig error when executing the program
		// ERROR StatusLogger No log4j2 configuration file found. Using default
		// configuration: logging only errors to the console.
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//*[@id="customers"]/tbody/tr[2]/td[1] --- for one particular row
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		
		// td means the table column data
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[6]/td[2]
		
		String beforeXpath_company = "//*[@id='customers']/tbody/tr[";
		String afterXpath_company = "]/td[1]";
		
		String beforeXpath_contact = "//*[@id='customers']/tbody/tr[";
		String afterXpath_contact = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("number of rows: " +(rows.size()-1));
		
		int rowCount = rows.size();
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\dinne\\eclipse-workspace\\SeleniumTrainingSessions\\src\\com\\testdata\\WebtableHandle.xlsx");
		
		if(!reader.isSheetExist("TableDetails")) {
			reader.addSheet("TableDetails");
			reader.addColumn("TableDetails", "company");
			reader.addColumn("TableDetails", "contact");
		}
		for(int i=2 ; i<=rowCount; i++) {
			String actualXpath_company = beforeXpath_company+i+afterXpath_company;
			String companyName = driver.findElement(By.xpath(actualXpath_company)).getText();	
			System.out.println(companyName);
			
			reader.setCellData("TableDetails", "company", i, companyName);
			
			String actualXpath_contact = beforeXpath_contact+i+afterXpath_contact;
			String contactName = driver.findElement(By.xpath(actualXpath_contact)).getText();	
			System.out.println(contactName);
			
			reader.setCellData("TableDetails", "contact", i, contactName);
			
			
		}
		
		
		
		
		
		

	}

}
