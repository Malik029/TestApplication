package com.BeseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

   
public class BaseTest {
	
	public static WebDriver driver;
	String Application="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeMethod
	public void Setup() {
	 
		System.setProperty("webdriver.chrome.driver","./BrowserFile/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get(Application);

	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
