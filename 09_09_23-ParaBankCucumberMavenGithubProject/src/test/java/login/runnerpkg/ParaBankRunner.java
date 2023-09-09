package login.runnerpkg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "Features",
				glue ="stepDefinitionpkg",
				plugin = {"pretty","html:target/oldhooksresult"})
public class ParaBankRunner {

}
