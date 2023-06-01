package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {

	WebDriver driver;

	String ApplicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	@Given("^User Should Launch The Browser$")

	public void user_Should_Launch_The_Browser() {
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\OHRMApplicationBDD_cucumber\\BrowserFile\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		

		System.out.println("###M#####");
	}

	@When("^User Should Enter Valid OrageHRM Application Url Address$")

	public void user_Should_Enter_Valid_OrageHRM_Application_Url_Address() {

		driver.get(ApplicationUrlAddress);

	}

	@Then("^User Should be Navigated to OrangeHRM application LogIn Page$")

	public void user_Should_be_Navigated_to_OrangeHRM_application_LogIn_Page() {

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
		}
		else

		{
			System.out.println("False");
		}

	}

	@Then("^User Should be Close the Browser Along with the Application$")

	public void user_Should_be_Close_the_Browser_Along_with_the_Application() {

		driver.quit();

	}
}