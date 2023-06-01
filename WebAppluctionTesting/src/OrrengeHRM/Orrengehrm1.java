package OrrengeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orrengehrm1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	driver.manage().window().maximize();
    driver.findElement(By.id("txtUsername")).sendKeys("MdMahaboob05");
	driver.findElement(By.id("txtPassword")).sendKeys("MdMahaboob05@");
	driver.findElement(By.id("btnLogin")).click();
	String actualOrangeHRM_Home_Page_Title=driver.getTitle();
	System.out.println("actualOrangeHRM_Home_Page_Title is :" + actualOrangeHRM_Home_Page_Title);
	String expected_Orange_HRM_Title = "OrangeHRM";
	System.out.println("expected_Orange_HRM_Title is :-" +expected_Orange_HRM_Title);


	if (actualOrangeHRM_Home_Page_Title.equals(expected_Orange_HRM_Title)) {
		System.err.println("condition is true");
	} else {
		System.out.println("FALSE");

	}
	By admin_LocatorId=By.id("welcome");
	WebElement adminPanel=driver.findElement(admin_LocatorId);
	String adminPanelId=adminPanel.getText();
	System.out.println("the login panel text is :" +adminPanelId);
	adminPanel.click();
	
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);


	}

}
