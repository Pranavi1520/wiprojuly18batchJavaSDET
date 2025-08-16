package com.wiprojuly.javasdet.Labsessionaug13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDeselecteg {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://grotechminds.com/multiple-select/?\r\n");
		
		driver.manage().window().maximize();
		
		WebElement drdwn = driver.findElement(By.xpath("//select[@id = \"automobiles\"]"));
		
		Select sel = new Select(drdwn);
		
		//select by visible text
		
		sel.selectByVisibleText("Hatchback");
		
		Thread.sleep(2000);
		
		//select by value
		
		sel.selectByValue("sedan");
		
		Thread.sleep(2000);
		
		//select by index
		
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		
		//deselect by visible text
		
		sel.deselectByVisibleText("Hatchback");
		
		Thread.sleep(2000);
		
		//deselect by value
		
		sel.deselectByValue("sedan");
		
		Thread.sleep(2000);

		//deselect by index
		
		sel.deselectByIndex(3);
		
		Thread.sleep(2000);
}
}