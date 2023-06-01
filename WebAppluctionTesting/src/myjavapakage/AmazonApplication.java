package myjavapakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplication {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Seleniumapplication/chromedriver.exe");
		String amazonApplication="https://www.amazon.in/";
		driver=new ChromeDriver();
		driver.get(amazonApplication);
		By Amazon=By.tagName("a");
		List<WebElement>links=driver.findElements(Amazon);
		System.out.println("webelement Amazon:"+links.size());
		for(WebElement amz:links) {
			
			System.out.println(amz.getText());
		
		}
		
		
		Thread.sleep(3000);
	}
		
	}


