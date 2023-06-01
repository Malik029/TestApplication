package com.TSRTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingAlert {
	
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		@BeforeTest
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(applicationUrlAddress);
			driver.manage().window().maximize();
		}
		/*
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		*/
		
		
		@Test(description="getting the alert window message ")
		public void handlingAlert() throws InterruptedException
		{
			// Automating Check Availability Button
			// id="searchBtn"
			By checkAvailabilityLocator=By.id("searchBtn");
			WebElement checkAvailability=driver.findElement(checkAvailabilityLocator);
			checkAvailability.click();
		
			Alert tsrtcAlertWindow=driver.switchTo().alert(); // import org.openqa.selenium.Alert;
			
			String tsrtcAlertMessage=tsrtcAlertWindow.getText();
			System.out.println(" The message of the alert window is :- "+tsrtcAlertMessage);
			
			Thread.sleep(10000);
			
			// handling OK button in the Alert window
					tsrtcAlertWindow.accept();
			
					// handling Cancle button in the Alert window
                  //tsrtcAlertWindow.dismiss();
			
					// sending test data into alert window
		         //tsrtcAlertWindow.sendKeys("sending test data");
			}
	}

	
	


