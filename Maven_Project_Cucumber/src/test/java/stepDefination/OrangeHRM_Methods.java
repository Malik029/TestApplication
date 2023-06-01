package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Methods {

	WebDriver driver;

	@Given("^User should launch chrome Browser$")
	public void user_should_launch_chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", "./BrowserFile/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^User should enter valid OrangeHRM Application Url Address$")
	public void user_should_enter_valid_OrangeHRM_Application_Url_Address() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}

	@Then("^User should be navigated to OrangeHRM Application LogIn Page$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_Page() {
		By LOGINPanellocator = By.id("logInPanelHeading");

		WebElement LOGINPanel = driver.findElement(LOGINPanellocator);

		String Actual_LOGINPanel = LOGINPanel.getText();

		System.out.println("the text of the webelement LOGINPanel on OrangeHRM home page is:-" + Actual_LOGINPanel);

		String Expected_LOGINPanel = "LOGIN Panel";

		System.out.println("the text of the webelement LOGINPanel on OrangeHRM home page is:-" + Expected_LOGINPanel);

		if (Actual_LOGINPanel.equals(Expected_LOGINPanel))

		{
			System.out.println(" true");
		}

		else

		{
			System.out.println("false");
		}

		String Actual_OrangeHrmHomepageUrlAddress = driver.getCurrentUrl();

		System.out.println("the OrangeHRMHomepage current UrlAddress is:-" + Actual_OrangeHrmHomepageUrlAddress);

		String Expect_OrangeHrmHomepageUrlAddress = "orangehrm-4.2.0.1";

		String Actual_OrangeHrmHomepageTitle = driver.getTitle();

		System.out.println("the OrangeHRMHomepage Title is:-" + Actual_OrangeHrmHomepageTitle);

		String Expect_OrangeHrmHomepageTitle = "OrangeHRM";

		if (Actual_OrangeHrmHomepageUrlAddress.contains(Expect_OrangeHrmHomepageUrlAddress))

		{
			System.out.println(" True");
		}

		else

		{
			System.out.println("False");
		}

		if (Actual_OrangeHrmHomepageTitle.equals(Expect_OrangeHrmHomepageTitle))

		{
			System.out.println(" True");
		} else

		{
			System.out.println("False");
		}

	}

	@Then("entervalid userName and valid password and Click on LogInButton")
	public void entervalid_user_name_and_valid_password_and_click_on_log_in_button() throws InterruptedException {

		By userNameLocator = By.id("txtUsername");
		WebElement userName = driver.findElement(userNameLocator);
		userName.sendKeys("MdMahaboob05");

		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.id("txtPassword")).sendKeys("Mdishi0@@");

		// Password
		By passwordLocator = By.id("txtPassword");
		WebElement passwrod = driver.findElement(passwordLocator);
		passwrod.sendKeys("MdMahaboob05@");

		Thread.sleep(2000);
		// Login button
		By loginbtnLocator = By.id("btnLogin");
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();
	}

	@Then("User navigate the OrangeHRM Apllication Home Page and LogOut")
	public void user_navigate_the_orange_hrm_apllication_home_page_and_log_out() {

		By welcomeLocator = By.id("welcome");
		WebElement welcome = driver.findElement(welcomeLocator);
		String actual_welcomeText = welcome.getText();

		welcome.click();
		By logOutLocator = By.xpath("//a[@href='/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout']");
		WebElement logout = driver.findElement(logOutLocator);
		logout.click();
		System.out.println("Successfully logout from application");

	}

	@Then("enter {string} and {string} and Click on LogInButton")
	public void enter_and_and_click_on_log_in_button(String userName, String password) throws InterruptedException {

		By userNameLocator = By.id("txtUsername");
		WebElement userName1 = driver.findElement(userNameLocator);
		userName1.sendKeys(userName);

		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.id("txtPassword")).sendKeys("Mdishi0@@");

		// Password
		By passwordLocator = By.id("txtPassword");
		WebElement passwrod1 = driver.findElement(passwordLocator);
		passwrod1.sendKeys(password);

		Thread.sleep(2000);
		// Login button
		By loginbtnLocator = By.id("btnLogin");
		WebElement loginbtn = driver.findElement(loginbtnLocator);
		loginbtn.click();

	}

	@Then("^User should be close the Browser along with the Application$")
	public void user_should_be_close_the_Browser_along_with_the_Application() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("browser closed");
		driver.quit();

	}

}
