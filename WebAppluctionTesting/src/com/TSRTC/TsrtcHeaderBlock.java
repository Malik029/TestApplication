package com.TSRTC;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcHeaderBlock {
	public static void main(String[] args) {

		WebDriver driver;
		String webApplication = "https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(webApplication);

		By tsrtcHomePageHeaderBlockLocator = By.className("menu-wrap");
		WebElement tsrtcHomepageHeaderBlock = driver.findElement(tsrtcHomePageHeaderBlockLocator);
		System.out.println(tsrtcHomepageHeaderBlock);
		By headerBlocksLinksLocator = By.tagName("a");
		List<WebElement> tsrtcHomepageHeaderBlockLinks = tsrtcHomepageHeaderBlock
				.findElements(headerBlocksLinksLocator);

		for (int tsrtcHomepageHeaderBlockLinksIndex = 0; tsrtcHomepageHeaderBlockLinksIndex < tsrtcHomepageHeaderBlockLinks
				.size(); tsrtcHomepageHeaderBlockLinksIndex++) {

			String tsrtcHomepageHeaderBlockLinkName = tsrtcHomepageHeaderBlockLinks
					.get(tsrtcHomepageHeaderBlockLinksIndex).getText();
			System.out.println(tsrtcHomepageHeaderBlockLinksIndex + "--" + tsrtcHomepageHeaderBlockLinkName);

			WebElement currentLink = tsrtcHomepageHeaderBlockLinks.get(tsrtcHomepageHeaderBlockLinksIndex);
			String currentLinkUrl = currentLink.getAttribute("href");
			System.out.println("Expected URL: " + currentLinkUrl);

			currentLink.click();
			String tsrtcWebPageTitle = driver.getTitle();
			System.out.println("the title of the current webpage :--" + tsrtcWebPageTitle);
			String tsrtcwebPageCurrentURL_Address = driver.getCurrentUrl();
			System.out.println("the current url Address of the webpage is :-" + tsrtcwebPageCurrentURL_Address);

			if (tsrtcwebPageCurrentURL_Address.equals(currentLinkUrl)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			File tsrtcscreenShots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(tsrtcscreenShots, new File("./screenshots/" + tsrtcHomepageHeaderBlockLinksIndex
						+ tsrtcHomepageHeaderBlockLinkName + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("successfully getScreenShots");
			driver.navigate().back();

			tsrtcHomepageHeaderBlock = driver.findElement(tsrtcHomePageHeaderBlockLocator);
			tsrtcHomepageHeaderBlockLinks = tsrtcHomepageHeaderBlock.findElements(headerBlocksLinksLocator);
		}

		driver.quit();

	}

}
