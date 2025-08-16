package com.wiprojuly.javasdet.Aug13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFirefoxbrowser {

	public static void main(String[] args) {
		
		//allows the customization of chrome driver session
		
		FirefoxOptions firefoxoptions = new FirefoxOptions();
		
		//webdriver manager - dowloand,setup and maintence
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver(firefoxoptions);
		
		driver.get("https://www.orangehrm.com/");
	}

}
