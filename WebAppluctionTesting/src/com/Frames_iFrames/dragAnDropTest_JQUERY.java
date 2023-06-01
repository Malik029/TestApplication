package com.Frames_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnDropTest_JQUERY {
	WebDriver driver;
	String Application="https://Jqueryui.com/droppable/";
	public void ApplicationLaunch() {
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Application);
		driver.manage().window().maximize();
		
	}
	public void dragAndDropTest() throws InterruptedException  {
	By	WebpageFrame=By.className("demo-frame");
	WebElement webpageframe=driver.findElement(WebpageFrame);
	driver.switchTo().frame(webpageframe);
	By	dragmetomytorgetLocator=By.id("draggable");
	WebElement dragmetomytrget=driver.findElement(dragmetomytorgetLocator);
           By drophereLocator=By.id("droppable");
           WebElement Drophere=driver.findElement(drophereLocator);
           Actions dragAction=new Actions(driver);
           dragAction.dragAndDrop(dragmetomytrget, Drophere).build().perform();
           driver.switchTo().defaultContent();//we will go another element come out of the frame use this
	}
	public void resizabletest() {
		//this element is link test
		 By resizableTitle=By.linkText("Resizable");
		 WebElement resizable=driver.findElement(resizableTitle);
		 resizable.click();
		 String b=driver.getTitle();
		 System.out.println(b);
	}
	void clos(){
	driver.quit();	
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		 dragAnDropTest_JQUERY c=new  dragAnDropTest_JQUERY();
		 c.ApplicationLaunch();
		 c.dragAndDropTest();
		 c.resizabletest();
		 c.clos();
		
		
	}

}
