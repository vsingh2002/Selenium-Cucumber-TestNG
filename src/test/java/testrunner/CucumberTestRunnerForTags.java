package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @regression", features = { "src/test/resources/featureWithTags" }, glue = {
		"stepdefinitions" }, plugin = { "pretty", "html:target/htmlreport.html" })
public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {

}
