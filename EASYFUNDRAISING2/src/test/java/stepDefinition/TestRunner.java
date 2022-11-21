package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/Find_A_Cause.feature", monochrome = true,
plugin = {"pretty", "html:target/cucumber.html"}, glue = ("stepDefinition"))
public class TestRunner {

}
