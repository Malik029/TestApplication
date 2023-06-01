package com.BeseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

   
public class BaseTest {
	
	public WebDriver driver;
	String Application="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void Setup() {
	 
		System.setProperty("webdriver.chrome.driver", "./MalikApplication/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Application);
		
		
	}
	
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
