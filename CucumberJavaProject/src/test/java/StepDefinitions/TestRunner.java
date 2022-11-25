package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/GoogleSearch.feature", glue = {"StepDefinitions"}, 
monochrome=true,
plugin={"pretty", "junit:target/JUnitReports/report.xml",
		"html:target/cucumber-reports"},
tags=("@tag1 or @tag2")
)

public class TestRunner {

}