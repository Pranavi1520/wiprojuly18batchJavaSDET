package com.wiprojuly.javasdet.Aug13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000); // Wait for the login page to load

        // Enter username
        
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        
        username.sendKeys("Admin");

        // Enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        
        password.sendKeys("admin123");

        // Click on login button
        Thread.sleep(2000); // Optional wait before clicking
        
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        
        loginButton.click();

        // Wait to see result (optional)
        Thread.sleep(5000);

    }
}
