package com.wiprojuly.javasdet.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploadeg {

public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://the-internet.herokuapp.com/upload\r\n");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		fileupload.sendKeys("C:\\Users\\pranavi\\Downloads\\image.png");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
		
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement validation = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
		
		if(validation.isDisplayed()) {
			
			System.out.println("The message is displayed proprly");
		}else {
			
			System.out.println("The message is not displayed");
		}
}
}
