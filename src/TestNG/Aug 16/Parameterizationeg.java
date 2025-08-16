package com.wipro.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterizationeg {
	
	@Parameters({ "browser", "platform" })
	@Test
	public void testparameters(String browser, String platform) {
		
		if (browser.equals("chrome")) {
			
			if(platform.equals("windows")) {
				
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
		}else {
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			
			//webdriver manager - dowloand,setup and maintence
			
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver(firefoxoptions);
			
			driver.get("https://www.orangehrm.com/");
		}

	}	

}
