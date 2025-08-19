package com.wipro.testng.datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Writedataeg {
	
	WebDriver driver;
	
	XSSFWorkbook workbook;
	
	XSSFSheet sheet;
	
	XSSFCell cell;

	@Test
	public void login() throws IOException {
		
		File src = new File ("C:\\Users\\pranavi\\eclipse-workspace\\javasdet\\Testdata\\Login.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		// load the work book
		workbook = new XSSFWorkbook(fis) ;
		
		sheet = workbook.getSheetAt(0);
		// create a for loop to iterate in the sheet of rows and columns
		
		for (int i = 1; i<= sheet.getLastRowNum(); i++) {
			
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			// launch the url
 
			driver.get("https://www.facebook.com/login");
			
			driver.manage().window().maximize();
			
			//get the title of the page and write to the excel
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			//write to the excel sheet
			
			FileOutputStream fos = new FileOutputStream(src);
			
			//create the cell and add the data to the cell
			
			sheet.getRow(i).createCell(2).setCellValue(title);
			
			//perform the write operation and close the connection
			
			workbook.write(fos);
			
			fos.close();
		}
	}
}
			