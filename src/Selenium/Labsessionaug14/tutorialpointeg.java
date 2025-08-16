package com.wiprojuly.javasdet.Labsessionaug14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tutorialpointeg {

	public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php\r\n");

        Thread.sleep(2000); // Wait for the login page to load

        // Enter username
        
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        
        name.sendKeys("pranavi");
        
        Thread.sleep(2000);
        
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        
        email.sendKeys("pranavig556@gmail.com");
        
        Thread.sleep(2000);
        
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender']"));
        
        gender.click();
        
        Thread.sleep(2000);
        
        WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
        
        mobile.sendKeys("7456746487");
        
        Thread.sleep(2000);
        
        WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
        
        dob.sendKeys("15-04-2013");
        
        Thread.sleep(2000);
        
        WebElement subjects = driver.findElement(By.xpath("//input[@id='subjects']"));
        
        subjects.sendKeys("physics");
        
        Thread.sleep(2000);
        
        List<WebElement> Hobbies = driver.findElements(By.xpath("//input[@id='hobbies']"));
        
        int size = Hobbies.size();
        
        System.out.println(size);
        
        for(int i=0;i<size;i++) {
        	
        	Thread.sleep(2000);
        	
        	Hobbies.get(i).click();
        	
            Thread.sleep(2000);
        }
        WebElement fileupload = driver.findElement(By.xpath("//input[@id='picture']"));
        
        fileupload.sendKeys("C:\\Users\\pranavi\\Downloads\\image.png");
        
        Thread.sleep(2000);
        
        WebElement currentaddress = driver.findElement(By.xpath("//textarea[@id='picture']"));
        
        currentaddress.sendKeys("hyderbad");
        
        Thread.sleep(2000);
        
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        
        state.click();
        
        WebElement state1 = driver.findElement(By.xpath("//select[@id='state']"));
        
        Select sel = new Select(state1);
		
		//select by visible text
		
		sel.selectByVisibleText("Haryana");
		
		Thread.sleep(2000);
		
        WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
        
        city.click();
        
        WebElement city1 = driver.findElement(By.xpath("//select[@id='city']"));
        
        Select sel1 = new Select(city1);
		
		//select by visible text
		
		sel1.selectByVisibleText("Lucknow");
		
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Login']"));
		
		loginbutton.click();
		
		Thread.sleep(2000);
           
}
}