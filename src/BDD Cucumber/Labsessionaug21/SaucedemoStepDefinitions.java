package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class SaucedemoStepDefinitions {
	
	WebDriver driver = DriverFactory.getDriver();
	
	@Given("User is on the Saucedemo page")
	public void user_is_on_the_saucedemo_page() throws InterruptedException {
		
		driver.get("https://www.saucedemo.com/v1/");

        Thread.sleep(4000);
	    
	}

	@When("user enters the Username")
	public void user_enters_the_username() throws InterruptedException {
		
        // Enter username
        
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        
        username.sendKeys("standard_user");
        
        Thread.sleep(4000);
	    
	}

	@When("user enters the Password")
	public void user_enters_the_password() throws InterruptedException {
		
		// Enter password
		
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        
        password.sendKeys("secret_sauce");
        
        Thread.sleep(4000);
	    
	}

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        
        loginButton.click();

        // Wait to see result (optional)
        Thread.sleep(4000);
	    
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
        WebElement standard_user = driver.findElement(By.xpath("//div[@class='header_secondary_container']"));
		
        Thread.sleep(4000);
        
		if (standard_user.isDisplayed()) {
			System.out.println("User is on the home page");
		} else {
 
			System.out.println("User is not on the home page");   	
	}
	   
	}
	
	@Then("user added the products to cart")
	public void user_added_the_products_to_cart() throws InterruptedException {
	    
		 WebElement Addtocart = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
	        
		 Addtocart.click();
		 
		 WebElement cart1 = driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']"));
	        
		 cart1.click();
		 
		 Thread.sleep(4000);
	}

	@Then("user enters into cart")
	public void user_enters_into_cart() throws InterruptedException {
		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']"));
        
		cart.click();
		
		 Thread.sleep(4000);
	}

	@Then("user clicks on checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException {
        WebElement checkout = driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']"));
        
        checkout.click();
        
        Thread.sleep(4000);
	}

	@Then("user enters firstName")
	public void user_enters_first_name() throws InterruptedException {
		
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        
        firstName.sendKeys("Pranavi");
        
        Thread.sleep(4000);
	}

	@Then("user enters lastName")
	public void user_enters_last_name() throws InterruptedException {
		
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        
        lastName.sendKeys("Gangineni");
        
        Thread.sleep(4000);
	   
	}

	@Then("user enters postalCode")
	public void user_enters_postal_code() throws InterruptedException {
		
		 WebElement postalcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
	        
		 postalcode.sendKeys("508757");
	        
	     Thread.sleep(4000);
	    
	}

	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		
        WebElement conti = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
        
        conti.click();
        
        Thread.sleep(4000);
	    
	}

	@Then("user clicks on finish button")
	public void user_clicks_on_finish_button() throws InterruptedException {
	    
        WebElement finish = driver.findElement(By.xpath("//a[normalize-space()='FINISH']"));
        
        finish.click();
        
        Thread.sleep(4000);
		
	}

	@Then("user clicks on back to home button")
	public void user_clicks_on_back_to_home_button() throws InterruptedException {
	    
        WebElement me = driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        
        me.click();
        
        Thread.sleep(4000);
        
        WebElement items  = driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']"));
        
        items.click();
        
        Thread.sleep(4000);
        
	}

	@Then("user clicks on menu button")
	public void user_clicks_on_menu_button() throws InterruptedException {
		
        WebElement menu = driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        
        menu.click();
        
        Thread.sleep(4000);
	   
	}

	@Then("user clicks on logOut button")
	public void user_clicks_on_log_out_button() {
	    
        WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        
        logout.click();
        
	}


}
