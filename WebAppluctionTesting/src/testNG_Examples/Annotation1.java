package testNG_Examples;

import org.testng.annotations.Test;

public class Annotation1 {
	
	@Test // Its a Test Case 
	// Method is called as Test Case Name
	// Test Cases always executes based on the Alphabetical order of the given test case name
	// The Execution of the Test Case - will be taken as a priority starting the Upper case
	// letter of the Alphabetical Order -- then it will consider the Lower case letter Test
	//   case names
	public void method1()
	{
		System.out.println(" *** Method1 executed Successfully *** ");
	}
	
	@Test
	public void method2()
	{
		System.out.println(" *** Method2 executed Successfully *** ");
	}
	
	@Test
	public void Method3()
	{
		System.out.println(" *** Method3 executed Successfully *** ");
	}
	
	@Test
	public void Method4()
	{
		System.out.println(" *** Method4 executed Successfully *** ");
	}
}

	
	


