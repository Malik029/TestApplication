package com.OrangeHRMApplicationWebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BeseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMHomePage extends BaseTest {

	public OrangeHRMHomePage() // it is a constructor - the class name is similar to
	// Method name(its called as constructor)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement OrangeHRMHomePageLogo;

	@FindBy(xpath = "//a[@class='firstLevelMenu']")
	WebElement OrangeHRMHomePageAdmin;

	@FindBy(xpath = "//b[contains(text(),'PIM')]")
	WebElement OrangeHRMHomePagePIM;

	@FindBy(xpath = "//b[contains(text(),'Leave')]")
	WebElement OrangeHRMHomePageLeave;

	@FindBy(xpath = "//b[contains(text(),'Time')]")
	WebElement OrangeHRMHomePageTime;

	@FindBy(xpath = "//b[contains(text(),'Recruitment')]")
	WebElement OrangeHRMHomePageRecruitment;

	@FindBy(xpath = "//a[@id='menu__Performance']")
	WebElement OrangeHRMHomePagePerformance;

	@FindBy(xpath = "//a[@id='menu_dashboard_index']")
	WebElement OrangeHRMHomePagedashboard;

	@FindBy(xpath = "//a[@id='menu_directory_viewDirectory']")
	WebElement OrangeHRMHomePagedirectory;

	@FindBy(xpath = "//a[@id='menu_maintenance_purgeEmployee']")
	WebElement OrangeHRMHomePagemaintenance;

	public void OrangeHRMHomePageLogoTest() {

		boolean flag = OrangeHRMHomePageLogo.isDisplayed();
		Log.info("Validating OHRM Application LogInPage Logo");

		Assert.assertTrue(flag, "OrangeHRM Application LogIN Page does not contains OrangeHRMLogo - FAIL");
	}

	public void OrangeHRMHomePageAdminTest() {

		String Actual_OrangeHRMHomePageAdminLocator = OrangeHRMHomePageAdmin.getText();
		Log.info("Actual_OrangeHRM HomePage Admin Text is:-" + Actual_OrangeHRMHomePageAdminLocator);

		String Expected_OrangeHRMHomePageAdminLocator = "Admin";
		Log.info("Expected_OrangeHRM HomePage Admin Text is:-" + Expected_OrangeHRMHomePageAdminLocator);

		Assert.assertEquals(Actual_OrangeHRMHomePageAdminLocator, Expected_OrangeHRMHomePageAdminLocator,
				"OrangeHRM HomePage Admin Test is :-FAIL");

	}

	public void OrangeHRMHomePagePIMTest() {

		String Actual_OrangeHRMHomePagePIMTestL = OrangeHRMHomePagePIM.getText();
		Log.info("Actual_OrangeHRM HomePage PIM Test is:-" + Actual_OrangeHRMHomePagePIMTestL);

		String Expected_OrangeHRMHomePagePIMTestL = "PIM";
		Log.info("Expected_OrangeHRM HomePage PIM Text is:-" + Expected_OrangeHRMHomePagePIMTestL);

		Assert.assertEquals(Actual_OrangeHRMHomePagePIMTestL, Expected_OrangeHRMHomePagePIMTestL,
				"OrangeHRM HomePage PIM Test is:-FAIL");
		Actions PIM = new Actions(driver);
		PIM.moveToElement(OrangeHRMHomePagePIM).build().perform();
	}

	public void OrangeHRMHomePageLeaveTest() {

		String Actual_OrangeHRMHomePageLeaveL = OrangeHRMHomePageLeave.getText();
		Log.info(" Actual_OrangeHRM HomePage Leave Test is:-" + Actual_OrangeHRMHomePageLeaveL);

		String Expected_OrangeHRMHomePageLeaveL = "LeaveTe";
		Log.info("Expected_OrangeHRM HomePage Leave Text is:-" + Expected_OrangeHRMHomePageLeaveL);
		Assert.assertEquals(Actual_OrangeHRMHomePageLeaveL, Expected_OrangeHRMHomePageLeaveL,
				"OrangeHRM HomePage Leave is:-FAIL");

	}

	public void OrangeHRMHomePageTimeTest() {

		String Actual_OrangeHRMHomePageTimeL = OrangeHRMHomePageTime.getText();
		Log.info("Actual_OrangeHRM HomePage Time Text is:-" + Actual_OrangeHRMHomePageTimeL);

		String Expected_OrangeHRMHomePageTimeL = "Time";
		Log.info("Expected_OrangeHRM HomePage Time Text" + Expected_OrangeHRMHomePageTimeL);

		Assert.assertEquals(Actual_OrangeHRMHomePageTimeL, Expected_OrangeHRMHomePageTimeL,
				"OrangeHRM HomePage Time is:-FAIL");

	}

	public void OrangeHRMHomePagePerformanceTest() {

		String Actual_OrangeHRMHomePagePerformanceL = OrangeHRMHomePagePerformance.getText();
		Log.info("Actual_OrangeHRM HomePage Performance Text is:-" + Actual_OrangeHRMHomePagePerformanceL);

		String Expected_OrangeHRMHomePagePerformanceL = "Performance";
		Log.info("Expected_OrangeHRM HomePage Performance Text is:-" + Expected_OrangeHRMHomePagePerformanceL);

		Assert.assertEquals(Actual_OrangeHRMHomePagePerformanceL, Expected_OrangeHRMHomePagePerformanceL,
				"OrangeHRM HomePage Performance is:-FAIL");

	}

}
