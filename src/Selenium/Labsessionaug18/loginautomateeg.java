package com.wiprojuly.javasdet.Labsessionaug18;

	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class loginautomateeg {
		
		public static void main(String[] args) throws InterruptedException {
	    	
	        ChromeOptions chromeOptions = new ChromeOptions();
	        
	        WebDriverManager.chromedriver().setup();
	        
	        WebDriver driver = new ChromeDriver(chromeOptions);
	        
	        driver.get("https://practicetestautomation.com/practice-test-login/");
	        
	        driver.manage().window().maximize();
	        
	        Thread.sleep(2000);
	        
	        // Enter username
	        
	        WebElement username = driver.findElement(By.id("username"));
	        
	        username.sendKeys("student");
	        
	        Thread.sleep(1000);
	        
	        // Enter password
	        WebElement password = driver.findElement(By.id("password"));
	        
	        password.sendKeys("Password123");
	        
	        Thread.sleep(1000);
	        
	        // Click Submit
	        WebElement submitButton = driver.findElement(By.id("submit"));
	        
	        submitButton.click();
	        
	        Thread.sleep(2000);
	        
	        // Verify URL
	        String currentUrl = driver.getCurrentUrl();
	        
	        if(currentUrl.contains("logged-in-successfully")) {
	        	
	        	System.out.println("logged-in-successfully");
	        }else {
	        	System.out.println("login failed");
	        }
	        
	        // Verify success message
	        WebElement message = driver.findElement(By.tagName("h1"));
	        
	        if(message.getText().contains("Logged In Successfully")){
	        	
	        	System.out.println("Success Message Verified");
	        }else {
	        	System.out.println("Success message not found");
	        }
	                     
	        
	        // Verify Log out button
	        WebElement logoutBtn = driver.findElement(By.linkText("Log out"));
	        
	        if(logoutBtn.isDisplayed()) {
	        	System.out.println("Log out Button is displayed");
	        	
	        }else {
	        	
	        	System.out.println("Log out button is not displayed!");
	        }
	        
	        Thread.sleep(1000);
	        
	        driver.quit();
		
	        // Enter invalid username
	        
	        WebElement username1 = driver.findElement(By.id("username"));
	        
	        username1.sendKeys("helouser");
	        
	        Thread.sleep(1000);
	        
	        // Enter valid password
	        WebElement password1 = driver.findElement(By.id("password"));
	        
	        password1.sendKeys("Password123");
	        
	        Thread.sleep(1000);
	        
	        // Click Submit
	        WebElement submitBtn = driver.findElement(By.id("submit"));
	        
	        submitBtn.click();
	        
	        Thread.sleep(2000);
	        
	        // Verify error message
	        WebElement error = driver.findElement(By.id("error"));

	        if (error.isDisplayed()) {
	        	
	            String actualError = error.getText();
	            
	            if (actualError.equals("Your username is invalid!")) {
	            	
	                System.out.println("Correct error message displayed.");
	            } else {
	                System.out.println("Unexpected error message");
	            }
	        } else {
	            System.out.println("Error message not displayed!");
	        }
	        
	        Thread.sleep(2000);
	        driver.quit();
	        
	        // Enter valid username
	        
	        WebElement username2 = driver.findElement(By.id("username"));
	        
	        username2.sendKeys("student");
	        
	        Thread.sleep(1000);
	        
	        // Enter invalid password
	        WebElement password2 = driver.findElement(By.id("password"));
	        
	        password2.sendKeys("password7654");
	        
	        Thread.sleep(1000);
	        
	        // Click Submit
	        WebElement submitButton1 = driver.findElement(By.id("submit"));
	        
	        submitButton1.click();
	        
	        Thread.sleep(2000);
	        
	        // Verify error message
	        WebElement error1 = driver.findElement(By.id("error"));
	        
	        if (error1.isDisplayed()) {
	        	
	            String actualError = error1.getText();
	            
	            if (actualError.equals("Your password is invalid!")) {
	            	
	                System.out.println("Correct error message displayed");
	            } else {
	                System.out.println("Unexpected error message");
	            }
	        } else {
	            System.out.println("Error message not displayed!");
	        }
	        
	        Thread.sleep(2000);
	        driver.quit();
	    }
	}