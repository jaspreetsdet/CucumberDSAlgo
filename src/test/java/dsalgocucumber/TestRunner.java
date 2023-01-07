package dsalgocucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/dsalgocucumber/Feature/Stack.feature"  
		,glue={"dsalgocucumber.stepDefinition"},
		dryRun=true,
		plugin = {"pretty","html:test-output.html"}
		
		)

public class TestRunner {


}


