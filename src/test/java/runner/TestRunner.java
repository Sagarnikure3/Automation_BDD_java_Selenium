package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=
	{"src/test/resources/Features"},
		glue={"stepdefinitions","Hooks"},
		plugin = {"pretty","html:target/Cucumberreport.html"}, tags="@test1666666666666666")//tags can be a scenario, can be a feature file  , can be a all feature files

public class TestRunner {

}
