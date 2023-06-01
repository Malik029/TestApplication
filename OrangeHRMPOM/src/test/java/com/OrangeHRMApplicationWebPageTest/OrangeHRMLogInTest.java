package com.OrangeHRMApplicationWebPageTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.BeseTest.BaseTest;
import com.OrangeHRMApplicationWebPage.OrangeHRMLogInPage;
import com.Utility.Log;

public class OrangeHRMLogInTest extends BaseTest {
	
	
	
	
	OrangeHRMLogInPage logInPage;
	
	@Test(priority=1,description="Validating LogIn page LogInPanel Text")
	public void validatingLogInPageTextTest()
	{
		logInPage= new OrangeHRMLogInPage();
		logInPage.validatingLogInPageText();//validatingLogInPageText
		
		Log.info(" Validating LogIn Page LogInPanel Text Successfull - Naviagated to LogIN Page");
		
	}
	
	
	@Test(priority=2,description="Validating LogIn Functionality")
	public void validatingLogInTest() throws InterruptedException, IOException
	{
		
		 FileInputStream TestDataFil=new FileInputStream("./src/main/java/OrangeHRMApplicationTestDataFile/ApplicationTestDataFiles.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(TestDataFil);
		 XSSFSheet Sheet=workbook.getSheet("Sheet1");
		
		for(int rowindex=1;rowindex<=9;rowindex++) {
			
			Row row=Sheet.getRow(rowindex);
			
			 Cell rowofcelltestdata=row.getCell(9);
		      String username=rowofcelltestdata.getStringCellValue();
		      
		      Cell passwordrowofcell=row.getCell(10);
				 String password=passwordrowofcell.getStringCellValue();
				 
					logInPage= new OrangeHRMLogInPage();	
		logInPage.validatingLogIn(username, password);
		//Thread.sleep(1000);
		
		Log.info("Validation of LogIn functionality Successfull");
		
	}
	}
	
	@Test(priority=4,description="Validating LogIn Page Logo")
	public void validatingLogInPageLogoTest()
	{
		logInPage= new OrangeHRMLogInPage();
		logInPage.validatingLogInPageLogo();
		
		Log.info(" OrangeHRM Appliction LogIn Page Logo existing");
	}
	

}
