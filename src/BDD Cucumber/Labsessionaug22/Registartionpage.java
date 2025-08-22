package pages;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registartionpage {

    WebDriver driver;

   
    public Registartionpage(WebDriver driver) {
        this.driver = driver;
    }

    By nameField = By.id("name");
    By emailField = By.id("email");
    By genderField = By.xpath("//input[@id='gender']");
    By mobileField = By.id("mobile");
    By dobField = By.id("dob");
    By subjectsField = By.id("subjects");
    By hobbiesCheck = By.xpath("//input[@id='hobbies']");
    By addressField = By.xpath("//textarea[@id='picture']");  
    By pictureUpload = By.id("picture");
    By stateField = By.id("state");
    By cityField = By.id("city");
    By submitBtn = By.xpath("//input[@value='Login']");

   
    public void enterName(String name) throws InterruptedException {
        driver.findElement(nameField).sendKeys(name);
        Thread.sleep(2000);
    }

    public void enterEmail(String email) throws InterruptedException {
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(2000);
    }

    public void enterGender(String gender) throws InterruptedException {
        driver.findElement(genderField).sendKeys(gender);
        Thread.sleep(2000);
    }

    public void enterMobile(String mobile) throws InterruptedException {
        driver.findElement(mobileField).sendKeys(mobile);
        Thread.sleep(2000);
    }

    public void enterDob(String dob) throws InterruptedException {
        driver.findElement(dobField).sendKeys(dob);
        Thread.sleep(2000);
    }

    public void enterSubjects(String subjects) throws InterruptedException {
        driver.findElement(subjectsField).sendKeys(subjects);
        Thread.sleep(2000);
    }

    public void selectHobbies() throws InterruptedException {
        driver.findElement(hobbiesCheck).click();
        Thread.sleep(2000);
    }

    public void enterAddress(String address) throws InterruptedException {
        driver.findElement(addressField).sendKeys(address);
        Thread.sleep(2000);
    }

    public void uploadPicture(String picturePath) throws InterruptedException {
        driver.findElement(pictureUpload).sendKeys(picturePath);
        Thread.sleep(2000);
    }

    public void enterState(String state) throws InterruptedException {
        driver.findElement(stateField).sendKeys(state);
        Thread.sleep(2000);
    }

    public void enterCity(String city) throws InterruptedException {
        driver.findElement(cityField).sendKeys(city);
        Thread.sleep(2000);
    }

    public void submitForm() throws InterruptedException {
        driver.findElement(submitBtn).click();
        Thread.sleep(3000);
    }
}
