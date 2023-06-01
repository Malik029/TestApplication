package com.TestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BeseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRM_AddEmployee extends LogInTest {

	@Test(priority = 5, description = "OHRMHomepagevalidation")
	public void AddEmployee() throws InterruptedException {

		By OrangeHRMPIM = By.xpath(propertiesA.getProperty("OHRMHomePagePIMProperty"));
		// By OrangeHRMHeaderblock=By.xpath("//a[@id='menu_pim_viewPimModule']");
		WebElement PIM = driver.findElement(OrangeHRMPIM);
		String PIMTest = PIM.getText();
		Log.info(PIMTest);

		// Thread.sleep(2000);

		Actions PIMAction = new Actions(driver);
		PIMAction.moveToElement(PIM).build().perform();
		// Thread.sleep(2000);

		By AddEmployeelocator = By.xpath(propertiesA.getProperty("OHRMHPAddEmployeeProperty"));
		WebElement AddEmployee = driver.findElement(AddEmployeelocator);
		AddEmployee.click();

	}

	@Test(priority = 6, description = "OHRMAddEmployeeHeaderTestData")
	public void AddEmployeeHeaderTest() throws InterruptedException {

		By EmployeeIDnameLocator = By.xpath(propertiesA.getProperty("OHRMHPAddEmployeeHeaderProperty"));
		WebElement EmployeeIDn = driver.findElement(EmployeeIDnameLocator);
		String Actual_AddEmployee_HP_in_IDn = EmployeeIDn.getText();

		System.out.println("the Employee Header text is :" + Actual_AddEmployee_HP_in_IDn);
		Cell newCell014 = row.createCell(15);
		newCell014.setCellValue(Actual_AddEmployee_HP_in_IDn);

		Cell newCell15 = row.getCell(14);
		String Expect_AddEmployee_HP_in_IDn = newCell15.getStringCellValue();

		if (Actual_AddEmployee_HP_in_IDn.equals(Expect_AddEmployee_HP_in_IDn)) {
			System.out.println(" true");
			Cell newCell012 = row.createCell(16);
			newCell012.setCellValue("Pass");
		} else {
			System.out.println("false");
			Cell newCell012 = row.createCell(16);
			newCell012.setCellValue("false");
		}

	}

	@Test(priority = 7, description = "OHRMAddEmployeeFullNameData")
	public void AddEmployeeFullNameTestData() throws InterruptedException {

		By FullnameLocator = By.xpath(propertiesA.getProperty("OHRMHPAddEmployeeFullNameProperty"));
		WebElement FullName = driver.findElement(FullnameLocator);
		String Actual_AddEmployee_HP_in_FullName = FullName.getText();
		System.out.println("the Full name text is :" + Actual_AddEmployee_HP_in_FullName);

		Cell newCell014 = row.createCell(18);
		newCell014.setCellValue(Actual_AddEmployee_HP_in_FullName);

		Cell newCell01 = row.getCell(17);
		String Expect_AddEmployee_HP_in_FullName = newCell01.getStringCellValue();

		if (Actual_AddEmployee_HP_in_FullName.equals(Expect_AddEmployee_HP_in_FullName)) {
			System.out.println(" true");
			Cell newCell012 = row.createCell(19);
			newCell012.setCellValue("Pass");
		} else {
			System.out.println("false");
			Cell newCell012 = row.createCell(19);
			newCell012.setCellValue("false");
		}

	}

	@Test(priority = 8, description = "OHRMAddEmployeeFirstNameData1")
	public void AddEmployeeFirstNameTestData1() throws InterruptedException, IOException {

		for (int rowIndex1 = 1; rowIndex1 <= 9; rowIndex1++) {

			Row row1 = Sheet.getRow(rowIndex1);
			Cell rowofcelltestdata = row1.getCell(20);
			String Expected_FirstName = rowofcelltestdata.getStringCellValue();

			By FirstNameLocator = By.xpath(propertiesA.getProperty("OHRMHPAddEmployeeFirstNameProperty"));
			WebElement FirstName = driver.findElement(FirstNameLocator);
			FirstName.sendKeys(Expected_FirstName);

			AddEmployeeAction = new Actions(driver);
			AddEmployeeAction.sendKeys(Keys.TAB).build().perform();

			Cell rowofcelltestdata1 = row1.getCell(23);
			String Expected_middleName = rowofcelltestdata1.getStringCellValue();
			AddEmployeeAction.sendKeys(Expected_middleName).build().perform();

			AddEmployeeAction.sendKeys(Keys.TAB).build().perform();

			Cell rowofcelltestdata2 = row1.getCell(26);
			String Expected_LastName = rowofcelltestdata2.getStringCellValue();
			AddEmployeeAction.sendKeys(Expected_LastName).build().perform();

			AddEmployeeAction.sendKeys(Keys.TAB).build().perform();
			By EmployeeIdLocator = By.id(propertiesA.getProperty("OHRMHPAddEmployeeIDInTestPropert"));
			WebElement EmployeeId = driver.findElement(EmployeeIdLocator);
			String Expected_EmployeeId = EmployeeId.getAttribute("value");
			System.out.println(Expected_EmployeeId);
			Cell rowofcell29 = row1.createCell(29);
			rowofcell29.setCellValue(Expected_EmployeeId);

			// AddEmployeeAction.sendKeys(Keys.TAB).build().perform();
			AddEmployeeAction.sendKeys(Keys.TAB).build().perform();
			AddEmployeeAction.sendKeys(Keys.ENTER).build().perform();

			/*
			 * WebElement photoUpload = driver.findElement(By.id("")); JavascriptExecutor jr
			 * = (JavascriptExecutor) driver; jr.executeScript("argument[0].click();",
			 * photoUpload);
			 */ 
			
			Thread.sleep(1000);
			  Runtime.getRuntime().exec(System.getProperty("user.dir")+"./UploadPhoto/FileUpload.exe");
			  
			  Thread.sleep(1000);
			
			AddEmployeeAction.sendKeys(Keys.TAB).build().perform();

			AddEmployeeAction.sendKeys(Keys.TAB).build().perform();
			AddEmployeeAction.sendKeys(Keys.ENTER).build().perform();

			driver.navigate().back();
			driver.navigate().refresh();

			fileOutPut = new FileOutputStream(
					"./src/com/ApplicationTestResultFile/OrangeHRMApplicationTestResultFile1.xlsx");
			workbook.write(fileOutPut);

		}
	}
}
