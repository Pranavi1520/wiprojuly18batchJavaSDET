package com.wiprojuly.javasdet.Aug13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromebrowser {

	public static void main(String[] args) {
		
		//allows the customization of chrome driver session
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		//webdriver manager - dowloand,setup and maintence
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.get("https://www.orangehrm.com/");
	}

}
