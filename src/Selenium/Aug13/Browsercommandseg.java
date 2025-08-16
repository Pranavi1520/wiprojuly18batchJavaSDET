package com.wiprojuly.javasdet.Aug13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsercommandseg {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//get the page title
		
		String title = driver.getTitle();
		
		System.out.print(title);
		
		//get the source code of the html page
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		//feth the current url
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		//close the current window
		
		driver.close();
		
		//close all the windows
		
		//driver.quit();	

	}

}
