package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DriverFactory;

public class StepDefinitions {
	
	WebDriver driver = DriverFactory.getDriver();
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(4000);
	  
	}

	@When("user enters the username")
	public void user_enters_the_username() throws InterruptedException {
		
        // Enter username
        
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        
        username.sendKeys("Admin");
        
        Thread.sleep(4000);
	    
	}

	@When("user enters teh password")
	public void user_enters_teh_password() throws InterruptedException {
		
        // Enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        
        password.sendKeys("admin123");
        
        Thread.sleep(4000);
	   
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		
		// Click on login button
        Thread.sleep(4000); // Optional wait before clicking
        
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        
        loginButton.click();

        // Wait to see result (optional)
        Thread.sleep(4000);
	   
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
		WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
		
		Thread.sleep(4000);
		
		if (admin.isDisplayed()) {
			System.out.println("User is on the home page");
		} else {
 
			System.out.println("User is not on the home page");   	
	}
	
}
	//Invalid credentials
	
@Given("User is on the invalid credentials page")
public void user_is_on_the_invalid_credentials() throws InterruptedException {
	
	ChromeOptions chromeOptions = new ChromeOptions();

    WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver(chromeOptions);

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    Thread.sleep(2000);
    
}

@When("user enters the Invalid username")
public void user_enters_the_invalid_username() throws InterruptedException {
	
    // Enter username
    
    WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    
    username.sendKeys("Admi2");
    
    Thread.sleep(4000);
    
}

@When("user enters the Invalid password")
public void user_enters_the_invalid_password() throws InterruptedException {
	
	 // Enter password
    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    
    password.sendKeys("admin34");
    
    Thread.sleep(4000);  
}

@Then("an error message Invalid username and password should be displayed")
public void an_error_message_invalid_username_and_password_should_be_displayed() throws InterruptedException {
	
	WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));
	
	Thread.sleep(4000);
	
    if (errorMsg.isDisplayed()) {
        System.out.println("Error displayed: " + errorMsg.getText());
    } else {
    	 System.out.println("Expected error not displayed");
    }
}
@When("user enters the {string} and {string}")
public void user_enters_the(String username , String password ) throws InterruptedException {
	WebElement username1 = driver.findElement(By.name("username"));

	username1.sendKeys(username);

	Thread.sleep(4000);


	WebElement password1 = driver.findElement(By.name("password"));

	password1.sendKeys(password);

	Thread.sleep(4000);

}
}
