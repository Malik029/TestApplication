package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonsterApplicationDropdown {
	public static void main(String[] args) {
		
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver","./SeleniumApplication/chromedriver.exe");
		String Application="https://my.monsterindia.com/sponsered_popup.html";
		driver=new ChromeDriver();
		driver.get(Application);
		
		By currentLocationLocator=By.className("border_grey1");
		WebElement CurrentLocation=driver.findElement(currentLocationLocator);
	By CurrrentLocationDropDownLocator=By.tagName("option");
	List<WebElement>currentLocatorDropDown=CurrentLocation.findElements(CurrrentLocationDropDownLocator);
	int currentLocationDropDownCount=currentLocatorDropDown.size();
	System.out.println("the number of cities current webPage:-"+currentLocationDropDownCount);
   /*for(int currentLocationindex=0;currentLocationindex<currentLocationDropDownCount;currentLocationindex++)
   {
	String CityName=currentLocatorDropDown.get(currentLocationindex).getText();
	System.out.println(currentLocationindex+"-"+CityName);
    }
*/
	By CurrentLocator=By.className("border_grey1");
	WebElement currentLocation=driver.findElement(CurrentLocator);
	Select selectcurrentLocation=new Select(currentLocation);
	selectcurrentLocation.selectByIndex(9);
	selectcurrentLocation.selectByValue("4");
	selectcurrentLocation.selectByVisibleText("Chennai");
	
	
	//deselect an optional value from the drop down
	By industryLocator=By.id("id_industry");
	WebElement industry=driver.findElement(industryLocator);
	Select selectindustry=new Select(industry);
	selectindustry.selectByValue("1");
	selectindustry.selectByVisibleText("Banking/Accounting/Financial Services");
	selectindustry.selectByIndex(3);
	
	selectcurrentLocation.deselectByIndex(3);
	selectindustry.deselectByVisibleText("Banking/Accounting/Financial Services");

	selectcurrentLocation.deselectAll();
	selectindustry.deselectAll();
	
	
	 
	//driver.quit();


}

		
		
		
		
	}
	
	
