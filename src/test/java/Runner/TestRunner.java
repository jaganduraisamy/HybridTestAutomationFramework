package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"},
		plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}