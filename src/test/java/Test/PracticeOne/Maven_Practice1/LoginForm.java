package Test.PracticeOne.Maven_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginForm {
	
	WebDriver driver;
	
	@FindBy(id="email")                               WebElement Email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement Password;
	@FindBy (id="loginbutton")                        WebElement Login;

	public LoginForm(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
		

@Given("^Opening the Application$")
public void opening_the_Application() throws Throwable {
    driver.get("https://en-gb.facebook.com/login/");
}

@When("^Phone Number or Mobile Number in (\\w+) field$")
public void phone_Number_or_Mobile_Number_in_(String x)throws Throwable
{
	Email.sendKeys(x);
}

@When("^Password in nikhil field$")
public void password_in_nikhil_field() throws Throwable {
	Password.sendKeys("Nikhil");
}

/*@When("^Phone Number or Mobile Number in nikhil_tirthakar@rediff\\.com field$")
public void phone_Number_or_Mobile_Number_in_nikhil_tirthakar_rediff_com_field() throws Throwable {
	Email.sendKeys("nikhil_tirthakar@rediff.com");
}

@When("^Password in kartik field$")
public void password_in_kartik_field() throws Throwable {
	Password.sendKeys("Kartik");
}*/
@Then("^Click on the Login_button for Login the Application$")
public void click_on_the_Login_button_for_Login_the_Application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Login.click();
    throw new PendingException();
}
    
}

	

