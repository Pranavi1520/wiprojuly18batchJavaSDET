package com.wiprojuly.javasdet.Aug13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertseg {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts\r\n");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//click on simple alert
		
		WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		
		simplealert.click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		//click on ok button
		
		alt.accept();
		
		Thread.sleep(2000);
		
		// click on confirm alert

		WebElement confirmalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));

		confirmalert.click();

		Thread.sleep(2000);

		Alert alt1 = driver.switchTo().alert();

		// click on cancel button

		alt1.dismiss();

		Thread.sleep(2000);
		
		//click on prompt alert

		WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));

		promptalert.click();

		Thread.sleep(2000);

		Alert alt2 = driver.switchTo().alert();
		
		//click on ok button
		
		String alerttext = alt2.getText();
		
		System.out.println(alerttext);
		
		alt2.sendKeys("helo");
		
		Thread.sleep(2000);
		
		alt2.accept();

		Thread.sleep(2000);
		
		
	}
}