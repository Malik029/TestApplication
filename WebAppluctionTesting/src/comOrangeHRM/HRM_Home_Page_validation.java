package comOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Home_Page_validation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
	WebDriver driver ;
	driver= new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	By logInPanel_Locator=By.id("logInPanelHeading");
	WebElement loginPanel=driver.findElement(logInPanel_Locator);
	String loginPanelId=loginPanel.getText();
	System.out.println("the login panel text is :" +loginPanelId);
}

}
