package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="OHRMApplication",glue="stepDefination")

public class TestRunner {

}
