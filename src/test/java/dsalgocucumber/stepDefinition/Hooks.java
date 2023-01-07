package dsalgocucumber.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.junit.Before;

import dsalgocucumber.baseclass.BaseClass;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseClass {
	
	
	
	@Before
	public static void before_or_after_all() {
	
		System.out.println("executing before hooks");
	log = LogManager.getLogger("StepDef");
	}
	

}
