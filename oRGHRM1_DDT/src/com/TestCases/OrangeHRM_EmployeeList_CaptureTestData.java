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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BeseTest.BaseTest;



public class OrangeHRM_EmployeeList_CaptureTestData extends LogInTest{
	FileInputStream PropertyFile;
	Properties propertiesA;
	Row row;
	Cell rowofCell;
	FileInputStream TestDataFile;
	XSSFWorkbook workBook1;
	XSSFSheet testDataSheet;
	FileOutputStream fileOutPut;
	
	 
	 @Test(priority=5,description="OHRMHomepagePIMvalidation")
		public void PIM() throws InterruptedException, IOException {
		 PropertyFile=new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
		 propertiesA=new Properties();
		propertiesA.load(PropertyFile);
		
		
		
		TestDataFile = new FileInputStream
				("./src/com/ApplicationTestResultFile/OrangeHRMApplicationLogInTestResultFile.xlsx");
		workBook1 = new XSSFWorkbook(TestDataFile);
		testDataSheet = workBook1.getSheet("sheet1");
		
		
		By OrangeHRMPIM=By.xpath(propertiesA.getProperty("OHRMHomePagePIMProperty"));
		//By OrangeHRMHeaderblock=By.xpath("//a[@id='menu_pim_viewPimModule']");
	WebElement PIM=driver.findElement(OrangeHRMPIM);
	
	String PIMTest=PIM.getText();
	System.out.println(PIMTest);
	

	//Thread.sleep(2000);
	
	Actions PIMAction=new Actions(driver);
	PIMAction.moveToElement(PIM).build().perform();
		

				
	}
	 
	@Test(priority=6,description="EmployeeListTest")
	 public void EmployeeListTestData() throws IOException{
		
	    	
	    	By EmployeeListLocator=By.xpath(propertiesA.getProperty("OHRMHPEmployeeListTestPropert"));
			WebElement AddEmployee=driver.findElement(EmployeeListLocator);
			AddEmployee.click();
	}
	
	
			@Test(priority=7,description="AddEmployeeListWebTableTest")
			 public void AddEmployeeListWebTabletest() throws IOException{
				
			
			
			By webTableLocator=By.xpath(propertiesA.getProperty("OHRMHPAddEmployeeListTableDataPropert"));
			WebElement webTable=driver.findElement(webTableLocator);
			
			
			By rowsLocator=By.tagName(propertiesA.getProperty("OHRMHPAddEmployeeListTableTagNameDataPropert"));
			List<WebElement>rows=webTable.findElements(rowsLocator);
			
			for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
			{
				Row newRow=testDataSheet.createRow(rowIndex-1);
				
				By rowOfCellLocator=By.tagName(propertiesA.getProperty("OHRMHPAddEmployeeListTableTagName1DataPropert"));
				List<WebElement>rowOfCells=rows.get(rowIndex).findElements(rowOfCellLocator);
				
				// to goto every Row of all the Cells
				for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
				{
					Cell newRowOfCell=newRow.createCell(rowOfCellIndex);
					String testData=rowOfCells.get(rowOfCellIndex).getText();
					
					newRowOfCell.setCellValue(testData);
					System.out.print(testData+"  ");
					
					
	      			}
				System.out.println();
			}
	
			}
			@Test(priority=8,description="OHRMLogout")
			public void WelcomeAdmin() throws IOException, InterruptedException  {
				

				By admin_LocatorId=By.xpath(propertiesA.getProperty("welComeAdminProperty"));
				WebElement adminPanel=driver.findElement(admin_LocatorId);
				String adminPanelId=adminPanel.getText();
				
				System.out.println("the welcomeAdmin text is :" +adminPanelId);
				
				String Expected="welCome Admin";
				Thread.sleep(2000);
				driver.findElement(By.xpath(propertiesA.getProperty("homePageLogOutProperty"))).click();	
			 
			
	         fileOutPut = new FileOutputStream
					("./src/com/ApplicationTestResultFile/OrangeHRMApplicationLogInTestResultFile.xlsx");
                   workBook1.write(fileOutPut);
	
       }
      }