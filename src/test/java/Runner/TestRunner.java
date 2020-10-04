package Runner;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"},format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}