package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonsTesting {
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");

	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	}

	@Test
	public void radioButtonsTesting() throws InterruptedException
	{
	// <input type="radio" name="group1" value="Milk">
	// <input type="radio" name="group1" value="Butter" checked="">
	// <input type="radio" name="group1" value="Cheese">

	// <input type="radio" name="group2" value="Water">

	// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td
	By radioButtonsBlockLocator=By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td");
	WebElement radioButtonsBlock=driver.findElement(radioButtonsBlockLocator);


	By group1RadioButtonsLocator=By.name("group1");
	List<WebElement>group1RadioButtons=radioButtonsBlock.findElements(group1RadioButtonsLocator);
	
	By group2RadioButtonsLocator=By.name("group2");
	List<WebElement>group2RadioButtons=radioButtonsBlock.findElements(group2RadioButtonsLocator);

	// to perform click operation on the Radio Buttons
	for(int radioButtonsIndex=0;radioButtonsIndex<group1RadioButtons.size();radioButtonsIndex++)
	{

	group1RadioButtons.get(radioButtonsIndex).click();
	
	group2RadioButtons.get(radioButtonsIndex).click();

	Thread.sleep(5000);

	// to find the status of the Radio Buttons
	for(int radioButtonsStatus=0;radioButtonsStatus<group1RadioButtons.size();radioButtonsStatus++)
	{
	System.out.print(group1RadioButtons.get(radioButtonsStatus).
			getAttribute("value")+" - "+group1RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
	
	System.out.println("     "+group2RadioButtons.get(radioButtonsStatus)
			.getAttribute("value")+"  "+group2RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
	}
	System.out.println();

	}


	}


	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}


}
