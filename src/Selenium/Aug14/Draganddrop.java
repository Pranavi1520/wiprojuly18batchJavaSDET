package com.wiprojuly.javasdet.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop\r\n");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Actions class
		
		Actions act = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("column-a"));
		
		WebElement to = driver.findElement(By.id("column-b"));
		
		act.dragAndDrop(from, to).perform();
		
		Thread.sleep(2000);
	}
}
