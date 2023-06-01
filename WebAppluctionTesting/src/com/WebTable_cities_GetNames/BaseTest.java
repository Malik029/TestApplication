package com.WebTable_cities_GetNames;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.regex.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	String Application="https://www.timeanddate.com/worldclock/";

public void SetUp()  throws IOException{
	
	System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Application);
}
public void tearDown() {
	driver.quit();
}
	public static void main(String[] args) throws IOException {
		BaseTest s1=new BaseTest();
		s1.SetUp();
		s1.tearDown();
	}
}



 


































