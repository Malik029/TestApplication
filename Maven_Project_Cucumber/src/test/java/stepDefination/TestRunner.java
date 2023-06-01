package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "OrangeHRMApplication",glue="stepDefination",tags="@MD",
                   
		
		
plugin = { "pretty",
"html:target/OrangeHRMApplicationReports",
"json:target/OrangeHRMApplicationJsonReport.json",
"com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
}

		
		
		
		)
public class TestRunner {

}
