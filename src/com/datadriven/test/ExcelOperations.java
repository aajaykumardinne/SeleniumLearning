package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {

		// Indicates the following error when executing the program
		// ERROR StatusLogger No log4j2 configuration file found. Using default
		// configuration: logging only errors to the console.

		// get the data from the excel file
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinne\\eclipse-workspace\\SeleniumTrainingSessions\\src\\com\\testdata\\EbayDataDriven.xlsx");

		if (!reader.isSheetExist("LoginPage")) {
			reader.addSheet("LoginPage");
		}

		int colCount = reader.getColumnCount("EbayRegPageData");
		System.out.println(colCount);

		int cellrowNum = reader.getCellRowNum("EbayRegPageData", "firstname", "Virat");
		System.out.println(cellrowNum);

	}

}
