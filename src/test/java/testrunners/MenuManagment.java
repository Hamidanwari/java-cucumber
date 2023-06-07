package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepdefinations",
		tags = "@Systemapps",
		plugin = {"pretty",
		"html:target/SystemTestReports/html",
		"html:target/SystemTestReports/json/report.json",
		"html:target/SystemTestReports/junit/test.xml"},
		dryRun = false,
		monochrome = true
		)
public class MenuManagment {

}
