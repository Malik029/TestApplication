package com.IPL;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IplTestData {
	
	WebDriver driver;
	String Application="https://www.google.com/";
	
	@BeforeTest
	public  void setup() {
		
		System.setProperty("webdriver.chrome.driver","./BrowserFile/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Application);
	}
	@Test(priority=1)
	public void EnterIplPointsTable() {
		
		
		WebElement google= driver.findElement(By.id("APjFqb"));
		google.sendKeys("ipl points table");
		google.sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void Table() throws InterruptedException {
		
		By TableLocator = By.xpath("//li[@class='imso-hide-overflow tb_l GSkImd tb_st']");
		WebElement Table = driver.findElement(TableLocator);
		Table.click();

		
		
	}
		
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
