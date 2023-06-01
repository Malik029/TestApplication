package com.TestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BeseTest.BaseTest;
import com.Utility.Log;


public class LogInTest extends BaseTest {
	

	 Row testdatarow;
	    Row row;
		Cell newCell;
		 FileInputStream TestDataORG;
		 XSSFWorkbook workbook;
		 XSSFSheet Sheet;
		 FileInputStream PropertyFile;
		 Properties propertiesA;
			FileOutputStream fileOutPut;
			Actions AddEmployeeAction;
			
		@Test(priority=1,description="LogIn")
		public void LogInPage() throws IOException {
			
			PropertyFile=new FileInputStream("./src/main/java/com/Config/OrangeHRMApplication.properties");
			 propertiesA=new Properties();
			propertiesA.load(PropertyFile);
			
			
			
			 String string="./src/main/java/OrangeHRMApplicationTestDataFile/ApplicationTestDataFiles.xlsx";
			     TestDataORG=new FileInputStream(string);
			   workbook=new XSSFWorkbook(TestDataORG);
			     Sheet=workbook.getSheet("Sheet1");
			       row=Sheet.getRow(1);
			    
			   //row=Sheet.createRow(1);
			 By logInPanel_Locator=By.id(propertiesA.getProperty("orangeHRMApplicationLogInPageLogInPanelProperty"));
				WebElement loginPanel=driver.findElement(logInPanel_Locator);

				String ACtual_loginPanelId=loginPanel.getText();
				System.out.println("the login panel text is :" +ACtual_loginPanelId);
				Cell newCell=row.createCell(1);
				newCell.setCellValue(ACtual_loginPanelId);
				
				Cell rowofcell=row.getCell(0);
			   String Expect_loginPanelId=rowofcell.getStringCellValue();
				
					
                
			     
				
				if(ACtual_loginPanelId.equals(Expect_loginPanelId))
				{
					Log.info("pass");
					newCell=row.createCell(2);
					newCell.setCellValue("Pass");
					
					
				}
				else
				{
					Log.info("fail");
					newCell=row.createCell(2);
					newCell.setCellValue("Fail");
					
					
				}
					
					
		}
				@Test(priority=2,description="ValidationTest")
				public void logInPageValidationTest() throws IOException 
				{
					for(int rowIndex=1;rowIndex<=9;rowIndex++) {
				 testdatarow=Sheet.getRow(rowIndex);
				   Cell rowofcelltestdata=testdatarow.getCell(9);
			      String username=rowofcelltestdata.getStringCellValue();
					 driver.findElement(By.id(propertiesA.getProperty("userNameElementProprty"))).sendKeys(username);//.sendKeys("MdMahaboob05");
					 
					Cell passwordrowofcell=testdatarow.getCell(10);
					 String password=passwordrowofcell.getStringCellValue();
					 driver.findElement(By.id(propertiesA.getProperty("passwordElementProperty"))).sendKeys(password);//.sendKeys("MdMahaboob05@");
					 driver.findElement(By.id(propertiesA.getProperty("logInPageSubmitButtonProperty"))).click();
				} driver.manage().window().maximize();
		}
			@Test(priority=3,description="ORGHrmTest")
			public void ORGHrmTest() throws IOException {

			 String Actual_OrangeHrmHomepageUrlAddress=driver.getCurrentUrl();
				System.out.println("the OrangeHRMHomepage current UrlAddress is:-" 
			                                           +Actual_OrangeHrmHomepageUrlAddress );
				newCell=row.createCell(7);
				newCell.setCellValue(Actual_OrangeHrmHomepageUrlAddress);
				
				Cell rowofcell6=row.getCell(6);
				String Expect_OrangeHrmHomepageUrlAddress=rowofcell6.getStringCellValue();
				
				
			      
					
				
				if(Actual_OrangeHrmHomepageUrlAddress.contains(Expect_OrangeHrmHomepageUrlAddress))
				{
					Log.info(" true");
				     newCell=row.createCell(8);
						newCell.setCellValue("Pass");
						
				    
				}
				else {
				
					Log.info("false");
				     newCell=row.createCell(8);
						newCell.setCellValue("Fail");
				    
				}
			}
				@Test(priority=4,description="ORGHrmTest")
				public void ORGHrmTest2() throws IOException {
					

				String Actual_OrangeHrmHomepageTitle=driver.getTitle();
				System.out.println("the OrangeHRMHomepage Title is:-" +Actual_OrangeHrmHomepageTitle);
				newCell=row.createCell(4);
				newCell.setCellValue(Actual_OrangeHrmHomepageTitle);
	
				 Cell rowofcell3=row.getCell(3);
			      String Expect_OrangeHrmHomepageTitle=rowofcell3.getStringCellValue();
			      
			     
				
				if(Actual_OrangeHrmHomepageTitle.equals(Expect_OrangeHrmHomepageTitle))
				{
					Log.info(" true");
					 newCell=row.createCell(5);
						newCell.setCellValue("Pass");
					
				}
				else 
				{
					Log.info("false");
					 newCell=row.createCell(5);
						newCell.setCellValue("Fail");
					
			  }
				
				}
				@Test(priority=9,description="OHRMLogout")
				public void WelcomeAdmin() throws IOException, InterruptedException  {
					

					By admin_LocatorId=By.xpath(propertiesA.getProperty("welComeAdminProperty"));
					WebElement adminPanel=driver.findElement(admin_LocatorId);
					adminPanel.click();
					String adminPanelId=adminPanel.getText();
					
					Log.info("the welcomeAdmin text is :" +adminPanelId);
					
					String Expected="welCome Admin";
					Thread.sleep(1000);
					driver.findElement(By.xpath(propertiesA.getProperty("homePageLogOutProperty"))).click();	
				 
				
		     fileOutPut= new FileOutputStream("/src/main/java/OrangeHRMApplicationTestResultFile/OrangeHRMApplicationTestResultFile1.xlsx");
			    workbook.write(fileOutPut);
		     
         }
		     }		
