package com.OrangeHRM_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Employee_OrangeHRM {
	WebDriver driver ;
	String applicationURL ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	public void browserLaunch() {


		System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	public void navigateOrangeHRM() {
		driver.get(applicationURL);
	}
	public void validateLoginPage() {
		String extectedOrangeHRM_Title ="OrangeHRM";
		System.out.println(extectedOrangeHRM_Title);
		String actualOrangeHRM_Title =driver.getTitle();
		System.out.println(actualOrangeHRM_Title);
		if(actualOrangeHRM_Title.equals(extectedOrangeHRM_Title)) {
			System.out.println("Both are Equal");
		}else {
			System.out.println("not Equal");
		}


		String extectedOrangeHRM_URL ="orangehrm-4.2.0.1";
		System.out.println(extectedOrangeHRM_URL);
		String actualOrangeHRM_URL =driver.getCurrentUrl();
		System.out.println(actualOrangeHRM_URL);
		if(actualOrangeHRM_URL.contains(extectedOrangeHRM_URL)) {
			System.out.println("Both are Equal");
		}else {
			System.out.println("not Equal");
		}

		String extectedOrangeHRM_loginText ="LOGIN Panel";
		System.err.println(extectedOrangeHRM_loginText);
		By loginPanel_Locator = By.id("logInPanelHeading");
		WebElement actual_orangeHRM_loginPanel =driver.findElement(loginPanel_Locator);
		String actualOrangeHRM_loginText = actual_orangeHRM_loginPanel.getText();
		System.out.println(actualOrangeHRM_loginText);
		if(actualOrangeHRM_loginText.equals( extectedOrangeHRM_loginText)) {
			System.out.println("Both are Equal");
		}else {
			System.out.println("not Equal");
		}
	}
	public void loginWith_validTest_data() {
		String string = "MdMahaboob05";
		String string2 = "MdMahaboob05@";
		By loginUserNameLocator= By.id("txtUsername");
		WebElement loginUserName=	driver.findElement(loginUserNameLocator);
		loginUserName.sendKeys(string);
		By loginPasswordLocator= By.id("txtPassword");
		WebElement loginPassword=	driver.findElement(loginPasswordLocator);
		loginPassword.sendKeys(string2);
		By loginButtonLocator= By.id("btnLogin");
		WebElement loginButton=	driver.findElement(loginButtonLocator);
		loginButton.click();

	}
	public void Validate_OrangeHRM_Application_HomePage () {
		String expectedName = "Admin";
		System.out.println(expectedName);
		By actual_welcomeAdmin_Locator=By.linkText("Welcome Admin");
		WebElement actual_welcomeAdmin =driver.findElement(actual_welcomeAdmin_Locator);
		String actual_welcome=actual_welcomeAdmin.getText();
		System.out.println(actual_welcome);
		if (actual_welcome.contains(expectedName)) {
			System.out.println("is's TRUE");
		}
		else
		{
			System.out.println("it's FALSE");
		}
	}
	public void automatePIM(){
		By automatePIM_Locator=By.id("menu_pim_viewPimModule");
	   WebElement automatePIM=driver.findElement(automatePIM_Locator);
	   automatePIM.click();
		
	}
	public void Automate_Add_Employee() {
		By actual_AddEmployee_Locator=By.linkText("Add Employee");
		WebElement actual_welcomeAdmin =driver.findElement(actual_AddEmployee_Locator);
		actual_welcomeAdmin.click();
	}
	public void Validate_Add_EmployeePage() {
		String expectedAddEmployeePageText = "Full Name";
		System.out.println(expectedAddEmployeePageText);
		By Validate_Add_EmployeePageLocator=By.xpath("//label[text()='Full Name']");
		WebElement Validate_Add_emp =driver.findElement(Validate_Add_EmployeePageLocator);
	    String actualAddEmployeePageText=Validate_Add_emp.getText();
	    System.out.println(actualAddEmployeePageText);
		if(actualAddEmployeePageText.equals(expectedAddEmployeePageText)) {
			System.out.println("its true");
		}
		else {
			System.out.println("its false");
		}
		//String actualAddEmployeePageText = driver.findElement(By.xpath("//h1[contains(text(),'Add Employee')]")).getText();
	
		
	}
	public void Enter_Test_data_into() throws Exception {
		
		String expectedFirstName = "FirstName";
		System.err.println(expectedFirstName);
		By firstNameLocator =By.id("firstName");
		WebElement firstNameField = driver.findElement(firstNameLocator);
		firstNameField.sendKeys("mohammed");
		String actualFirstName=firstNameField.getText();
		System.out.println(actualFirstName);
		
		
		String expectedMiddleName = "MiddleName";
		System.err.println(expectedMiddleName);
		By middleNameLocator =By.id("middleName");
		WebElement middleName = driver.findElement(middleNameLocator);
		middleName.sendKeys("malik");
		String actualMiddleName=middleName.getText();
		System.out.println(actualMiddleName);
		
		
		String expectedLastName = "LastName";
		System.err.println(expectedLastName);
		By lastNameLocator =By.id("lastName");
		WebElement lastName = driver.findElement(lastNameLocator);
		lastName.sendKeys("Maheboob");
		Thread.sleep(5000);
		String actualLastName=lastName.getText();
		System.out.println(actualLastName);
		//System.err.println(firstName);
		
		/*WebElement firstNameField = driver.findElement(By.id("firstName"));
		String expectedFirstName = "FirstName";
		firstNameField.sendKeys(expectedFirstName);

		WebElement middleNameField = driver.findElement(By.id("middleName"));
		String expectedMiddleName = "MiddleName";
		middleNameField.sendKeys(expectedMiddleName);

		WebElement lastNameField = driver.findElement(By.id("lastName"));
		String expectedLastName = "LastName";
		lastNameField.sendKeys(expectedLastName);*/
	}
	public void expected_EmployeeID(){// (get the Employee Id from the application)
//		// Step 3: Navigate to Add Employee Page
//		driver.findElement(By.id("menu_pim_viewPimModule")).click();
//		driver.findElement(By.id("menu_pim_addEmployee")).click();

		// Step 4: Get Employee ID
		String employeeID = "EmployeeID ";
		By employeeIdLocator=By.id("employeeId");
		WebElement employeeIdField = driver.findElement(By.xpath("//input[@id='employeeId']"));
		String employeeId = employeeIdField.getText();
		System.out.println("Employee ID: " + employeeId);

		
	}
	public void save() {
		By saveLocator=By.id("btnSave");
		WebElement saveButton=driver.findElement(saveLocator);
		saveButton.click();
	}
	public void WebPage_Validate(){
		String actualFirstName = "FirstName";
		String actualMiddleName = "MiddleName";
		String actualLastName = "LastName";
		String actualEmployeeID = "EmployeeId";
		
		String expectedFirstName = "First Name";
		String expectedMiddleName = "Middle Name";
		String expectedLastName = "Last Name";
		String expectedEmployeeId = "Employee Id ";
		if(actualFirstName.equals(expectedFirstName)) {
			System.out.println("it's TRUE");
		}
		else {
			System.out.println("it's FALSE");
			
		}
		if(actualMiddleName.equals(expectedMiddleName)) {
			System.out.println("it's TRUE");
		}
		else {
			System.out.println("it's FALSE");
			
		}
		if(actualLastName.equals(expectedLastName)) {
			System.out.println("it's TRUE");
		}
		else {
			System.out.println("it's FALSE");
			
		}
		if(actualEmployeeID.equals(expectedEmployeeId)) {
			System.out.println("it's TRUE");
		}
		else {
			System.out.println("it's FALSE");
			
		}
		
	}
	public void WelCome_Admin() {
		By welcomeAdminLocator=By.id("welcome");
		WebElement welcomeAdminName=driver.findElement(welcomeAdminLocator);
		welcomeAdminName.click();
		
	}
	public void logOut() throws Exception {
		Thread.sleep(3000);
		By logOutLocator=By.linkText("Logout");
		WebElement logOutOption=driver.findElement(logOutLocator);
		logOutOption.click();
		
	}
	
		public void Validate_Add_EmployeePage1() {
			By fullNameLocator=By.className("hasTopFieldHelp");
			WebElement fullName=driver.findElement(fullNameLocator);
		   String actualfullName=fullName.getText();
		System.err.println(actualfullName);
		}

	public void close() {
		
		driver.close();
		
	}
	

	

	public static void main(String[] args) throws Exception {
		 Add_Employee_OrangeHRM add_Employee = new  Add_Employee_OrangeHRM();
		add_Employee.browserLaunch();
		add_Employee.navigateOrangeHRM();
		add_Employee.validateLoginPage();
		add_Employee.loginWith_validTest_data();
		add_Employee.Validate_OrangeHRM_Application_HomePage();
		add_Employee.automatePIM();
		add_Employee.Automate_Add_Employee();
		add_Employee.Validate_Add_EmployeePage();
		add_Employee.Enter_Test_data_into();
		add_Employee.expected_EmployeeID();
		add_Employee.save();
		add_Employee.WebPage_Validate();
		add_Employee.WelCome_Admin();
		add_Employee.logOut();
		add_Employee.Validate_Add_EmployeePage1();
		add_Employee.close();
	}

}


