package OrangeHRM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class application_Hrm {
	public static void main(String[] args) {
		WebDriver driver;
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe" );
		driver=new ChromeDriver();
        driver.get(ApplicationUrl);
        
       String Actual_OrangeHRMHomepageTitle=driver.getTitle();
       System.out.println("the OrrengeHrmHomepageTitle is:-"+Actual_OrangeHRMHomepageTitle);
	   String Actual_OrangeHRMHomepageUrl=driver.getCurrentUrl();
	   System.out.println("the curent url is:- "+ Actual_OrangeHRMHomepageUrl );
	   
	   String Expected_OrangeHRMHomepageTitle="OrangeHRM Login";
	   
	   String Expected_OrangeHRMHomepaUrl=" http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	   
	   if(Actual_OrangeHRMHomepageTitle.equals(Expected_OrangeHRMHomepageTitle)) 
	   {
		   System.out.println("true");
	   }
	   else {
		   System.out.println("false");   
	   }
			   if(Actual_OrangeHRMHomepageUrl.contains(Expected_OrangeHRMHomepaUrl))
	   {
	   System.out.println("true");
	   }
	   else
	   {
		System.out.println("false");   
	   }
	   
	   
	   driver.findElement(By.id("txtUsername")).sendKeys("MdMahaboob05");
	   driver.findElement(By.id("txtPassword")).sendKeys("MdMahaboob05@");
	   driver.findElement(By.id("btnLogin")).click();
	   
	  // driver.quit();
	   
		}

}
