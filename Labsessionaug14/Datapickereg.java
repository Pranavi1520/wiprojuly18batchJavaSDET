package com.wiprojuly.javasdet.Labsessionaug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datapickereg {

public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://ui.shadcn.com/docs/components/date-picker");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
        WebElement datepick1 = driver.findElement(By.xpath("//button[@id='date']"));
        
        datepick1.click();

        Thread.sleep(2000);
		
        WebElement datepick = driver.findElement(By.xpath("//button[@date-day='8/13/2025']"));
        
        datepick.click();

        Thread.sleep(2000); 

}
}