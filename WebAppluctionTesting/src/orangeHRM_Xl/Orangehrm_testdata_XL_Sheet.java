package orangeHRM_Xl;

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

public class Orangehrm_testdata_XL_Sheet {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard"; // variable saved with url Address

		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
		driver = new ChromeDriver();

		// Maximizing the Browser
		driver.manage().window().maximize();

		driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress

		// validating title of OrnageHRM Application LogIn Page

		String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
		System.out.println(" The Expected title of the OrnageHRM Application LogIn Page is:- "+expected_OrangeHRMApplicationLogInPageTitle);

		String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
		System.out.println(" The Actual title of the OrnageHRM Application LogIn Page is:- "+actual_OrangeHRMApplicationLogInPageTitle);

		if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
		{
		System.out.println(" Title of OrangeHRM Application LogIn Page Matched - PASS");
		}
		else
		{
		System.out.println(" Title of OrangeHRM Application LogIn Page NOT Matched - FAIL");
		}


		// validating URL of OrnageHRM Application LogIn Page
		String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected Url address of the OrnageHRM Application LogIn Page is:- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

		String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The actual Url address of the OrnageHRM Application LogIn Page is:- "+actual_OrangeHRMApplicationLogInPageUrlAddress);

		if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
		{
		System.out.println(" URL Address of OrangeHRM Application found with the expected text - PASS");
		}
		else
		{
		System.out.println("URL Address of OrangeHRM Application NOT found with the expected text - FAIL");
		}

		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println(" Thed expected text of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

		// <div id="logInPanelHeading">LOGIN Panel</div>
		By logInPanelLocator=By.id("logInPanelHeading");
		WebElement logInPanel=driver.findElement(logInPanelLocator);
		String actual_OrangeHRMApplicationLogInPanelText=logInPanel.getText();

		System.out.println(" THe actual text of OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPanelText);

		if(actual_OrangeHRMApplicationLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - PASS");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
		}

		// validating LogIn Functionality - test data from External file Excel
		// Identifying the external file Excel

		FileInputStream testDataFile = new FileInputStream("./src/com/XLFiles/Book1_Orange.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Reading the data from the Row of a Cell
		Row testDataRow=testDataSheet.getRow(0);
		Cell userNameTestDataRowOfCell=testDataRow.getCell(0);
		String userNameTestData=userNameTestDataRowOfCell.getStringCellValue();

		System.out.println(" The UserName is :- "+userNameTestData);
		// String userNameTestData="srini";
		//id="txtUsername"
		By userNameLocator=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys(userNameTestData); // sending the test data of an Excel file

		Cell passwordTestDataRowOfCell=testDataRow.getCell(1);
		String passwordTestData=passwordTestDataRowOfCell.getStringCellValue();
		System.out.println(" The Password is:- "+passwordTestData);

		//String passwordTestData="Q@Trainer7";
		//name="txtPassword"
		By passwordLocator=By.name("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys(passwordTestData); // sending the test data of an Excel file

		// class="button"
		By logInPageLogInButtonLocator=By.className("button");
		WebElement logInPageLogInButton=driver.findElement(logInPageLogInButtonLocator);
		logInPageLogInButton.click();

		String expected_OrangeHRMApplicationHomePageText="Admin";
		System.out.println(" The Expected OrnageHRM Application HomePage Text is:- "
		+expected_OrangeHRMApplicationHomePageText);

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welcomeAdminLocator=By.partialLinkText("Welcome");
		WebElement welComeAdmin=driver.findElement(welcomeAdminLocator);
		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();

		System.out.println(" The Actual OrnageHRM Application HomePage Text is:- "
		+actual_OrangeHRMApplicationHomePageText);

		if(actual_OrangeHRMApplicationHomePageText.contains
		(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");

		Cell newCell=testDataRow.createCell(3);
		newCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");

		}
		else
		{
		System.out.println(" Failed to navigate to OrangeHRM Application HomePage - FAIL");
		Cell newCell=testDataRow.createCell(2);
		newCell.setCellValue("Failed to navigate to OrangeHRM Application HomePage - FAIL");
		}

		FileOutputStream fileOutPut = new FileOutputStream("./src/com/XLFiles/Book1_Orange.xlsx");
		workBook.write(fileOutPut);

		welComeAdmin.click();

		// wait - java
		Thread.sleep(10000);

		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		By logOutLocator=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutLocator);
		logOut.click();

		expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println(" Thed expected text of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

		// <div id="logInPanelHeading">LOGIN Panel</div>
		logInPanelLocator=By.id("logInPanelHeading");
		logInPanel=driver.findElement(logInPanelLocator);
		actual_OrangeHRMApplicationLogInPanelText=logInPanel.getText();

		System.out.println(" THe actual text of OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPanelText);

		if(actual_OrangeHRMApplicationLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - PASS");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
		}



		driver.quit();



		}

		

		
		
		
		
		
		
	}


