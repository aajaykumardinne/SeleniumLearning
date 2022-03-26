package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelUtilMethods {

	public static void main(String[] args) {

		// Indicates the following error when executing the program
		// ERROR StatusLogger No log4j2 configuration file found. Using default
		// configuration: logging only errors to the console.
		// watch the video:
		// How to read/write data from Excel file using Apache POI API in Selenium ||
		// Latest POI Version

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinne\\eclipse-workspace\\SeleniumTrainingSessions\\src\\com\\testdata\\ExcelUtilMethods.xlsx");

		String data = reader.getCellData("LoginPageData", "username", 2);
		System.out.println(data);

		int rowCount = reader.getRowCount("LoginPageData");
		System.out.println("total no of rows: " + rowCount);

//		reader.addColumn("LoginPageData", "Status");

		if (!reader.isSheetExist("PaymentPageData")) {
			reader.addSheet("PaymentPageData");
		}

		reader.setCellData("LoginPageData", "Status", 1, "Failed");

		reader.getCellData("LoginPageData", 0, 2);

	}

}
