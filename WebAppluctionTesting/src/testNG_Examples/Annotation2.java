package testNG_Examples;

import org.testng.annotations.Test;

public class Annotation2 {
	
	@Test(priority=1,description=" Testing Gmail Application Launch ")
	// description argument will describe the Operation done in the Respective Test case
	public void gmailApplicationLaunch() // its a Test case Name - Test Case
	{
		System.out.println(" *** Gmail Application Launch Successfull **** ");
	}
	
	@Test(priority=2,description=" Testing Inbox functionality of Gmail Application ")
	public void gmailApplicationInBoxTest()
	{
		System.out.println(" *** InBox Functionality Test Successfull **** ");
	}
	
	@Test(priority=5,description=" Testing Sent mail functionality ")
	public void gmailApplicationSentMailTest()
	{
		System.out.println(" *** SentMail Functionality Test Successfull ****");
	}
	
	@Test(priority=3,description=" Testing Compse mail functionality ")
	public void gmailApplicationComposeMailTest()
	{
		System.out.println(" *** ComposeMail Functionality Test Successfull ****");
	}

	@Test(enabled=false,description=" Testing Draft functionality ")
	// @Test(enabled=true) - its a default status of the Test Case
	// if a test is set with the status as "enabled=false" -its represents to a false test case
	//  and the TestNG will ignore the current Test case during the Test execution(it will skip
	//    executing the method) 
	public void gmailApplicationDraftsTest()
	{
		System.out.println(" **** Draft Functioanlity Test Successfull ***");
	}
	
	@Test(priority=6,description=" Testing Gmail Application Close ")
	public void gmailApplicationClose()
	{
		System.out.println(" ***** Gmail Application Close Successfull *****");
	}

	// Any functionality which is under Test should be written within the @Test annotation
	//  of TestNG - because it represents to a Test Case
	
	// if a class has multiple test cases then the Test case should be set with Priority or else
	//   the Test cases will be executed based on the Alphabetical order of the given Test case
	//     names depending on the Upper case and the Lower case letter of the test case names
}



