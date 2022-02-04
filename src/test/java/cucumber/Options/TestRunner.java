package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/svc/Documents/SEL/APIFramework/src/test/java/features/placeValidations.feature",
				 glue = {"stepDefinations"},
                 plugin = {"pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml"},
				 tags = "",
                 monochrome = true,
			     dryRun= false)
				 //tags = "@AddPlace")
public class TestRunner {
}

 
// Cucumber HTML Report is saved at "Target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html"

/*
 * Maven terminal/Jenkins commands 
 * mvn test verify -Dcucumber.filter.tags="@AddPlace" 
 * test verify -Dcucumber.filter.tags="--tags @AddPlace" 
 */
 
