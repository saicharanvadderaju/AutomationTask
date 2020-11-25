package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue= {"StepDefinations"}
,plugin = {"json:target/jsonreports/cucumber-report.json"})

//plugin = {"html:target/cucumber-html-report"}
public class RunTest {

}
