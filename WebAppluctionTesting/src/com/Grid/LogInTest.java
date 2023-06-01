package com.Grid;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest {
	
	
	@Parameters("Browser")

	@Test
	public void logIn(String browserName) throws InterruptedException, IOException
	{
	System.out.println(" The Browser Name is :- "+browserName);

	// DesiredCapabilities - its a class of webdriver - it is used to set the Browser
//	    information and platform(Operating System) information on which the test
	   //     should be executed - NODE

	DesiredCapabilities cap=null;

	if(browserName.equals("chrome"))
	{
	cap=DesiredCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);

	}
	else
	if(browserName.equals("firefox"))
	{
	cap=DesiredCapabilities.firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.WINDOWS);
	}


	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.6.1:4444/wd/hub"), cap);

	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	driver.get(applicationUrlAddress);

	// validating title of OrnageHRM Application LogIn Page
	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
	System.out.println(" The Expected title of the OrnageHRM Application LogIn Page is:- "+expected_OrangeHRMApplicationLogInPageTitle);

	String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
	System.out.println(" The Actual title of the OrnageHRM Application LogIn Page is:- "+actual_OrangeHRMApplicationLogInPageTitle);

	if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	System.out.println(" Title of OrangeHRM Application LogIn Page Matched - PASS");
	}
	else
	{
	System.out.println(" Title of OrangeHRM Application LogIn Page NOT Matched - FAIL");
	}
	  driver.quit();

	}


}
