package com.wiprojuly.javasdet.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyactionseg {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions act = new Actions (driver);
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		act.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(2000);
		
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		act.moveToElement(password).click().sendKeys("how").release().build().perform();
		
		Thread.sleep(2000);
	}
}