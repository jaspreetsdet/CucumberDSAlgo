package dsalgocucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/dsalgocucumber/Feature/Queue.feature"  // features ka full path starting from src directory
		,glue={"dsalgocucumber.stepDefinition"},
		dryRun=false,
		plugin = {"pretty","html:test-output.html"}
		
		)

// yehi pattern hai remember it

public class TestRunner {


}


//for report right click on test output and open wid webbrowser