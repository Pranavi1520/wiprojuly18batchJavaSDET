package com.wiprojuly.javasdet.Aug16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {

public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		int rowcount = rows.size();
		
		System.out.println(rowcount);
		
        List <WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/th"));
		
		int colcount = cols.size();
		
		System.out.println(colcount);
		
		//text of a cell
		
		WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
		
		String actualcelltext = celltext.getText();
		
		String exceptedcelltext = "tconway@earthlink.net";
		
		if(actualcelltext.equalsIgnoreCase(exceptedcelltext)) {
			
			System.out.println("The text matches");
			
		}else {
			
			System.out.println("The text do not match");
		}
		
}
}