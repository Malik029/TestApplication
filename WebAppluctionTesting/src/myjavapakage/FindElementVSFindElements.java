package myjavapakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class FindElementVSFindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdrive.chrome.driver","./ SeleniumApplication/chromedriver.exe");
		driver=new ChromeDriver();
		String Application="https://www.tsrtconline.in/oprs-web/";
		driver.get(Application);
		
		//FindElements()----->returns multiple web Element
		By TsrtcApplication=By.tagName("a");
		List<WebElement> Tsrtc=driver.findElements(TsrtcApplication);
		System.out.println(" WebElement Tsrtc:"+Tsrtc.size());
		for(WebElement Tsr:Tsrtc)
		{
			System.out.println(Tsr.getText());
		}
		Thread.sleep(8000);
		//List<WebElement> links = driver.findElements(By.xpath("//div[@class='menu-wrap']//a"));
		//System.out.println("Number of elements captured:"+links.size());
		//for(WebElement lin:links)	{
			//System.out.println(lin.getText());
		//}
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	}
}
	
