package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mehods {
	
	
	
	WebDriver driver;

	String ApplicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	
	@Given("^User should launch chrome Browser$")
	public void user_should_launch_chrome_Browser()  {
		
		
		System.setProperty("Webdriver.chrome.drive","./BrowserFile/chromedriver.exe");

				driver = new ChromeDriver();

				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.manage().window().maximize();
	   
	}

	@When("^User should enter valid OrangeHRM Application Url Address$")
	public void user_should_enter_valid_OrangeHRM_Application_Url_Address()  {
		
		
		driver.quit();
	   
	}

	@Then("^User should be navigated to OrangeHRM Application LogIn Page$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_Page()  {
	    
	}

	@Then("^User should be close the Browser along with the Application$")
	public void user_should_be_close_the_Browser_along_with_the_Application() {
	    
	}


	
	
	
	
	
	
	
	
	
	

}
