package com.wiprojuly.javasdet.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionseg {
		
		public static void main(String[] args) throws InterruptedException {
			
	        ChromeOptions chromeoptions = new ChromeOptions();
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver(chromeoptions);
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//actions class is used to simulate the mouse realted
			
			Actions act = new Actions(driver);
			
			WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
			
		    act.doubleClick(sell).perform();
		    
		    Thread.sleep(4000);
		    
		    driver.navigate().back();
		    
		    Thread.sleep(6000);
		    
		    //context click or right click
		    
		    WebElement moblies = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		    
		    act.contextClick(moblies).perform();

	}

}
