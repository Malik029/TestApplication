package com.OrangeHRM_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OrangeHERM_AddEmployee_Test_XL {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		WebDriver driver;
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe" );
		driver=new ChromeDriver();
	    driver.get(ApplicationUrl);
	    driver.manage().window().maximize();
	    
	    
	    String string="./src/com/XLFiles/LogInTest_withtestData.xlsx";
	    FileInputStream TestDataORG=new FileInputStream(string);
	    XSSFWorkbook workbook=new XSSFWorkbook(TestDataORG);
	    XSSFSheet ORGsheet=workbook.getSheet("Sheet1");
	    
	   
	    Row row=ORGsheet.createRow(1);
	   // Cell  rowofcell=row.createCell(4);
	  
	    By logInPanel_Locator=By.id("logInPanelHeading");
		WebElement loginPanel=driver.findElement(logInPanel_Locator);
		Cell newCell=row.createCell(0);
		
		String ACtual_loginPanelId=loginPanel.getText();
		System.out.println("the login panel text is :" +ACtual_loginPanelId);
		newCell.setCellValue(ACtual_loginPanelId);
		
		String Expected_loginpanelId="LOGIN Panel";
		Cell newCell0=row.createCell(1);
		newCell0.setCellValue(Expected_loginpanelId);
		
		
		if(ACtual_loginPanelId.equals(Expected_loginpanelId))
		{
			System.out.println("pass");
			Cell newCell1=row.createCell(2);
			newCell1.setCellValue("pass");
		}
		else
		{
			System.out.println("fail");
			Cell newCell2=row.createCell(2);
			newCell2.setCellValue("fail");
		}
	   Row	testdatarow=ORGsheet.getRow(2);
	   Cell rowofcelltestdata=testdatarow.getCell(9);
	 
       String	username=rowofcelltestdata.getStringCellValue();
	
	
		 driver.findElement(By.id("txtUsername")).sendKeys(username);//.sendKeys("MdMahaboob05");
		 Cell passwordrowofcell=testdatarow.getCell(10);
		 String password=passwordrowofcell.getStringCellValue();
		 driver.findElement(By.id("txtPassword")).sendKeys(password);//.sendKeys("MdMahaboob05@");
		 driver.findElement(By.id("btnLogin")).click();
	    
		
	    
	    String Actual_OrangeHrmHomepageUrlAddress=driver.getCurrentUrl();
		System.out.println("the OrangeHRMHomepage current UrlAddress is:-" 
	                                                     +Actual_OrangeHrmHomepageUrlAddress );
		Cell newCell01=row.createCell(7);
		newCell01.setCellValue(Actual_OrangeHrmHomepageUrlAddress);
		
		
		String Expect_OrangeHrmHomepageUrlAddress="orangehrm-4.2.0.1";
		Cell newCell011=row.createCell(6);
		newCell011.setCellValue(Expect_OrangeHrmHomepageUrlAddress);
		if(Actual_OrangeHrmHomepageUrlAddress.contains(Expect_OrangeHrmHomepageUrlAddress))
		{
		     System.err.println(" true");
		     Cell newCell3=row.createCell(8);
				newCell3.setCellValue("Pass");
		}
		else 
		{
		     System.out.println("false");
		     Cell newCell4=row.createCell(8);
				newCell4.setCellValue("fail");
		}
		
		
		String Actual_OrangeHrmHomepageTitle=driver.getTitle();
		System.out.println("the OrangeHRMHomepage Title is:-" +Actual_OrangeHrmHomepageTitle);
		Cell newCell0112=row.createCell(4);
		newCell0112.setCellValue(Actual_OrangeHrmHomepageTitle);
		
		String Expect_OrangeHrmHomepageTitle="OrangeHRM";
		Cell newCell0113=row.createCell(3);
		newCell0113.setCellValue(Expect_OrangeHrmHomepageTitle);
		
		
		if(Actual_OrangeHrmHomepageTitle.equals(Expect_OrangeHrmHomepageTitle))
		{
			 System.out.println(" true");
			 Cell newCell5=row.createCell(5);
				newCell5.setCellValue("Pass");
		}
		else 
		{
			 System.out.println("false");	
			 Cell newCell6=row.createCell(5);
				newCell6.setCellValue("fail");
	    }
		
		
		 By Admin_Locator=By.id("menu_admin_viewAdminModule");
			WebElement Admin=driver.findElement(Admin_Locator);
			String Actual_OrangeHRM_HP_in_ADMIN=Admin.getText();
			System.out.println("the admin text is :" +Actual_OrangeHRM_HP_in_ADMIN);
			Cell newCell014=row.createCell(12);
			newCell014.setCellValue(Actual_OrangeHRM_HP_in_ADMIN);
			
			String Expect_OrangeHRM_HP_in_ADMIN="Admin";
			Cell newCell013=row.createCell(11);
			newCell013.setCellValue(Expect_OrangeHRM_HP_in_ADMIN);
			
			
			if(Actual_OrangeHRM_HP_in_ADMIN.equals(Expect_OrangeHRM_HP_in_ADMIN))
			{
				 System.out.println(" true");
				 Cell newCell012=row.createCell(13);
					newCell012.setCellValue("Pass");
					
			}
			else 
			{
				 System.out.println("false");
				 Cell newCell012=row.createCell(13);
					newCell012.setCellValue("Fail");
		    }
			
		
		By OrangeHRMHeaderblock=By.id("menu_pim_viewPimModule");
		WebElement PIM=driver.findElement(OrangeHRMHeaderblock);
		//Thread.sleep(2000);
		
		Actions PIMAction=new Actions(driver);
		PIMAction.moveToElement(PIM).build().perform();
		//Thread.sleep(2000);
		

		By AddEmployeelocator=By.linkText("Add Employee");
		WebElement AddEmployee=driver.findElement(AddEmployeelocator);
		AddEmployee.click();
		
		
		
		By FullnameLocator=By.xpath("//label[@class='hasTopFieldHelp']");
		WebElement FullName=driver.findElement(FullnameLocator);
		String Actual_AddEmployee_HP_in_FullName=FullName.getText();
		System.out.println("the Full name text is :" +Actual_AddEmployee_HP_in_FullName);
		String Expect_AddEmployee_HP_in_FullName="Full Name";
		
		if(Actual_AddEmployee_HP_in_FullName.equals(Expect_AddEmployee_HP_in_FullName))
		{
			 System.out.println(" true");
		}
		else 
		{
			 System.out.println("false");	
	    }
		String Expect_AddEmployee_HP_in_FirstName="* First Name";
		By FirstNameLocator=By.id("firstName");
		WebElement FirstName=driver.findElement(FirstNameLocator);
	
		FirstName.sendKeys("mohammed");
		String Actual_AddEmployee_HP_in_FirstName=FirstName.getText();
		System.out.println("the First name text is :" +Actual_AddEmployee_HP_in_FirstName);
		
		
		if(Actual_AddEmployee_HP_in_FirstName.equals(Expect_AddEmployee_HP_in_FirstName))
		{
			 System.out.println(" true");
		}
		else 
		{
			 System.out.println("false");	
	    }
		
		
		By MiddleNameLocator=By.id("middleName");
		WebElement MiddleName=driver.findElement(MiddleNameLocator);
		MiddleName.sendKeys("malik");
		String Actual_AddEmployee_HP_in_MiddleName=MiddleName.getText();
		System.out.println("the Middle name text is :" +Actual_AddEmployee_HP_in_MiddleName);
		String Expect_AddEmployee_HP_in_MiddleName="MiddleName";
		
		if(Actual_AddEmployee_HP_in_MiddleName.equals(Expect_AddEmployee_HP_in_MiddleName))
		{
			 System.out.println(" true");
		}
		else 
		{
			 System.out.println("false");	
	    }
		
		
		By LastnameLocator=By.id("lastName");
		WebElement lastName=driver.findElement(LastnameLocator);
		lastName.sendKeys("maheboob");
		String Actual_AddEmployee_HP_in_LastName=lastName.getText();
		System.out.println("the Last name text is :" +Actual_AddEmployee_HP_in_LastName);
		String Expect_AddEmployee_HP_in_LastName="LastName";
		
		if(Actual_AddEmployee_HP_in_LastName.equals(Expect_AddEmployee_HP_in_LastName))
		{
			 System.out.println(" true");
		}
		else 
		{
			 System.out.println("false");	
	    }
	    
	    By EmployeeIDLocator=By.id("employeeId");
		WebElement EmployeeID=driver.findElement(EmployeeIDLocator);
		String Actual_AddEmployee_HP_in_ID=EmployeeID.getText();
		System.out.println("the EmployeeID text is :" +Actual_AddEmployee_HP_in_ID);
		String Expect_AddEmployee_HP_in_ID="";
		
		if(Actual_AddEmployee_HP_in_ID.equals(Expect_AddEmployee_HP_in_ID))
		{
			 System.out.println(" true");
		}
		else 
		{
			 System.out.println("false");	
	    }
		/* By EmployeeIDnameLocator=By.linkText("Employee Id");
			WebElement EmployeeIDn=driver.findElement(EmployeeIDnameLocator);
			String Actual_AddEmployee_HP_in_IDn=EmployeeID.getText();
			
			System.out.println("the EmployeeID text is :" +Actual_AddEmployee_HP_in_IDn);
			String EmpTest=EmployeeIDn.getAttribute("for");
			System.out.println("the EmployeeID text is :" +EmpTest);

			String Expect_AddEmployee_HP_in_IDn="Employee Id";
			
			if(Actual_AddEmployee_HP_in_ID.equals(Expect_AddEmployee_HP_in_ID))
			{
				 System.out.println(" true");
			}
			else 
			{
				 System.out.println("false");	
		    }
		
		*/
		
		/*
		driver.findElement(By.id("firstName")).sendKeys("mohammed");
		 driver.findElement(By.id("lastName")).sendKeys("maheboob");
		 driver.findElement(By.id("btnSave")).click();
		 Thread.sleep(1000);
		*/
		   By admin_LocatorId=By.linkText("Welcome Admin");
			WebElement adminPanel=driver.findElement(admin_LocatorId);
			String adminPanelId=adminPanel.getText();
			System.out.println("the login panel text is :" +adminPanelId);
			adminPanel.click();
		    Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Logout")).click();
			FileOutputStream fileOutPut = new FileOutputStream("./src/com/XLFiles/LogInTest_withtestData.xlsx");
			workbook.write(fileOutPut);

			
			
			//Thread.sleep(3000);
			

		     driver.quit();
		
		}
		

		
	
	}
		
	
