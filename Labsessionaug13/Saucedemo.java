package com.wiprojuly.javasdet.Labsessionaug13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException {
		
		//allows the customization of chrome driver session
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		//webdriver manager - dowloand,setup and maintence
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://www.saucedemo.com/\r\n");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000); // Wait for the login page to load

        // Enter username
        
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        
        username.sendKeys("standard_user");

        // Enter password
        
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        
        password.sendKeys("secret_sauce");

        // Click on login button
        
        Thread.sleep(2000); // Optional wait before clicking
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        
        loginButton.click();

        // Wait to see result (optional)
        Thread.sleep(5000);
		
	}

}