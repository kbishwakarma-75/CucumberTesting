package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\kbish\\eclipse-workspace\\CucumberSeleniumTest\\src\\testRunner\\TestRunner.java"},
		glue="stepDefinitions",
		//format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		monochrome=true
		)
public class TestRunner {

}

/*@RunWith(Cucumber.class)
@Cucumber.Options( glue = { "com.app.stepdefinitions.common", "com.app.stepdefinitions.example" } )
public class ExampleFeature{
}*/