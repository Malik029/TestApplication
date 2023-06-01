package testNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediff_FullName_test {
	WebDriver driver;
	String Application="https://www.rediff.com/";
	@BeforeTest
	public void Setup() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./SelenumApplication/chromediver.exe");
		driver.get(Application);
		}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}
	@Test
	public void rediff_Fullname() {
	By creatAccountLocator=By.linkText("Create Account");
	WebElement creatAcount=driver.findElement(creatAccountLocator);
	creatAcount.click();
    ////td[@width='180'] manual typing
     By	FullNameLoator=By.xpath("//td[@width='180']");
     WebElement FullName=driver.findElement(FullNameLoator);
     String data=FullName.getText();
     System.out.println(data);
		
		
	}

}
