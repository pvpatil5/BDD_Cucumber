package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {".\\src\\test\\java\\feature\\Sample.feature"},
		
		glue= {"stepdefination_sample","hooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber.html"}
		//,tags = "not@smoketest or @integrationtest"
		)

public class TestRunner  extends AbstractTestNGCucumberTests
{

}
