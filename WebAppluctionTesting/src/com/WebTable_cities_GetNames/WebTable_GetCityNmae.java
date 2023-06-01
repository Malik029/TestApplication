package com.WebTable_cities_GetNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_GetCityNmae {
	WebDriver driver;
	String Application="https://www.timeanddate.com/worldclock/";

public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Application);
}
public void tearDown() {
	driver.quit();
}
public void GetCityNameTest() {
	
	
	By CityNameLocator=By.xpath("//a[@href='/worldclock/ghana/accra']");
    WebElement CityName=driver.findElement(CityNameLocator);
    String CitynameTest=CityName.getText();
    System.out.println("THE city name is:-"+CitynameTest);
	
}


public static void main(String[] args) {
	WebTable_GetCityNmae cityname=new WebTable_GetCityNmae();
	cityname.SetUp();
	//cityname.tearDown();
	cityname.GetCityNameTest();
}

}