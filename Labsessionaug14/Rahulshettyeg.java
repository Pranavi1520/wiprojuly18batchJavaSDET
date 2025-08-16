package com.wiprojuly.javasdet.Labsessionaug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rahulshettyeg{

public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions chromeoptions = new ChromeOptions();
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver(chromeoptions);
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().window().maximize();
	
	WebElement radiobutton = driver.findElement(By.xpath("//input[@value = 'radio1']"));
	
	radiobutton.click();
	
	Thread.sleep(2000);
	
    WebElement suggestions = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	
	suggestions.sendKeys("India");
	
	Thread.sleep(2000);
	
	WebElement drdwn = driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
	
	Select sel = new Select(drdwn);
	
	//select by visible text
	
	sel.selectByVisibleText("Option3");
	
	Thread.sleep(2000);
	
	WebElement checkbox = driver.findElement(By.xpath("//input[@id = 'checkBoxOption3']"));
	
	checkbox.click();
	
	Thread.sleep(2000);
	
	WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	
	name.sendKeys("John");
	
	WebElement confirm = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
	
	confirm.click();

	Thread.sleep(2000);

}

}