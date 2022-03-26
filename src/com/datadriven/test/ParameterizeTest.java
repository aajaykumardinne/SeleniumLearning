package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {

		//Indicates the followig error when executing the program
		// ERROR StatusLogger No log4j2 configuration file found. Using default
		// configuration: logging only errors to the console.
		
		// webdriver code
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch the browser
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");

		// get the data from the excel file
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinne\\eclipse-workspace\\SeleniumTrainingSessions\\src\\com\\testdata\\EbayDataDriven.xlsx");
		int rowCount = reader.getRowCount("EbayRegPageData");

		reader.addColumn("EbayRegPageData", "status");
		
		// Data Driven approach(parameterization) -- 
		// used to create data driven framework -- 
		// driving the test data from excel files.
		
		// parameterization
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String firstName = reader.getCellData("EbayRegPageData", "firstname", rowNum);
			System.out.println(firstName);
			String lastName = reader.getCellData("EbayRegPageData", "lastname", rowNum);
			System.out.println(lastName);
			String email = reader.getCellData("EbayRegPageData", "email", rowNum);
			System.out.println(email);

			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys(firstName);

			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys(lastName);

			driver.findElement(By.id("Email ")).clear();
			driver.findElement(By.id("Email")).sendKeys(email);
			
			
			reader.setCellData("EbayRegPageData", "status", rowNum, "passed");  //write the data into excel file
		}

	}

}
