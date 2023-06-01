package com.OrangeHRM_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2 {
	public static void main(String[] args) {
		
		// Step 1: Automate Browser
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./library/chromedriver.exe");
		driver = new ChromeDriver();
		
		// Step 2: Navigate to OrangeHRM Application
		String applicationURL ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationURL);
		
		// Step 3: Validate Login Page
		String expectedLoginPageTitle = "OrangeHRM";
		String expectedLoginPageURL = "orangehrm-4.2.0.1";
		String expectedLoginPageText = "LOGIN Panel";
		String actualLoginPageTitle = driver.getTitle();
		String actualLoginPageURL = driver.getCurrentUrl();
		String actualLoginPageText = driver.findElement(By.xpath("//div[contains(text(),'LOGIN Panel')]")).getText();
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageURL.contains(expectedLoginPageURL) && actualLoginPageText.equals(expectedLoginPageText)) {
			System.out.println("Login Page validated successfully");
		} else {
			System.out.println("Login Page validation failed");
		}
		
		// Step 4: Login with valid Test Data
		driver.findElement(By.id("txtUsername")).sendKeys("ramesh");
		driver.findElement(By.id("txtPassword")).sendKeys("Ramesh!@#123");
		driver.findElement(By.id("btnLogin")).click();
		
		// Step 5: Validate OrangeHRM Application HomePage
		String expectedHomePageText = "Admin";
		String actualHomePageText = driver.findElement(By.id("welcome")).getText();
		
		if(actualHomePageText.contains(expectedHomePageText)) {
			System.out.println("OrangeHRM Application HomePage validated successfully");
		} else {
			System.out.println("OrangeHRM Application HomePage validation failed");
		}
		
		// Step 6: Automate PIM
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		// Step 7: Automate Add Employee
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		// Step 8: Validate Add EmployeePage
		String expectedAddEmployeePageText = "Full Name";
		String actualAddEmployeePageText = driver.findElement(By.xpath("//h1[contains(text(),'Add Employee')]")).getText();
		
		if(actualAddEmployeePageText.contains(expectedAddEmployeePageText)) {
			System.out.println("Add Employee Page validated successfully");
		} else {
			System.out.println("Add Employee Page validation failed");
		}
		
		// Step 9: Enter Test data into First Name, Middle Name, Last Name fields
		String expectedFirstName = "John";
		String expectedMiddleName = "J";
		String expectedLastName = "Smith";
		String expectedEmployeeID = "";
		
		driver.findElement(By.id("firstName")).sendKeys(expectedFirstName);
		driver.findElement(By.id("middleName")).sendKeys(expectedMiddleName);
		driver.findElement(By.id("lastName")).sendKeys(expectedLastName);
		expectedEmployeeID = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		// Step 11: Click on "Save" button
		driver.findElement(By.id("btnSave")).click();
		
		// Step 12: Navigate to "Personal Details" WebPage
		//AdditionalClasses additionalClasses = new AdditionalClasses();
		



		
		
		
		
	}

}
