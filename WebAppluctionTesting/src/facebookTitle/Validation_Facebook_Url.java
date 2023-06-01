package facebookTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Facebook_Url {
	public static void main(String[] args) {
		WebDriver driver;
		String ApplicationUrlAddress="http://Facebook.com";
		System.setProperty("webdriver.chrome.driver","./SeleniumApplication/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		String Actual_FacebookHomePageTitle=driver.getTitle();
        System.out.println("the Title of Facebook Home Page is:- "+Actual_FacebookHomePageTitle);
        String Actual_FacebookHomePageUrlAddres =driver.getCurrentUrl();
        System.out.println("the Url of Facebook Home Page is:- "+Actual_FacebookHomePageUrlAddres);
        
        String ExpectedFacebookHomepageTitle="Facebook � log in or sign up";
        
        String expectedfacebookHomePageUrl="facebook.com";
       
        
        if((Actual_FacebookHomePageTitle.equals(ExpectedFacebookHomepageTitle)) && (Actual_FacebookHomePageUrlAddres.contains(expectedfacebookHomePageUrl)))
        {
            System.out.println("The facebook home page title and URL is true");
	    }
        else
        {
            System.out.println("The facebook home page title and url is false");
        }
        
	    }
        }
        
       
        
        
//the current facebook url is :--https://www.facebook.com/
//the current facebook title is :--Facebook � log in or sign up


