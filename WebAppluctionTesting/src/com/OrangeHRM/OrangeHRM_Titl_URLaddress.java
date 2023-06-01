package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Titl_URLaddress {
	public static void main(String[] args) {
		WebDriver driver;
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe" );
		driver=new ChromeDriver();
        driver.get(ApplicationUrl);
        
         
        String Actual_OrangeHrmHomepageUrlAddress=driver.getCurrentUrl();
		System.out.println("the OrangeHRMHomepage current UrlAddress is:-" +Actual_OrangeHrmHomepageUrlAddress );
		String Actual_OrangeHrmHomepageTitle=driver.getTitle();
		System.out.println("the OrangeHRMHomepage Title is:-" +Actual_OrangeHrmHomepageTitle);
		String Expect_OrangeHrmHomepageUrlAddress="orangehrm-4.2.0.1";
		String Expect_OrangeHrmHomepageTitle="OrangeHRM";
		
		if(Actual_OrangeHrmHomepageUrlAddress.contains(Expect_OrangeHrmHomepageUrlAddress))
		{
		     System.out.println(" true");
		}
		else 
		{
		     System.out.println("false");	
		}
		if(Actual_OrangeHrmHomepageTitle.equals(Expect_OrangeHrmHomepageTitle))
		{
			 System.out.println(" true");
		}
		else 
		{
			 System.out.println("false");	
		
        }

		By LOGINPanellocator=By.linkText("LOGINPanel");
	    WebElement LOGINPanel=driver.findElement(LOGINPanellocator);
		String giventext=LOGINPanel.getText();
		System.out.println("the text of the webelement LOGINPanel on OrangeHRM home page is:-"+giventext);
		
		
		   driver.findElement(By.id("txtUsername")).sendKeys("MdMahaboob05");
		   driver.findElement(By.id("txtPassword")).sendKeys("MdMahaboob05@");
		   driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();	
	    }

}
