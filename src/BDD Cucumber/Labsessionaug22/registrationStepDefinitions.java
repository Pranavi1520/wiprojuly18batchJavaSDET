package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Registartionpage;

public class registrationStepDefinitions {

    WebDriver driver;
    Registartionpage loginPage;

    @Given("the user is on the practice registration page")
    public void the_user_is_on_the_practice_registration_page() throws InterruptedException {
    	
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        
        loginPage = new Registartionpage(driver);
        
        System.out.println("Browser launched and navigated to practice page");
    }

    @When("the user fills in the registration form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_in_the_registration_form(String name, String email, String gender,
                                                        String mobile, String dob, String subjects,
                                                        String hobbies, String address, String picture,
                                                        String state, String city) throws InterruptedException {

        loginPage.enterName(name);
        loginPage.enterEmail(email);
        loginPage.enterGender(gender);
        loginPage.enterMobile(mobile);
        loginPage.enterDob(dob);
        loginPage.enterSubjects(subjects);
        loginPage.selectHobbies();
        loginPage.enterAddress(address);
        loginPage.uploadPicture(picture);
        loginPage.enterState(state);
        loginPage.enterCity(city);
        loginPage.submitForm();
    }

    @Then("the form should be submitted successfully")
    public void the_form_should_be_submitted_successfully() throws InterruptedException {
        System.out.println("Form submitted successfully");
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Browser closed");
    }
}