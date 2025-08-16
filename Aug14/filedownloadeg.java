package com.wiprojuly.javasdet.Aug14;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class filedownloadeg {

public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://the-internet.herokuapp.com/download\r\n");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement filedowload = driver.findElement(By.xpath("//a[@href='download/test-file.txt']"));
		
		filedowload.click();
		
		//download the text file
		
		File f = new File ("C:\\Users\\pranavi\\Downloads\\test-file.txt");
		
		//check whether the file is existing in the folder or not
		
		if(f.exists()) {
			
			System.out.println("The file is present");
		}else {
			System.out.println("The file is not present");
		}
}
}