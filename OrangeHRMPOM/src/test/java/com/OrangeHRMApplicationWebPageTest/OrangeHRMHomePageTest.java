package com.OrangeHRMApplicationWebPageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.OrangeHRMApplicationWebPage.OrangeHRMHomePage;

public class OrangeHRMHomePageTest extends OrangeHRMLogInTest {
	
	
	
	@Test(priority=3)
	public void OrangeHRMHomePageAdminTestText() throws InterruptedException, IOException {
		
		OrangeHRMLogInTest n=new OrangeHRMLogInTest();
		n.validatingLogInTest();

		OrangeHRMHomePage m1=new OrangeHRMHomePage();
		
		m1.OrangeHRMHomePageAdminTest();
		
	}

}
