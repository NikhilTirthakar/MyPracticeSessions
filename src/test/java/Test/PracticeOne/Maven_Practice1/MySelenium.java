package Test.PracticeOne.Maven_Practice1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MySelenium 
{  
	WebDriver driver;
	
	//POM//
	/*By Email_Locator = By.id("email");
	By Password_Locator = By.xpath("//input[@placeholder='Password']");*/
	
	
	
	@BeforeTest
	public void BeforeClass() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		
						
	}
	@Test
	public void TestCase1(String x) throws Throwable
	{

		LoginForm obj = new LoginForm(driver);
		
		obj.opening_the_Application();
		obj.phone_Number_or_Mobile_Number_in_(x);
		obj.password_in_nikhil_field();
		obj.opening_the_Application();
		
		/*Email.sendKeys("nikhil.tirthakar@gmail.com");
		Password.sendKeys("Nikhil");
		Login.click();*/
	
		/*WebElement usernameTextBox = driver.findElement(Email_Locator);usernameTextBox.sendKeys("nikhil.tirthakar@gmail.com");
		
		WebElement PasswordTextBox = driver.findElement(Password_Locator);PasswordTextBox.sendKeys("Nikhil");*/
		
	  //driver.findElement(By.id("email")).sendKeys("nikhil.tirthakar@gmail.com");
	  /* Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Nikki");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).clear(); 
	  
	  
	  //driver.findElement(By.xpath("//[]")).click();
			  
	  //driver.findElement(By.linkText("Sign up for Facebook")).click();	
	  driver.findElement(By.partialLinkText("Sign up")).click();
	  
		//driver.findElement(By.cssSelector("input[name='email'][placeholder='Email address or phone number']")).sendKeys("nikhil.tirthakar@gmail.com");
	
		driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).click();
	    	    
*/	
	  
		
	}
		@AfterTest
    public void AfterClass()
    {
    	
    	//driver.close();
    }
}

