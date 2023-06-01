package com.Frames_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Methods.MethodExample02;

public class Jquery_Frame_GetText_withUserDFN {
	WebDriver driver;
	String Application="https://Jqueryui.com/droppable/";
	public void ApplicationLaunch() {
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Application);
		driver.manage().window().maximize();
		
	}
	public void FrameGetText() throws InterruptedException  {
	By	WebpageFrame=By.className("demo-frame");
	WebElement webpageframe=driver.findElement(WebpageFrame);
	driver.switchTo().frame(webpageframe);
	By	dragmetomytorgetLocator=By.id("draggable");
	WebElement dragmetomytrget=driver.findElement(dragmetomytorgetLocator);
	String dragmetomyText=dragmetomytrget.getText();
	System.out.println("the text is:-"+dragmetomyText);
	Thread.sleep(1000);
	}
	public void Aclose() throws InterruptedException{
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 Jquery_Frame_GetText_withUserDFN b1=new Jquery_Frame_GetText_withUserDFN();
		 b1.ApplicationLaunch();
		b1.FrameGetText();
		
		b1.Aclose();
		MethodExample02 b2=new MethodExample02();
		b2.addition();
		
		
	}

}
