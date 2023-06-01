package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yourArdersElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String YourOrderApplication="http://amazon.in";
		driver.get(YourOrderApplication);
		
		
		//id="nav-link-accountLis"-Hello SignIn element property
		
		By HelloSignInLocator=By.xpath("//a[@id='nav-link-accountList']");
		WebElement helloSignIn=driver.findElement(HelloSignInLocator);
		Thread.sleep(2000);
		
		//mouse Hover Operation be performed on "Hello SignIn"Elment
		
		
		Actions helloSignInAction=new Actions(driver);
		helloSignInAction.moveToElement(helloSignIn).build().perform();
		Thread.sleep(2000);
		
		//your orders element Test
		// Locater-LinkText
		//selector- your Orders
		By yourOrderslocator=By.linkText("Your Orders");
		WebElement yourOrders=driver.findElement(yourOrderslocator);
		yourOrders.click();
	} 

}
