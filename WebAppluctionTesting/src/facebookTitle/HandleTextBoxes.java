package facebookTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxes {
public static void main(String[] args){
WebDriver driver;
String ApplivationUrl="http://facebook.com";
System.setProperty("webdriver.chrome.drivr","./SeleniumApplication/chromedriver.exe");
driver=new ChromeDriver();
driver.get(ApplivationUrl);
String Actual_FacebookHomepageTitle=driver.getTitle();
System.out.println("the facebook Title is:-"+ Actual_FacebookHomepageTitle);
String Actual_FacebookHomepageUrl=driver.getCurrentUrl();
System.out.println("the Url of Facebook Home Page is:- "+Actual_FacebookHomepageUrl);

String Expected_FacebookHomepsgeTitle="Facebook-login or sign up";
String Expected_FacebookHopageUrl="facebook.com";

/*

    if((Actual_FacebookHomepageUrl.equals(Expected_FacebookHopageUrl)) &&  (Actual_FacebookHomepageTitle.contains(Expected_FacebookHomepsgeTitle)))
    {
    	System.out.println("true");
    }

     else
    {
    	System.out.println("false");
    }
    */
driver.quit();
	}


}
