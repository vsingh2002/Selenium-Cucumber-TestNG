package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefinitions" }, plugin = { "pretty",
		"html:target/htmlreport.html" })
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
